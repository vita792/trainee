package main.java.com.trainee;

import main.java.com.trainee.exception.MyException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class HibernatePC {
    private EntytyManagerFactory enf;

    private void methodForPersist(Object o) throws MyException {
        EntityManager em = enf.createEntitytManager();
        em.getTransaction().begin();
        try {
            o.apply(em);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw new MyException("PollBack", e);
        } finally {
            em.close();
        }
    }
}