package EjercicioProducto;
import java.time.LocalDate;

public class Producto {
    String nombre;
    LocalDate fechaCaducidad;
    public Producto(String nombre, LocalDate fecha)throws ProductoVencido
    {
        this.nombre = nombre;
        this.fechaCaducidad = fecha;
        verificarCaducidad(fechaCaducidad);
    }
    
    public boolean verificarCaducidad(LocalDate fechaC)throws ProductoVencido{
        if(fechaC.isBefore(LocalDate.now())){
            throw new ProductoVencido("El producto está vencido.");
        }else{
            
            return true;
        }
  
    }
}
