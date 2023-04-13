package rf.tienda.interfaces.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import rf.tienda.dominio.Usuario;

public interface IUsuario extends JpaRepository<Usuario, Integer> {

}
