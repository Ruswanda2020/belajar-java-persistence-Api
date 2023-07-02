package progremmerbeginner.jpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import progremmerbeginner.jpa.util.JpaUtil;

public class EntityTransactionTest {
    @Test
    void testTransaction() {

        EntityManagerFactory entityManagerFactory = JpaUtil.getEntityManagerFactory();
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        jakarta.persistence.EntityTransaction entityTransaction = entityManager.getTransaction();

        Assertions.assertNotNull(entityTransaction);

        try {
            entityTransaction.begin();
            //do something
            entityTransaction.commit();

        }catch (Throwable throwable){
            entityTransaction.rollback();
        }

        entityManager.close();
    }
}
