package org.cdac.repositories;

import org.cdac.models.Users;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


/**
 * Created by grohit on 9/5/2015.
 */

@Repository
public class DummyRepository {
    Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    GenericRepository<Users, Integer> genericRepository;

    public Integer save(Users user) {
        return (Integer) genericRepository.save(user);
    }

}
