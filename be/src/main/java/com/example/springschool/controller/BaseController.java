package com.example.springschool.controller;

import com.example.springschool.properties.CommonProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BaseController {
    @Autowired
    protected CommonProperties commonProperties;
}