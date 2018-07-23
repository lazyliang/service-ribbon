package com.ll.serviceribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Create by ll on 2018/5/15.
 */
@Service
public class HelloService {
   @Autowired
    RestTemplate restTemplate;

   public String hiService(String name){
       return restTemplate.getForObject("http://SERVICE-HI/hi?name="+name,String.class);
   }
}
