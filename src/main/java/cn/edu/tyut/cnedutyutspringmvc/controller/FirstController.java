package cn.edu.tyut.cnedutyutspringmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

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
    /**
     * RequestMapping注解为Handler（处理器）提供必要的映射信息，将请求的URL映射到具体的处理方法
     * GetMapping是基于请求方式的URL路径映射
     * @return 页面
     */
    @GetMapping("/firstMapping")
    public String sayHello()  {
        System.out.println("访问到FirstController");
        return "success";
    }
}
