package co.quindio.armenia.casino.buenavista.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import co.quindio.armenia.casino.buenavista.models.Administrador;
import co.quindio.armenia.casino.buenavista.services.AdministradorServicioImpl;


//@CrossOrigin(origins = "http://localhost:4200/")
@RestController
@RequestMapping("/Administrador")
public class AdministradorController {

	@Autowired
	AdministradorServicioImpl administradorServicioimpl;
	
	
	@GetMapping("/Administradores")
	public List<Administrador> obtenerAdministradores(){
		return administradorServicioimpl.obtenerTodo();	
	}
//-------------------------------------------------------------------	
	 
	 @GetMapping( path = "/buscar")
	 public ArrayList<Administrador> obtenerByNombre(@RequestParam("nombre") String nombre) 
	 {
		 return this.administradorServicioimpl.obtenerPorNombre(nombre);
	 }
	
//-------------------------------------------------------------------		
	 @PostMapping("/guardar")
	 public ResponseEntity<Administrador>guardarAdministrador(@RequestBody Administrador Administrador) 
	 {
		 System.out.println(Administrador);
		 Administrador nuevo_Administrador = administradorServicioimpl.guardarAdministrador(Administrador);
		 return new ResponseEntity<>(nuevo_Administrador, HttpStatus.CREATED);
		 
	 }
	@GetMapping("/Administrador/{id}")	 
	 public ResponseEntity<Administrador> obtenerAdministradorId(@PathVariable long id, @RequestBody Administrador Administrador){
		System.out.println(Administrador);
		Administrador AdministradorPorId = administradorServicioimpl.obtenerPorId(id);
		 return ResponseEntity.ok(AdministradorPorId);
		 
	 }
	
	@GetMapping("/AdministradorAct/{id}")	 
	 public ResponseEntity<Administrador> obtenerAdministrador(@PathVariable("id") long id){

		Administrador AdministradorPorId = administradorServicioimpl.obtenerPorId(id);
		 return ResponseEntity.ok(AdministradorPorId);
		 
	 }
	 
	 @PutMapping("/Admin/{id}")
	 public ResponseEntity<Administrador>actualizar(@PathVariable long id, @RequestBody Administrador administrador)
	 {
		 Administrador AdministradorPorId = administradorServicioimpl.obtenerPorId(id);
		 System.out.println(AdministradorPorId);
		 
		 AdministradorPorId.setNombre(administrador.getNombre());
		 AdministradorPorId.setApellido(administrador.getApellido());
		 AdministradorPorId.setEmail(administrador.getEmail());
		 AdministradorPorId.setTelefono(administrador.getTelefono());
		 AdministradorPorId.setEmail(administrador.getEmail());
//		 AdministradorPorId.setMaquina_01(administrador.getMaquina_01());
		 
		 Administrador Administrador_actualizado = administradorServicioimpl.guardarAdministrador(AdministradorPorId);
		 return new ResponseEntity<>(Administrador_actualizado, HttpStatus.CREATED);
	 }
	 
	 @PutMapping("/Administrador")
	 public void actualizarU( @RequestBody Administrador Administrador)
	 {		 
		 administradorServicioimpl.actualizarU(Administrador);
	 }
	 
	 
	 @DeleteMapping("/AdminDel/{id}")
	 public ResponseEntity<HashMap<String, Boolean>> eliminarCliente(@PathVariable long id)
	 {
		 this.administradorServicioimpl.eliminarAdministrador(id);
		 
		 HashMap<String, Boolean> estadoAdministradorEliminado = new HashMap<>();
		 estadoAdministradorEliminado.put("eliminado", true);
		 return ResponseEntity.ok(estadoAdministradorEliminado);
	 }	
}
