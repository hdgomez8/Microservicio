package com.curso.microservicios.app.examenes.models.repository;

import org.springframework.data.repository.CrudRepository;

import com.curso.microservicios.commons.examenes.models.entity.Asignatura;

public interface AsignaturaRepository extends CrudRepository<Asignatura, Long> {

}
