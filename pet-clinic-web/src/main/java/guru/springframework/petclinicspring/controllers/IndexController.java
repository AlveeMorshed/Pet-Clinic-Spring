package guru.springframework.petclinicspring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    //When there's a request for root context or root slash,
    //so that it matches to this RequestMapping
    @RequestMapping({"","/","index","index.html"})
    public String index(){
        return "index";
    }
}
