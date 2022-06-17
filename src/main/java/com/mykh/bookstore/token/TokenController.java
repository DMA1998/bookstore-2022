package com.mykh.bookstore.token;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("api/v1/token")
public class TokenController {

    @GetMapping(path = "/view")
    public String tokenView() {
        return "tokenConfirmation";
    }
}
