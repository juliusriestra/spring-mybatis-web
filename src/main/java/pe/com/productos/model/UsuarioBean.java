package pe.com.productos.model;

public class UsuarioBean {

	private Integer idusu;
	private String usuario;
	private String clave;
	private boolean estado;

	public UsuarioBean() {
		// TODO Auto-generated constructor stub
	}

	public Integer getIdusu() {
		return idusu;
	}


	public void setIdusu(Integer idusu) {
		this.idusu = idusu;
	}


	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
}
