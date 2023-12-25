package com.rizvankarimov.spring.mvc;

import jakarta.servlet.http.HttpServletRequest;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/employee") // bu controllerin URL-nin önünde /employee yazilacaq
public class MyController {

    @RequestMapping("/")
    public String showFirstView(){
        return "myFirstView";
    }


    @RequestMapping("/askDetails")
    public String askEmployeeDetails(){
        return "ask-emp-details-view";
    }

    @RequestMapping("/showDetails")
    public String showEmpDetails(@RequestParam("employeeName") String empName, Model model){
        empName = "Mr. " + empName;
        model.addAttribute("nameAttribute", empName);
        model.addAttribute("description", "- is software engineer");



//    @RequestMapping("/showDetails")
//    public String showEmpDetails(){
//        return "show-emp-details-view";
//    }

//    @RequestMapping("/showDetails")
//    public String showEmpDetails(@NotNull HttpServletRequest request, Model model){String empName = request.getParameter("employeeName");
//         empName = "Mr." + empName; // prefix/suffix elave etmek ucun
//         model.addAttribute("nameAttribute", empName); // nameAttribute - bu name attribute olacaq html de
//
//         model.addAttribute("description", "- is java developer"); // description - bu name attribute olacaq html de







        return "show-emp-details-view";
    }
}
