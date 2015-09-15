package org.cdac.repositories;

import java.io.Serializable;
import java.util.List;

/**
 * Created by grohit on 9/13/2015.
 */
public interface GenericRepository<T, ID extends Serializable> {

    T findOne(final ID entityId);

    List<T> findAll();

    ID save(final T entity);

    void update(final T entity);

    void delete(final T entity);

    void deleteById(final ID entityId);
}
