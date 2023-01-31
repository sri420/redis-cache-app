package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Service;


@Service(value="DemoService")
public class DemoService {


public String getUser(String userId) {
  System.out.println("***Fetching from Source: " + userId);
  return "Welcome: " + userId;
}


}