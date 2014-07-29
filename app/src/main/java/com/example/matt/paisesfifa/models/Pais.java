package com.example.matt.paisesfifa.models;

/**
 * Created by matt on 28/07/2014.
 */
public class Pais {
   private String id = null;
   private String nombre = null;
   private int imagen = 0;
   private String descripcion = null;

   public Pais(String id, String nombre, int imagen, String descripcion) {
      this.id = id;
      this.nombre = nombre;
      this.imagen = imagen;
      this.descripcion = descripcion;
   }

   public String toString(){
      return nombre;
   }

   public String getId() {
      return id;
   }

   public void setId(String id) {
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
