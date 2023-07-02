package progremmerbeginner.jpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import org.junit.jupiter.api.Test;
import progremmerbeginner.jpa.entity.Customer;
import progremmerbeginner.jpa.util.JpaUtil;

public class DataTypeTest {
    @Test
    void testDataType() {

        EntityManagerFactory entityManagerFactory = JpaUtil.getEntityManagerFactory();
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();

        Customer customer = new Customer();
        customer.setId("2");
        customer.setName("budi");
        customer.setAge(30);
        customer.setMarried(true);
        entityManager.persist(customer);

        entityTransaction.commit();
        entityManager.close();

    }
}
