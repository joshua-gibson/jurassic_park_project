package com.codeclan.jurassicpark.back_end.repositories.DinosaurRepository;

import com.codeclan.jurassicpark.back_end.enums.DietType;
import com.codeclan.jurassicpark.back_end.models.Dinosaur;
import com.codeclan.jurassicpark.back_end.models.Paddock;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

public class DinosaurRepositoryImpl implements DinosaurRepositoryCustom {

    @Autowired
    EntityManager entityManager;

    @Transactional
    public List<Dinosaur> getAllDinosaursWithPaddockId(Long paddockId) {
        List<Dinosaur> results = null;
        Session session = entityManager.unwrap(Session.class);
        try {
            Criteria cr = session.createCriteria(Dinosaur.class);
            cr.createAlias("paddock", "paddock");
            cr.add(Restrictions.eq("paddock.id", paddockId));
            results = cr.list();
        } catch (HibernateException ex) {
            ex.printStackTrace();
        } finally {
            session.close();
        }
        return results;
    }

    @Transactional
    public List<Dinosaur> findDinosaursByDietType(DietType dietType) {
        List<Dinosaur> results = null;
        Session session = entityManager.unwrap(Session.class);
        try {
            Criteria cr = session.createCriteria(Dinosaur.class);
            cr.createAlias("species", "species");
            cr.add(Restrictions.eq("species.dietType", dietType));
            results = cr.list();
        } catch (HibernateException ex) {
            ex.printStackTrace();
        } finally {
            session.close();
        }
        return results;
    }

}
