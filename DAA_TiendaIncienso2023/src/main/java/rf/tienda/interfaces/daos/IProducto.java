package rf.tienda.interfaces.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import rf.tienda.dominio.Producto;

public interface IProducto extends JpaRepository<Producto, String> {

}
