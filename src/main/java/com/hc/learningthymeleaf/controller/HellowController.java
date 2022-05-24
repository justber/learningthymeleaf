package com.hc.learningthymeleaf.controller;

import com.hc.learningthymeleaf.Entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hc
 * @date 2022/5/24 19:25
 */
@Controller
public class HellowController {
    @RequestMapping("/hellow")
    public String hellowController(Model model){
        List<Student> students = new ArrayList<>();
       /* students.add(new Student("李四",12));
        students.add(new Student("张安",34));
        students.add(new Student("武力",36));
        students.add(new Student("五航",54));*/
        return "hello";
    }
}
