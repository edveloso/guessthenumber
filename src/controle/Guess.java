package controle;

import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class Guess {
   
	private int numeroGerado;
	private int tentativa;
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String home(Model model){
		numeroGerado = new Random().nextInt(10);
		System.out.println(numeroGerado);
		return "home";
	}
	
	@RequestMapping(value="valida")
	public String valida(Integer numero, Model model){
		tentativa++;
		
		if(tentativa < 3){
			model.addAttribute("mensagem", "Voce errou, tente novamente!");
		}
		else 
			if(tentativa == 3){
				model.addAttribute("mensagem", "Errou denovo, o nœmero Ž "+ numeroGerado);
			}
		
		if( numero == numeroGerado )
			model.addAttribute("mensagem", "Voce acertou");
			
		return "home";
	}
	
}







