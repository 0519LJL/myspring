package myproject.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liuzhaoliang on 2017/6/21.
 */
@RestController
public class HelloWorldController {
    @RequestMapping("/helloworld")
    public String SayHi(){
        return "Hello World !";
    }
}
