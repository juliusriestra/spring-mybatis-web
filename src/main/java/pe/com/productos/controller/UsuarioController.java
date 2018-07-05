package pe.com.productos.controller;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import pe.com.productos.service.UsuarioService;

@Controller
public class UsuarioController {
	
	private static final Logger logger = LoggerFactory.getLogger(UsuarioController.class);
	
	@Autowired
	private UsuarioService usuarioService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
	  return "home";
	}
	
	@RequestMapping(value = "main.htm", method = RequestMethod.GET)
	public String main(){
		return "main";
	}
	
	@RequestMapping(value = "ingreso.htm", method = RequestMethod.POST)
	public ModelAndView login(@RequestParam("usuario") String usuario, @RequestParam("clave") String clave, HttpServletRequest request){
			ModelAndView mv = new ModelAndView();
			String destino = null;
			try {
				usuarioService.validar(usuario, clave);
				destino = "main";
			} catch (Exception e) {
				destino = "home";
				mv.addObject("error", e.getMessage());
			}
			mv.setViewName(destino);
			return mv;	
	}
}
