package com.nextflow.api.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class TransacaoController {
    

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public String hello(){
        return "Hello Word ipokp";
    }
}
