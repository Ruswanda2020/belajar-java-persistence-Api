package progremmerbeginner.jpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import org.junit.jupiter.api.Test;
import progremmerbeginner.jpa.entity.Customer;
import progremmerbeginner.jpa.entity.Image;
import progremmerbeginner.jpa.util.JpaUtil;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class LargeObjectTest {

    @Test
    void testLargeObject() throws IOException {

        EntityManagerFactory entityManagerFactory = JpaUtil.getEntityManagerFactory();
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();

        Image image = new Image();
        image.setName("image example");
        image.setDescription("description image example ");

        InputStream inputStream = getClass().getResourceAsStream("/images/dudis.png");
        byte[] bytes = inputStream.readAllBytes();

        image.setImage(bytes);

        entityManager.persist(image);



        entityTransaction.commit();
        entityManager.close();
    }
}
