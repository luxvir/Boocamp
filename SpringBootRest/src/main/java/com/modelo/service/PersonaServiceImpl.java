package com.modelo.service;

import com.modelo.dao.IPersonaDao;
import com.modelo.model.Persona;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class PersonaServiceImpl implements IPersonaService {

  @Autowired
  private IPersonaDao dao;

  @Override
  public List<Persona> findAll() {
    return dao.findAll();
  }

  @Override
  public Persona create(Persona persona) {
    return dao.save(persona);
  }

  @Override
  public Persona update(Persona persona) {
    return dao.save(persona);
  }

  @Override
  public int delete(Integer id) {

    int rpta = 0;
    try {
      dao.deleteById(id);
      rpta = 1;
    } catch (Exception e) {
      rpta = 0;
    }
    return rpta;
  }

}
