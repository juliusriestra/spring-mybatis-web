package pe.com.productos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.com.productos.dao.espec.UsuarioMapper;
import pe.com.productos.model.UsuarioBean;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioMapper usuarioMapper;
	
	public UsuarioBean validar(String usuario, String clave){
		UsuarioBean bean = usuarioMapper.traerUsuario(usuario, clave);
		if(bean == null){
			throw new RuntimeException("Error, datos incorrectos.");
		}
		return bean;
	}
}
