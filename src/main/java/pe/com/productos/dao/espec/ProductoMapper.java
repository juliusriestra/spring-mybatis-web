package pe.com.productos.dao.espec;

import java.util.List;

import pe.com.productos.model.CategoriaBean;
import pe.com.productos.model.ProductoBean;

public interface ProductoMapper {

  void insertar(ProductoBean productoBean);

  List<ProductoBean> traerTodos();

  List<CategoriaBean> traerCategorias();

}
