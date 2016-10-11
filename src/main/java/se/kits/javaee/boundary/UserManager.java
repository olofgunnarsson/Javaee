package se.kits.javaee.boundary;

import se.kits.javaee.entity.User;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class UserManager {

    @PersistenceContext(name = "ds")
    private EntityManager em;


    public User find(Long id) {
        return em.createNamedQuery("findUserById", User.class)
                .setParameter("id", id)
                .getSingleResult();
    }

    public User create(String name) {
        return em.merge(new User(name));
    }
}
