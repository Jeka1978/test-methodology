package com.epam.jeka.testmethodology;

import org.springframework.context.annotation.Conditional;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Retention(RUNTIME)
@Conditional({OnNotTestEnvironmentCondition.class})
public @interface ConditionalOnNotTestEnvironment {
}
