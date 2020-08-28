import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class App {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("snal");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        Animal a1 = new Animal();
        a1.setId(1);
        a1.setName("lion");
        entityTransaction.begin();
        entityManager.persist(a1);
        entityTransaction.commit();
        System.out.println("Animal is committed");
    }
}
