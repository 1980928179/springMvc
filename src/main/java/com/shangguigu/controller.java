package com.shangguigu;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class controller {
    @RequestMapping("/")
   public String indexre()
   {
       return "index";
   }
    @RequestMapping(value = "/tra",params = {"admin==123"})
    public String trare()
    {
        return "tra";
    }

    @RequestMapping(value = "/actionpost",method = RequestMethod.POST)
    public String hetrare()
    {
        return "tra";
    }
}
