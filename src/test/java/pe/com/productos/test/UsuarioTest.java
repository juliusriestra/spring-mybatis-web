package pe.com.productos.test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import pe.com.productos.model.UsuarioBean;
import pe.com.productos.service.UsuarioService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:/**/root-context.xml"})
public class UsuarioTest {

	@Autowired
	private static UsuarioService usuarioService;
	
	@BeforeClass
	public static void setup(){
		usuarioService = new UsuarioService();
	}
	
	@AfterClass
	public static void teardown(){
		usuarioService = null;
	}
	@Test
	public void validar() throws Exception {
		UsuarioBean userBean = new UsuarioBean();
		userBean = usuarioService.validar("jriestra","suerte");
		assert(userBean!=null);
		assert(userBean.getUsuario().equals("jriestra"));
		if (userBean!=null) {
			System.out.println(userBean.getUsuario()+ " "+userBean.getIdusu());
		}
		
	}

}
