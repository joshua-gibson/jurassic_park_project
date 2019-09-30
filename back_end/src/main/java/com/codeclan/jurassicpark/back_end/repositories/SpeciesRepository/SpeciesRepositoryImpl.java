package com.codeclan.jurassicpark.back_end.repositories.SpeciesRepository;

import com.codeclan.jurassicpark.back_end.enums.DietType;
import com.codeclan.jurassicpark.back_end.models.Dinosaur;
import com.codeclan.jurassicpark.back_end.models.Species;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

public class SpeciesRepositoryImpl {
    @Autowired
    EntityManager entityManager;

    @Transactional
    public List<Species> getAllSpeciesWithDietType(String dietType) {
        List<Species> results = null;
        Session session = entityManager.unwrap(Session.class);
        try {
            Criteria cr = session.createCriteria(Species.class);
            //cr.createAlias("species", "species");
            cr.add(Restrictions.eq("dietType", DietType.valueOf(dietType)));
            results = cr.list();
        } catch (HibernateException ex) {
            ex.printStackTrace();
        } finally {
            session.close();
        }
        return results;
    }
}
