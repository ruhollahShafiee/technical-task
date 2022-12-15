package org.acme.repository;


import io.quarkus.test.TestTransaction;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;


@QuarkusTest
public class SmartModelTest {

    @Test
    @TestTransaction
    public void shouldFindSmartObjectById(){


        SmartModel smartModel=new SmartModel();
        smartModel.persist();
        SmartModel.findAll();
//        assertThat(foundUser)
//                .isNotEmpty()
//                .map(u -> u.email)
//                .contains("asotobu@example.com");
    }
}
