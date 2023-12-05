package cn.edu.tyut.cnedutyutspringmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author 羊羊
 * @ClassName FirstController
 * @SubmitTime 周二
 * @DATE 2023/12/5
 * @Time 17:19
 * @Package_Name com.example.cnedutyutspringmvc.controller
 */
@Controller
public class FirstController {
    @RequestMapping("/firstMapping")
    public String sayHello()  {
        System.out.println("访问到FirstController");
        return "success";
    }
}
