package progremmerbeginner.jpa;

import jakarta.persistence.EntityManagerFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import progremmerbeginner.jpa.util.JpaUtil;

public class EntityManagerFactoryTest {

    @Test
    void create() {
        EntityManagerFactory entityManagerFactory = JpaUtil.getEntityManagerFactory();

        Assertions.assertNotNull(entityManagerFactory);
    }
}
