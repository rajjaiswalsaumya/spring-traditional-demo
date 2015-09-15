package org.cdac.repositories;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

/**
 * Created by grohit on 9/13/2015.
 */

@Repository
public class GenericRepositoryImpl<T, ID extends Serializable> implements GenericRepository<T, ID> {
    SessionFactory sessionFactory;
    Logger logger = LoggerFactory.getLogger(getClass());
    private Class<T> clazz;

    public GenericRepositoryImpl() {
    }

    public final void setClazz(Class<T> clazzToSet) {
        this.clazz = clazzToSet;
    }

    public T findOne(ID id) {
        return (T) getCurrentSession().get(clazz, id);
    }

    public List<T> findAll() {
        return getCurrentSession().createQuery("from " + clazz.getName()).list();
    }

    public ID save(T entity) {
        return (ID) getCurrentSession().save(entity);
    }

    public void update(T entity) {
        getCurrentSession().update(entity);
    }

    public void delete(T entity) {
        getCurrentSession().delete(entity);
    }

    public void deleteById(ID entityId) {
        T entity = findOne(entityId);
        delete(entity);
    }

    protected final Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
        logger.info("SessionFactory is: {}", (sessionFactory == null) ? "null" : sessionFactory);
    }
}
