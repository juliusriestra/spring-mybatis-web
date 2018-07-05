package pe.com.productos.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import pe.com.productos.model.CategoriaBean;
import pe.com.productos.model.ProductoBean;
import pe.com.productos.service.ProductoService;

@Controller
public class ProductoController {
	private static final Logger logger = LoggerFactory.getLogger(ProductoController.class);
	
	@Autowired
	private ProductoService productoService;
	
	@RequestMapping(value = "conProductos.htm", method = RequestMethod.GET)
	public ModelAndView getProductos(){
		ModelAndView mv = new ModelAndView("conProductos");
		List<ProductoBean> productos = productoService.traerTodos();
		mv.addObject("productos",productos);
		return mv;
	}
	
	@RequestMapping(value = "insProducto.htm", method = RequestMethod.GET)
	public ModelAndView insertarProducto(){
		ModelAndView mv = new ModelAndView("insProducto");
		List<CategoriaBean> categorias = productoService.traerCategorias();
		mv.addObject("categorias", categorias);
		return mv;
		
	}
	
	@RequestMapping(value = "insProductoGrabar.htm", method = RequestMethod.POST)
	public ModelAndView grabarProducto(@ModelAttribute("productoBean") ProductoBean productoBean){
		ModelAndView mv = new ModelAndView("insProducto");
		try {
			productoService.insertar(productoBean);
			mv.addObject("msg", "Proceso ok. ID = " + productoBean.getIdprod() + ".");
		} catch (Exception e) {
			mv.addObject("error", e.getMessage());
		}
		List<CategoriaBean> categorias = productoService.traerCategorias();
		mv.addObject("categorias", categorias);
		return mv;		
	}
}
