package guru.springframework.petclinicspring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@RequestMapping("/owners")
@Controller
public class OwnerController {
    @RequestMapping({"","/","/indexOwnersList","/indexOwnersList.html"})
    public String listVets(){
        return "owners/indexOwnersList";
    }
}
