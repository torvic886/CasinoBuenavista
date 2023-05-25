package co.quindio.armenia.casino.buenavista.models;

import java.io.Serializable;

import jakarta.persistence.CascadeType;

//import com.fasterxml.jackson.annotation.JsonBackReference;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "administrador")
public class Administrador implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_administrador")
    private Long idAdministrador;
    
    @Column(name = "nombre")    
	private String nombre;
	
    @Column(name = "apellido")     
	private String apellido;
	
    @Column(name = "email")       
	private String email;

    @Column(name = "telefono")      
	private String telefono;
    
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_maquina_01", unique = true)//aqui me crea en la tabla administrador el campo id_maquina_01 para que se relacione con la llave primaria de maquina_01
	private Maquina_01 maquina_01;
	
//nota: no hay necesidad de crear relacion en la clase Maquina_01 ya que con el unique se indica que solo va hacer una relacion
// administrador va estar asociada a una maquina y la maquina estara asociada a un solo administrador

	
	public Administrador() {
		// TODO Auto-generated constructor stub
	}



	public Administrador(Long idAdministrador, String nombre, String apellido, String email, String telefono,
			Maquina_01 maquina_01) {
		super();
		this.idAdministrador = idAdministrador;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.telefono = telefono;
		this.maquina_01 = maquina_01;

	}



	public Long getIdAdministrador() {
		return idAdministrador;
	}



	public void setIdAdministrador(Long idAdministrador) {
		this.idAdministrador = idAdministrador;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getApellido() {
		return apellido;
	}



	public void setApellido(String apellido) {
		this.apellido = apellido;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getTelefono() {
		return telefono;
	}



	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}



	public Maquina_01 getMaquina_01() {
		return maquina_01;
	}



	public void setMaquina_01(Maquina_01 maquina_01) {
		this.maquina_01 = maquina_01;
	}
	
	
}
