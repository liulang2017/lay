package com.ll.demo.lay;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class LayController {

    @RequestMapping(value = "/login.do")
    public ModelAndView index(HttpServletRequest req, HttpServletResponse res){
        ModelAndView retVal = new ModelAndView("index.html");
        return retVal;
    }

    @RequestMapping(value = "/index.do")
    public void  hello(HttpServletRequest req, HttpServletResponse res) throws IOException {
        String str = "It' work!";
        res.setContentType("application/json; charset=UTF-8");
        res.getWriter().write(str.toString());
    }

    @RequestMapping(value = "/error.do")
    public void  error(HttpServletRequest req, HttpServletResponse res) throws IOException {
        String str = "error!";
        res.setContentType("application/json; charset=UTF-8");
        res.getWriter().write(str.toString());
    }
}
