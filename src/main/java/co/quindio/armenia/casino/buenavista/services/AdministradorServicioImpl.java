package co.quindio.armenia.casino.buenavista.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.quindio.armenia.casino.buenavista.models.Administrador;
import co.quindio.armenia.casino.buenavista.repositories.AdministradorRepositorio;
@Service
public class AdministradorServicioImpl implements IAdministradorServicio{

	@Autowired
	AdministradorRepositorio administradorRepositorio;
	
	
	@Override
	public List<Administrador> obtenerTodo() {
		return administradorRepositorio.findAll();
	}
//-------------------------------------------------------------------		
	public ArrayList<Administrador> obtenerPorNombre(String nombre) {
		return administradorRepositorio.findByNombre(nombre);
	}
//-------------------------------------------------------------------	

	@Override
	public Administrador guardarAdministrador(Administrador usuario) {
		return administradorRepositorio.save(usuario);
	}
	
	@Override
	public void actualizarU(Administrador administrador) {
		administradorRepositorio.save(administrador);
	}


	@Override
	public Administrador obtenerPorId(long id) {
		return administradorRepositorio.findById(id).orElse(null);
	}

	@Override
	public void eliminarAdministrador(long id) {
		administradorRepositorio.deleteById(id);
	}

}
