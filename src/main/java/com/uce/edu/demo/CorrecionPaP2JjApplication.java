package com.uce.edu.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.modelo.Propietario;
import com.uce.edu.demo.modelo.Vehiculo;
import com.uce.edu.demo.service.IMatriculaGestorService;
import com.uce.edu.demo.service.IPropietarioService;
import com.uce.edu.demo.service.IVehiculoService;

@SpringBootApplication
public class CorrecionPaP2JjApplication implements CommandLineRunner {

	@Autowired
	private IVehiculoService vehiculoService;
	
	@Autowired
	private IPropietarioService propietarioService;
	
	@Autowired
	private IMatriculaGestorService matriculaGestorService;
	
	public static void main(String[] args) {
		SpringApplication.run(CorrecionPaP2JjApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		//1
		Vehiculo v = new Vehiculo();
		v.setMarca("Toyota");
		v.setPlaca("PCT8976");
		v.setPrecio(new BigDecimal(5000));
		v.setTipo("L");
		
		this.vehiculoService.insertar(v);
		
		//2
		v.setPrecio(new BigDecimal(40000));
		v.setMarca("Toyota");
		this.vehiculoService.actualizar(v);
		
		//3
		Propietario p = new Propietario();
		p.setNombre("Juan");
		p.setApellido("Jumbo");
		p.setCedula("1723920979");
		p.setFechaNacimiento(LocalDateTime.of(1997, 2, 16, 0, 0));
		this.propietarioService.crear(p);
		
		//4
		this.matriculaGestorService.generar("1723920979", "PCT8976");
		
	}

}
