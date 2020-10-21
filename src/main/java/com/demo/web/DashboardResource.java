package com.demo.web;

import com.demo.domain.User;
import com.demo.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class DashboardResource {

    @Autowired
    private AdminService adminService;

    @GetMapping("/dashboard")
    public String getDashboard(@AuthenticationPrincipal User user) {
        System.out.println("User = " + user);

        List<User> allUserAccounts = adminService.getAllUserAccounts();

        return "dashboard";
    }
}
