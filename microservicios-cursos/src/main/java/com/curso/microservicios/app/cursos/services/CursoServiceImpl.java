package com.curso.microservicios.app.cursos.services;

import org.springframework.stereotype.Service;

import com.curso.microservicios.app.cursos.models.entity.Curso;
import com.curso.microservicios.app.cursos.models.repository.CursoRepository;
import com.curso.microservicios.commons.services.CommonServiceImpl;

import jakarta.transaction.Transactional;

@Service
public class CursoServiceImpl extends CommonServiceImpl<Curso, CursoRepository> implements CursoService {

	@Override
	@Transactional
	public Curso findCursoByAlumnoId(Long id) {
		return repository.findCursoByAlumnoId(id);
	}


}
