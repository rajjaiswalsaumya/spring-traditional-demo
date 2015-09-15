package org.cdac.controllers;

import org.cdac.models.ServiceVersion;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by grohit on 9/13/2015.
 */

@RestController
public class ServiceVersionController {

    @RequestMapping(value = "/rest")
    public ServiceVersion version() {
        return new ServiceVersion("1.0.0.0");
    }

}
