package br.gov.rn.saogoncalo.smtsisapi.resources;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {

    @ResponseBody
    @GetMapping("/index")
    public String helloWorld(){

        return "API da Tributação de São Gonçalo do Amarante!";
    }
}
