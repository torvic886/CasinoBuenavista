package co.quindio.armenia.casino.buenavista.repositories;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import co.quindio.armenia.casino.buenavista.models.Administrador;



public interface AdministradorRepositorio extends JpaRepository<Administrador, Long> {

	@Query(nativeQuery=true, value="SELECT *FROM Administrador WHERE nombre LIKE %?1%")
	public abstract ArrayList<Administrador> findByNombre(String nombre);
}
