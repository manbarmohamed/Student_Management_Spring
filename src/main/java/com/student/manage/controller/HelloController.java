package com.student.manage.controller;

import com.student.manager.DAO.StudentDAO;
import com.student.manager.DAO.StudentDAOImp;
import com.student.manager.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

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
    public String addStudentPage() {
        return "AddStudent";
    }
    @PostMapping(value = "/add")
    public String AddStudent(@RequestParam("firstName") String fname,
                             @RequestParam("lastName") String lname,
                             @RequestParam("email") String email,
                             @RequestParam("status") String status,
                             ModelMap modelMap) throws SQLException {

        Student std = new Student(fname,lname,email,status);
        StudentDAO st = new StudentDAOImp();
        st.insert(std);
        modelMap.addAttribute("add","Welcome to Insert page");
        return "redirect:/show";
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