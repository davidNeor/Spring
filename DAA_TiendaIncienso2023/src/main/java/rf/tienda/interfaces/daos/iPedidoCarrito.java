package rf.tienda.interfaces.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import rf.tienda.dominio.PedidoCarrito;

public interface iPedidoCarrito extends JpaRepository<PedidoCarrito, Integer> {

}
