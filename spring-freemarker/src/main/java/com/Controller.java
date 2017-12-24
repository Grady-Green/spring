package com;

import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description:
 * @Todo:
 * @Author Grady
 * Created on 2017/12/12.
 */
@org.springframework.stereotype.Controller
@RequestMapping("/")
public class Controller {

    @RequestMapping("/")
    public String test(Model model){
        ModelMap modelMap = new ModelMap();
        modelMap.addAttribute("name","gongyu");

//        model.addAttribute("name","gongyu");
        return "index";
    }
}
