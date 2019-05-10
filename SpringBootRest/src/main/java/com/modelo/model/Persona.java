package com.modelo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Persona {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int idPersona;
  @Column(name = "nombres", length = 50, nullable = false)
  private String nombres;
  @Column(name = "apellidos", length = 100, nullable = false)
  private String apellidos;

  public int getIdPersona() {
    return idPersona;
  }

  public void setIdPersona(int idPersona) {
    this.idPersona = idPersona;
  }

  public String getNombres() {
    return nombres;
  }

  public void setNombres(String nombres) {
    this.nombres = nombres;
  }

  public String getApellidos() {
    return apellidos;
  }

  public void setApellidos(String apellidos) {
    this.apellidos = apellidos;
  }

}
