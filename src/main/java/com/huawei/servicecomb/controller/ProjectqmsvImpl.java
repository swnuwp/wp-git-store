package com.huawei.servicecomb.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2019-04-24T08:45:46.536Z")

@RestSchema(schemaId = "projectqmsv")
@RequestMapping(path = "/rest", produces = MediaType.APPLICATION_JSON)
public class ProjectqmsvImpl {

    @Autowired
    private ProjectqmsvDelegate userProjectqmsvDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userProjectqmsvDelegate.helloworld(name);
    }

}
