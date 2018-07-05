package pe.com.productos.model;

public class ProductoBean {

	private Integer idprod;
	private Integer idcat;
	private String nombre;
	private Double precio;
	private Integer stock;

	public ProductoBean() {
	}

	public ProductoBean(Integer idprod, String nombre, Integer idcat,
	    Double precio, Integer stock) {
		super();
		this.idprod = idprod;
		this.nombre = nombre;
		this.idcat = idcat;
		this.precio = precio;
		this.stock = stock;
	}

	public Integer getIdprod() {
		return idprod;
	}

	public void setIdprod(Integer idprod) {
		this.idprod = idprod;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getIdcat() {
		return idcat;
	}

	public void setIdcat(Integer idcat) {
		this.idcat = idcat;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

}
