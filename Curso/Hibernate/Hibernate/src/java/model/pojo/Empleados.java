package model.pojo;
// Generated 22/11/2019 18:35:58 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Empleados generated by hbm2java
 */
public class Empleados  implements java.io.Serializable {


     private Integer id;
     private String nombre;
     private String apellido;
     private Byte edad;
     private Float salario;
     private Date fechaIngreso;
     private Integer idDepartamento;

    public Empleados() {
    }

	
    public Empleados(String nombre, String apellido, Float salario, Date fechaIngreso, Integer idDepartamento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
        this.fechaIngreso = fechaIngreso;
        this.idDepartamento = idDepartamento;
    }
    public Empleados(String nombre, String apellido, Byte edad, Float salario, Date fechaIngreso, Integer idDepartamento) {
       this.nombre = nombre;
       this.apellido = apellido;
       this.edad = edad;
       this.salario = salario;
       this.fechaIngreso = fechaIngreso;
       this.idDepartamento = idDepartamento;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return this.apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public Byte getEdad() {
        return this.edad;
    }
    
    public void setEdad(Byte edad) {
        this.edad = edad;
    }
    public Float getSalario() {
        return this.salario;
    }
    
    public void setSalario(Float salario) {
        this.salario = salario;
    }
    public Date getFechaIngreso() {
        return this.fechaIngreso;
    }
    
    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
    public Integer getIdDepartamento() {
        return this.idDepartamento;
    }
    
    public void setIdDepartamento(Integer idDepartamento) {
        this.idDepartamento = idDepartamento;
    }




}


