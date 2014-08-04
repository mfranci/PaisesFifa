package com.example.matt.paisesfifa.models;

/**
 * Created by matt on 28/07/2014.
 */
public class Pais {
   private int id;
   private String nombre;
   private int imagen;
   private String descripcion;

   public Pais(int id, String nombre, int imagen, String descripcion) {
      this.id = id;
      this.nombre = nombre;
      this.imagen = imagen;
      this.descripcion = descripcion;
   }

   public String toString(){
      return nombre;
   }

   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public String getNombre() {
      return nombre;
   }

   public void setNombre(String nombre) {
      this.nombre = nombre;
   }

   public int getImagen() {
      return imagen;
   }

   public void setImagen(int imagen) {
      this.imagen = imagen;
   }

   public String getDescripcion() {
      return descripcion;
   }

   public void setDescripcion(String descripcion) {
      this.descripcion = descripcion;
   }
}
