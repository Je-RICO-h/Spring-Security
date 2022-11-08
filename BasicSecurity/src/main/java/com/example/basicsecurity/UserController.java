package com.example.basicsecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/user")
    public String home()
    {
        return "User Site";
    }

    @GetMapping("/admin")
    public String admin()
    {
        return "Admin Site";
    }
}
