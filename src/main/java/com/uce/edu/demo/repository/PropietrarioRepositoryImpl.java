package com.uce.edu.demo.repository;

import java.time.LocalDateTime;

import org.springframework.stereotype.Repository;
import com.uce.edu.demo.modelo.Propietario;

@Repository
public class PropietrarioRepositoryImpl implements IPropietrarioRepository {

	@Override
	public void crear(Propietario p) {
		System.out.println("Se crea el propietario: " + p);

	}

	@Override
	public void eliminar(String cedula) {
		System.out.println("Se elimina el propietario: " + cedula);

	}

	@Override
	public Propietario consultar(String cedula) {
		// TODO Auto-generated method stub

		Propietario p = new Propietario();
		p.setNombre("Juan");
		p.setApellido("Jumbo");
		p.setFechaNacimiento(LocalDateTime.now());
		p.setCedula(cedula);
		return p;

	}

}
