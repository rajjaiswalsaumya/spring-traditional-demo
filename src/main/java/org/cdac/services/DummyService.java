package org.cdac.services;

import org.cdac.models.Users;
import org.cdac.repositories.DummyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by grohit on 9/5/2015.
 */

@Service
@Transactional(propagation = Propagation.SUPPORTS)
public class DummyService {

    @Autowired
    DummyRepository repository;

    public Integer saveUser(Users user) {
        return repository.save(user);
    }


}
