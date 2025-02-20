import java.time.LocalDate;
import java.time.Period;

public abstract class Persona {
    private String nombre;
    private String apellidos;
    private LocalDate fechaNac;
    private String paisNac;

    public Persona(String nombre, String apellidos, LocalDate fechaNac, String paisNac) {
        if (nombre == null || nombre.isEmpty() || apellidos == null || apellidos.isEmpty() || paisNac == null || paisNac.isEmpty() || fechaNac == null) {
            throw new IllegalArgumentException("Datos inválidos para crear la persona.");
        } else {   
            this.nombre = nombre;
            this.apellidos = apellidos;
            this.fechaNac = fechaNac;
            this.paisNac = paisNac;
        }
    
    }

    int obtenerEdad() {
        return Period.between(fechaNac, LocalDate.now()).getYears();
    }

    @Override
    public String toString() {
        String salida = String.format("Nombre: %s\nApellidos: %s\nFechaNac: %s%n\nPaisNac: %s",
        nombre, apellidos, fechaNac, paisNac);
        return salida;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public String getPaisNac() {
        return paisNac;
    } 
}
