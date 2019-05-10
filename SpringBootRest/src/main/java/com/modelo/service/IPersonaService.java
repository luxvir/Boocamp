package com.modelo.service;

import com.modelo.model.Persona;
import java.util.List;


public interface IPersonaService {

  List<Persona> findAll();

  Persona create(Persona persona);

  Persona update(Persona persona);

  int delete(Integer id);
}
