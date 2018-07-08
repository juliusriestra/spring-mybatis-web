package pe.com.productos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.productos.dao.espec.UsuarioMapper;
import pe.com.productos.model.UsuarioBean;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioMapper usuarioMapper;
	
	public UsuarioBean validar(String usuario, String clave) throws Exception {
		UsuarioBean bean = usuarioMapper.traerUsuario(usuario, clave);
		if(bean == null){
			throw new Exception("Error, datos incorrectos.");
		}
		return bean;
	}
}
