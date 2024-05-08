package com.student.manage.controller;

import com.student.manager.DAO.StudentDAO;
import com.student.manager.DAO.StudentDAOImp;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.sql.SQLException;

@Controller
public class HelloController {

    private final HttpServletRequest httpServletRequest;

    public HelloController(HttpServletRequest httpServletRequest) {
        this.httpServletRequest = httpServletRequest;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String printHelloWorld(ModelMap modelMap){

        // add attribute to load modelMap
        modelMap.addAttribute("message",
                "Hello World and Welcome to Spring MVC!");

        // return the name of the file to be loaded "hello_world.jsp"
        return "hello_world";
    }
    @GetMapping(value = "/show")
    public String Show(ModelMap modelMap) throws SQLException {
        StudentDAO st = new StudentDAOImp();
        modelMap.addAttribute("shows",st.selectAll());
        return "Show";
    }
    @GetMapping(value = "/add")
    public String AddStudent(ModelMap modelMap){
        modelMap.addAttribute("add","Welcome to Insert page");
        return "AddStudent";
    }
    @GetMapping(value = "/edit")
    public String EditStudent(ModelMap modelMap){
        modelMap.addAttribute("edit","Welcome to Edit page");
        return "EditStudent";
    }
    @GetMapping(value = "/delete/{id}")
    public String DeleteStudent(@PathVariable("id") int id, ModelMap modelMap) throws SQLException {
        StudentDAO st = new StudentDAOImp();
        st.delete(id);
        modelMap.addAttribute("del","Welcome to Delete page");
        return "redirect:/show";
    }

}