/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author MyPC
 */
@RestController
@RequestMapping(value = {"client", "cli"})
public class ClientController {

    @Autowired
    private RestTemplate restTemplate;

    @Bean
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    public String hello() {
        return restTemplate.getForEntity("http://windows-cviaf5m:8762/hi?name=xxxx", String.class).getBody();
    }

}
