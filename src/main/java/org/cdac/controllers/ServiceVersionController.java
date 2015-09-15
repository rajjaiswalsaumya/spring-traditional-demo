package org.cdac.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

/**
 * Created by grohit on 9/13/2015.
 */

@RestController
public class ServiceVersionController {

    @RequestMapping(value = "/rest")
    public Map<String, String> version() {
        return Collections.singletonMap("version", "1.0.0.0");
    }

}
