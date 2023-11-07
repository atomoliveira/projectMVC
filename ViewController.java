package projectMVC;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

    @GetMapping("/pagina")
    public String pagina(Model model) {
        Modelo modelo = new Modelo();
        modelo.setNome("Exemplo de Nome");
        modelo.setIdade(30);
        model.addAttribute("modelo", modelo);
        return "pagina";
    }
}
