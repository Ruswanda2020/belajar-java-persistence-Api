package progremmerbeginner.jpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import org.junit.jupiter.api.Test;
import progremmerbeginner.jpa.entity.Customer;
import progremmerbeginner.jpa.util.JpaUtil;

public class ColumnTest {
    @Test
    void column() {

        EntityManagerFactory entityManagerFactory = JpaUtil.getEntityManagerFactory();
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();

        Customer customer = new Customer();
        customer.setId("1");
        customer.setName("wanda");
        customer.setPrimaryEmail("example@gmail.com");

        entityManager.persist(customer);

        entityTransaction.commit();
        entityManager.close();
    }
    @Test
    void transientTest() {

        EntityManagerFactory entityManagerFactory = JpaUtil.getEntityManagerFactory();
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();

        Customer customer = new Customer();
        customer.setId("4");
        customer.setName("wanda");
        customer.setPrimaryEmail("example@gmail.com");
        customer.setFullName("ruswanda dirgantara ");

        entityManager.persist(customer);

        entityTransaction.commit();
        entityManager.close();
    }
}
