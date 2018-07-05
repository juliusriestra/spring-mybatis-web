package pe.egcc.ventas.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import pe.com.productos.model.UsuarioBean;
import pe.com.productos.service.ProductoService;
import pe.com.productos.service.UsuarioService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:/spring/root-context.xml")
public class UsuarioTest {

	@Autowired
	private static UsuarioService usuarioService;
	
	@Autowired
	private static ProductoService productoService;
	
	@BeforeClass
	public static void setup(){
		usuarioService = new UsuarioService();
	}
	
	@AfterClass
	public static void teardown(){
		usuarioService = null;
	}
	@Test
	public void validar() {
		UsuarioBean userBean = new UsuarioBean();
		userBean = usuarioService.validar("jriestra","suerte");
		assert(userBean!=null);
		assert(userBean.getUsuario().equals("jriestra"));
		if (userBean!=null) {
			System.out.println(userBean.getUsuario()+ " "+userBean.getIdusu());
		}
		
	}

}
