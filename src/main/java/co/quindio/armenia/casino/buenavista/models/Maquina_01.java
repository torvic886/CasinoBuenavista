package co.quindio.armenia.casino.buenavista.models;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "maquina_01")
public class Maquina_01 implements Serializable{


	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id_maquina_01")
	private Long id_maquina_01;	
	
//    @Column(name = "nombre_maquina")   
	private String nombre_maquina;	
	
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd") 
	private Date fecha_informe;	
	
//    @Column(name = "contador_in")   
	private Double contador_in;	
	
//    @Column(name = "contador_out")   
	private Double contador_out;	
	
//    @Column(name = "dif_contador")   
	private Double dif_contador;	
	
//    @Column(name = "valor_pesos")   
	private Double valor_pesos;	
	
//    @Column(name = "descuento")   
	private Double descuento;	
	
//    @Column(name = "total_1")   
	private Double total_1;	
	
//    @Column(name = "total_2")   
	private Double total_2;	
	
//	@ManyToOne
//	@JoinColumn(name = "id_administrador") 
//	private Administrador administrador;	
	
	public Maquina_01() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Maquina_01(Long id_maquina_01, String nombre_maquina, Date fecha_informe, Double contador_in, Double contador_out,
			Double dif_contador, Double valor_pesos, Double descuento, Double total_1, Double total_2,
			Administrador administrador) {
		this.id_maquina_01 = id_maquina_01;
		this.nombre_maquina = nombre_maquina;
		this.fecha_informe = fecha_informe;
		this.contador_in = contador_in;
		this.contador_out = contador_out;
		this.dif_contador = dif_contador;
		this.valor_pesos = valor_pesos;
		this.descuento = descuento;
		this.total_1 = total_1;
		this.total_2 = total_2;
//		this.administrador = administrador;
	}



	public Long getId_maquina() {
		return id_maquina_01;
	}

	public void setId_maquina(Long id_maquina) {
		this.id_maquina_01 = id_maquina;
	}

	public String getNombre_maquina() {
		return nombre_maquina;
	}

	public void setNombre_maquina(String nombre_maquina) {
		this.nombre_maquina = nombre_maquina;
	}

	public Date getFecha_informe() {
		return fecha_informe;
	}

	public void setFecha_informe(Date fecha_informe) {
		this.fecha_informe = fecha_informe;
	}

	public Double getContador_in() {
		return contador_in;
	}

	public void setContador_in(Double contador_in) {
		this.contador_in = contador_in;
	}

	public Double getContador_out() {
		return contador_out;
	}

	public void setContador_out(Double contador_out) {
		this.contador_out = contador_out;
	}

	public Double getDif_contador() {
		return dif_contador;
	}

	public void setDif_contador(Double dif_contador) {
		this.dif_contador = dif_contador;
	}

	public Double getValor_pesos() {
		return valor_pesos;
	}

	public void setValor_pesos(Double valor_pesos) {
		this.valor_pesos = valor_pesos;
	}

	public Double getDescuento() {
		return descuento;
	}

	public void setDescuento(Double descuento) {
		this.descuento = descuento;
	}

	public Double getTotal_1() {
		return total_1;
	}

	public void setTotal_1(Double total_1) {
		this.total_1 = total_1;
	}

	public Double getTotal_2() {
		return total_2;
	}

	public void setTotal_2(Double total_2) {
		this.total_2 = total_2;
	}

//	public Administrador getAdministrador() {
//		return administrador;
//	}
//
//	public void setAdministrador(Administrador administrador) {
//		this.administrador = administrador;
//	}
	
}
