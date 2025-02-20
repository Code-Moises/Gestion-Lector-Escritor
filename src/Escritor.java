import java.time.LocalDate;
import java.util.ArrayList;

public class Escritor extends Persona {
    private ArrayList<Libro>listaObras;
    private String apodo;

    public Escritor(String nombre, String apellidos, LocalDate fechaNac, String paisNac, Libro obra, String apodo) {
        super(nombre, apellidos, fechaNac, paisNac);
        listaObras = new ArrayList<>();
        listaObras.add(obra);
        this.apodo = apodo;
    }

    public Escritor(String nombre, String apellidos, LocalDate fechaNac, String paisNac, Libro obra) {
        this(nombre, apellidos, fechaNac, paisNac, obra, "NINGUNO");
    }

    public void añadirObra(Libro libro) {
        listaObras.add(libro);
    }

    @Override
    public String toString() {
        String salida = "Escritor con apodo: " + apodo;
        salida += "\nSus obras son: ";
        for (Libro libro : listaObras) {
            salida += "\n" + "   - " + libro + " ";
        }
        return salida;
    }

}
