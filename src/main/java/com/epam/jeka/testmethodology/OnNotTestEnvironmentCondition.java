package com.epam.jeka.testmethodology;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Arrays;

public class OnNotTestEnvironmentCondition implements Condition {
    private static Boolean answer;

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        if (answer != null) {
            return answer;
        }
        String ignoreTestEnvironment = context.getEnvironment().getProperty("ignore.onTestEnvironmentCondition");
        if (ignoreTestEnvironment != null && ignoreTestEnvironment.equalsIgnoreCase("true")) {
            answer = true;
            return true;
        }
        answer = Arrays.stream(Thread.currentThread().getStackTrace()).noneMatch(element -> element.getClassName().startsWith("org.junit."));
        return answer;
    }
}
