package com.controller;

import com.student.manager.DAO.StudentDAO;
import com.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@Controller
public class HelloController {

    private final StudentDAO studentDAO;

    public HelloController(StudentDAO studentDAO) {
        this.studentDAO = studentDAO;
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

        modelMap.addAttribute("shows",studentDAO.selectAll());
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

        studentDAO.insert(std);
        modelMap.addAttribute("add","Welcome to Insert page");
        return "redirect:/show";
    }
    @GetMapping(value = "/edit/{id}")
    public String EditStudent(@PathVariable("id") int id, ModelMap modelMap) throws SQLException {
       // StudentDAO studentDAO = new StudentDAOImp();
        List<Student> students = studentDAO.selectBiId(id);
        modelMap.addAttribute("student", students);
        return "EditStudent";
    }

    @PostMapping(value = "/edit/{id}")
    public String EditedStudent(@PathVariable("id") int id,
                                @RequestParam("firstName") String fname,
                                @RequestParam("lastName") String lname,
                                @RequestParam("email") String email,
                                @RequestParam("status") String status) throws SQLException {
        //StudentDAO studentDAO = new StudentDAOImp();
        Student std = new Student(id, fname, lname, email, status);
        studentDAO.update(std);
        return "redirect:/show";
    }
    @GetMapping(value = "/delete/{id}")
    public String DeleteStudent(@PathVariable("id") int id, ModelMap modelMap) throws SQLException {
        //StudentDAO st = new StudentDAOImp();
        studentDAO.delete(id);
        modelMap.addAttribute("del","Welcome to Delete page");
        return "redirect:/show";
    }

}