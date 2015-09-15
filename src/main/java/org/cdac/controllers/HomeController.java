package org.cdac.controllers;

import org.cdac.models.Users;
import org.cdac.services.DummyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by grohit on 9/1/15.
 */

@Controller
public class HomeController {
    Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    DummyService service;

    public HomeController() {
        logger.trace("Init {}", getClass());
    }

    @RequestMapping(value = {"/index"})
    public String index() {
        return "index";
    }

    @RequestMapping(value = {"/create"}, method = RequestMethod.POST)
    @ResponseBody
    @ResponseStatus(HttpStatus.CREATED)
    public Integer createUser(Users users) {
        return service.saveUser(users);
    }

}
