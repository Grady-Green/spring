package com.controller;

import com.config.ReadConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Todo:
 * @Author Grady
 * Created on 2017/11/7.
 */
@RestController
@RequestMapping("/config")
public class ConfigController {
    @Autowired
    private ReadConfiguration readConfiguration;

    @Value("${application.user.tall}")
    private Integer tall;

    @GetMapping("default")
    public String getConfig(){
        return readConfiguration.getName()+": "+ readConfiguration.getAge()+" - "+ readConfiguration.getCity()+"   "+tall;
    }
}
