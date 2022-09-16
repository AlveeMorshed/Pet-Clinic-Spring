package guru.springframework.petclinicspring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {
    @RequestMapping({"/vets","/vets/indexVetsList","/vets/indexVetsList.html"})
    public String listVets(){
        return "vets/indexVetsList";
    }
}
