package com.curso.microservicios.app.usuarios.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.curso.microservicios.app.usuarios.models.repository.AlumnoRepository;
import com.curso.microservicios.commons.alumnos.models.entity.Alumno;
import com.curso.microservicios.commons.services.CommonServiceImpl;

import jakarta.transaction.Transactional;

@Service
public class AlumnoServiceImpl extends CommonServiceImpl<Alumno, AlumnoRepository> implements AlumnoService {

	@Override
	@Transactional
	public List<Alumno> findByNombreOrApellido(String term) {
		return repository.findByNombreOrApellido(term);
	}


}
