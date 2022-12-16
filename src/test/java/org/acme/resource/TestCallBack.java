package org.acme.resource;

import io.quarkus.test.junit.callback.*;

public class TestCallBack implements QuarkusTestBeforeEachCallback , QuarkusTestAfterEachCallback, QuarkusTestBeforeTestExecutionCallback ,QuarkusTestAfterConstructCallback {
    @Override
    public void beforeEach(QuarkusTestMethodContext context) {
        System.out.println("beforeEach " + context.getTestMethod());
    }

    @Override
    public void afterConstruct(Object testInstance) {
        System.out.println("afterConstruct " + testInstance);
    }

    @Override
    public void afterEach(QuarkusTestMethodContext context) {
        System.out.println("afterEach " + context.getTestMethod());
    }

    @Override
    public void beforeTestExecution(QuarkusTestMethodContext context) {
        System.out.println("beforeTestExecution " + context.getTestMethod());
    }
}
