/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author VietDiep
 */
@Controller
@RequestMapping("hello")
public class HelloController {
    
    @RequestMapping(method = RequestMethod.GET)
    public String helloWorld(ModelMap modelMap) {
        modelMap.put("quang", "Shop Ban Hang");
        return "index";
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/aothun")
    public String helloWorld2(ModelMap modelMap) {
        modelMap.put("quang", "Shop Ban Hang");
        return "aothun";
    }
}
