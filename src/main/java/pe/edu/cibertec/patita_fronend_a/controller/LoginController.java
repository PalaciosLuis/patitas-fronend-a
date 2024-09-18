package pe.edu.cibertec.patita_fronend_a.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pe.edu.cibertec.patita_fronend_a.viewModel.LoginModel;

import javax.print.attribute.standard.PresentationDirection;

@Controller

@RequestMapping("/login")

public class LoginController {


    @GetMapping("/inicio")

    public String inicio(Model model) {
        LoginModel loginModel = new LoginModel("00", "e", "usuario1");
        model.addAttribute("loginModel", loginModel);

        return "inicio";

    }

    @PostMapping("/autenticar")
    public String autenticar(@RequestParam("tipoDocumento") String tipoDocumento,
                             @RequestParam("numeroDocumento") String documento,
                             @RequestParam("password") String password,
                             Model model) {
        LoginModel loginModel = new LoginModel("00", "e", "Luis palacios");
        model.addAttribute("loginModel", loginModel);

        return "autenticar";
    }


}