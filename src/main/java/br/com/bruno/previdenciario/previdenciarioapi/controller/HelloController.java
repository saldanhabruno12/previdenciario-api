package br.com.bruno.previdenciario.previdenciarioapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

//teste de api
@RestController
public class HelloController {

    @GetMapping("/hello")
    public Map<String, String> hello() {

        Map<String, String> response = new HashMap<>();
        response.put("message", "API Previdenciária está funcionandoooo!");

        return response;
    }
}
