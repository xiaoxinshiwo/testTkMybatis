package com.xiaoxin.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import com.xiaoxin.domain.User;
import com.xiaoxin.domain.UserTk;
import com.xiaoxin.service.UserService;
import lombok.extern.log4j.Log4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;  
import org.springframework.web.bind.annotation.RequestMapping;  
  

@Controller  
@RequestMapping("/user")
@Log4j
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("/showUser")
    public String toIndex(HttpServletRequest request, Model model) {
        int userId = Integer.parseInt(request.getParameter("id"));
        log.debug("userId:"+userId);
        User user = this.userService.getUserById(userId);
        model.addAttribute("user", user);
        UserTk userTk = this.userService.getUserTkById(userId);
        model.addAttribute("userTk", userTk);
        return "showUser";
    }
}