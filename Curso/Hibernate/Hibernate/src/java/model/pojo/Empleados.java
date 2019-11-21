package model.pojo;
// Generated 21/11/2019 19:32:45 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Empleados generated by hbm2java
 */
public class Empleados  implements java.io.Serializable {


     private Integer id;
     private String nombre;
     private String apellido;
     private Byte edad;
     private float salario;
     private Date fechaIngreso;
     private int idDepartamento;

    public Empleados() {
    }

	
    public Empleados(String nombre, String apellido, float salario, Date fechaIngreso, int idDepartamento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
        this.fechaIngreso = fechaIngreso;
        this.idDepartamento = idDepartamento;
    }
    public Empleados(String nombre, String apellido, Byte edad, float salario, Date fechaIngreso, int idDepartamento) {
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
    public float getSalario() {
        return this.salario;
    }
    
    public void setSalario(float salario) {
        this.salario = salario;
    }
    public Date getFechaIngreso() {
        return this.fechaIngreso;
    }
    
    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
    public int getIdDepartamento() {
        return this.idDepartamento;
    }
    
    public void setIdDepartamento(int idDepartamento) {
        this.idDepartamento = idDepartamento;
    }




}

