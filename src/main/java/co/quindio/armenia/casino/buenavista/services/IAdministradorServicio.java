package co.quindio.armenia.casino.buenavista.services;

import java.util.List;

import co.quindio.armenia.casino.buenavista.models.Administrador;



public interface IAdministradorServicio {

	public List<Administrador> obtenerTodo();
	
	public Administrador guardarAdministrador(Administrador administrador);
	
	public Administrador obtenerPorId(long id);
	
	public void eliminarAdministrador(long id);

	public void actualizarU(Administrador administrador);
}
