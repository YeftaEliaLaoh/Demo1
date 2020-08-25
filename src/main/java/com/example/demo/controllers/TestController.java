package com.example.demo.controllers;

import com.example.demo.model.User;
import com.example.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Controller
public class TestController
{
    @Autowired
    private UserService userService;

    @GetMapping("/register")
    public String register( Model model )
    {
        model.addAttribute("isRegister", "0");
        return "register";
    }

    @PostMapping("/login")
    public String login( HttpServletRequest request, Model model )
    {
        model.addAttribute("isRegister", "1");
        try
        {
            String phone
                    = ServletRequestUtils.getStringParameter(
                    request, "phone");
            String firstName
                    = ServletRequestUtils.getStringParameter(
                    request, "firstName");
            String lastName
                    = ServletRequestUtils.getStringParameter(
                    request, "lastName");
            String datetimepicker2
                    = ServletRequestUtils.getStringParameter(
                    request, "datetimepicker2");
            String datetimepicker3
                    = ServletRequestUtils.getStringParameter(
                    request, "datetimepicker3");
            String datetimepicker1
                    = ServletRequestUtils.getStringParameter(
                    request, "datetimepicker1");
            String inlineRadio1
                    = ServletRequestUtils.getStringParameter(
                    request, "inlineRadio1");
            String inlineRadio2
                    = ServletRequestUtils.getStringParameter(
                    request, "inlineRadio2");
            String email
                    = ServletRequestUtils.getStringParameter(
                    request, "email");

            User user = new User();
            user.setPhone(phone);
            user.setFirstName(firstName);
            user.setLastName(lastName);
            user.setDatetimepicker2(datetimepicker2);
            user.setDatetimepicker3(datetimepicker3);
            user.setDatetimepicker1(datetimepicker1);
            user.setInlineRadio1(inlineRadio1);
            user.setInlineRadio2(inlineRadio2);
            user.setEmail(email);
            userService.save(user);
        }
        catch ( ServletRequestBindingException e )
        {
            e.printStackTrace();
        }
        return "register";
    }
}