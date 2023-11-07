package projectMVC;

    import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.RestController;

	@RestController
	public class JsonController {

	    @GetMapping("/dados-json")
	    public Modelo dadosJson() {
	        Modelo modelo = new Modelo();
	        modelo.setNome("Exemplo de Nome em JSON");
	        modelo.setIdade(25);
	        return modelo;
	    }
	}

