package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HellowWorldContoller {

    @RequestMapping("/go")
    public ModelAndView go(){
        ModelAndView mv = new ModelAndView("hello");
        return mv;
    }
}