package cn.edu.tyut.cnedutyutspringmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author 羊羊
 * @ClassName MethodController
 * @SubmitTime 周三
 * @DATE 2023/12/6
 * @Time 15:40
 * @Package_Name cn.edu.tyut.cnedutyutspringmvc.controller
 */
@Controller
@RequestMapping("/method")
public class MethodController {
    @RequestMapping(method = RequestMethod.GET)
    public void get() {
        System.out.println("RequestMethod.GET");
    }

    @RequestMapping(method = RequestMethod.POST)
    public void post() {
        System.out.println("RequestMethod.POST");
    }

    @RequestMapping(method = RequestMethod.PUT)
    public void put() {
        System.out.println("RequestMethod.PUT");
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public void delete() {
        System.out.println("RequestMethod.DELETE");
    }
    @RequestMapping(method = {RequestMethod.PATCH, RequestMethod.HEAD})
    public void patchAndHead() {
        System.out.println("RequestMethod.PATCH + RequestMethod.HEAD");
    }
}
