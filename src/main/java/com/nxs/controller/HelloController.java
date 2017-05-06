package com.nxs.controller;

import com.nxs.properties.GirlProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by 57014 on 2017/3/24.
 */
@RestController
@RequestMapping("/hello")
public class HelloController {
    @Autowired
    private GirlProperties girlProperties;


   // @RequestMapping(value = "say" ,method = RequestMethod.POST)
    @PostMapping("say")
    public String say(@RequestParam(value = "id",required = false,defaultValue = "0") Integer id){
        return "id:" + id;
        //return girlProperties.getCupSize() + girlProperties.getAge();
        //return "index";
    }
}
