package cn.edu.tyut.cnedutyutspringmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author 羊羊
 * @ClassName SecondController
 * @SubmitTime 周三
 * @DATE 2023/12/6
 * @Time 15:19
 * @Package_Name cn.edu.tyut.cnedutyutspringmvc.controller
 */
@Controller
@RequestMapping("/secondMapping")
public class SecondController {
    @ResponseBody
    @RequestMapping(value = {"/a", "/b"}, params = "id=1")
    public String doubleRequestMapping() {
        System.out.println("在类和方法上同时添加@RequestMapping注解");
        return "在类和方法上同时添加@RequestMapping注解";
    }
}
