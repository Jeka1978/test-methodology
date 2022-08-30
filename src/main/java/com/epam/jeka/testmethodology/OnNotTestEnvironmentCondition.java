package com.epam.jeka.testmethodology;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Arrays;

public class OnNotTestEnvironmentCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        return Arrays.stream(Thread.currentThread().getStackTrace()).noneMatch(element -> element.getClassName().startsWith("org.junit."));
    }
}
