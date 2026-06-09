package br.com.java.aws.JavaAws;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
public class controller {

    @GetMapping
    public String response(){
        System.out.println("ok");
        return "ok";
    }
}
