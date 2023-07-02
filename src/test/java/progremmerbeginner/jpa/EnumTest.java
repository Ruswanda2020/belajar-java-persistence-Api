package progremmerbeginner.jpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import org.junit.jupiter.api.Test;
import progremmerbeginner.jpa.entity.Customer;
import progremmerbeginner.jpa.entity.CustomersType;
import progremmerbeginner.jpa.util.JpaUtil;

public class EnumTest {

    @Test
    void enumTest() {

        EntityManagerFactory entityManagerFactory = JpaUtil.getEntityManagerFactory();
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();

        Customer customer = new Customer();
        customer.setId("3");
        customer.setName("joko");
        customer.setPrimaryEmail("example1@gmail.com");
        customer.setAge(30);
        customer.setMarried(false);
        customer.setType(CustomersType.PREMIUM);

        entityManager.persist(customer);

        entityTransaction.commit();
        entityManager.close();
    }
}
