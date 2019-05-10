package com.modelo.controller;

import com.modelo.model.Persona;
import com.modelo.service.IPersonaService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "API REST personas", description = "Mostar información")
@RestController
public class PersonaController {

  @Autowired
  private IPersonaService service;

  @ApiOperation(value = "Retorna lista de personas")
  @GetMapping(value = "/personas")
  public ResponseEntity<List<Persona>> listarPersonas() {
    return new ResponseEntity<List<Persona>>(service.findAll(), HttpStatus.OK);
  }

  @ApiOperation(value = "Crea a una persona")
  @PostMapping(value = "/personas", consumes = "application/json", produces = "application/json")
  public ResponseEntity<Persona> registrar(@RequestBody Persona persona) {
    return new ResponseEntity<Persona>(service.create(persona), HttpStatus.OK);
  }

  @ApiOperation(value = "Actualiza datos de una persona")
  @PutMapping(value = "/personas", consumes = "application/json", produces = "application/json")
  public ResponseEntity<Persona> actualizar(@RequestBody Persona persona) {
    return new ResponseEntity<Persona>(service.update(persona), HttpStatus.OK);
  }

  /**
   * Eliminar persona.
   */

  @ApiOperation(value = "Elimina persona")
  /**
   * Eliminar.
   * 
   * @param persona 1.
   * @return
   */
  @DeleteMapping(value = "/personas", consumes = "application/json", produces = "application/json")
  public ResponseEntity<Integer> eliminar(@RequestBody Persona persona) {
    int rpta = 0;

    rpta = service.delete(persona.getIdPersona());

    return new ResponseEntity<Integer>(rpta, HttpStatus.OK);
  }

}
