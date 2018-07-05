package pe.com.productos.dao.espec;

import org.apache.ibatis.annotations.Param;

import pe.com.productos.model.UsuarioBean;

public interface UsuarioMapper {
	UsuarioBean traerUsuario(@Param("usuario") String usuario, @Param("clave") String clave);
}
