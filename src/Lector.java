import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Lector extends Persona {
    private ArrayList<Libro> listaObrasLeidas;
    private String numBiblioteca;

    public Lector(String nombre, String apellidos, LocalDate fechaNac, String paisNac, Libro obra,
            String numBiblioteca) {
        super(nombre, apellidos, fechaNac, paisNac);
        listaObrasLeidas = new ArrayList<>();
        listaObrasLeidas.add(obra);
        this.numBiblioteca = numBiblioteca;
    }

    public void leer(Libro obra) {
        listaObrasLeidas.add(obra);
    }

    public String generoPreferido() {
        HashMap<String, Integer> contadorGeneros = new HashMap<>();
        
        for (Libro libro : listaObrasLeidas) {
            //getOrDefault hace que si no existe nos de 0 y le sumamos 1 porque ha aparecido ya 1 vez
            //Y si ya a aparecido nos devuelvo el numero que tiene (1,2,3...) + 1(porque se le suma esta vez)
            contadorGeneros.put(libro.getGenero(), contadorGeneros.getOrDefault(libro.getGenero(), 0) + 1);
            //esta poniendo en contadorGeneros("Drama", 1) por ejemplo. Si vuelve a salir ("Drama", 2)
        }

        String generoPreferido = "";
        int maxRepeticiones = 0;
        //entrySet --> hace que el valor Drama -> 2 lo ponga como [{"Drama"}, 2}]
        for (Map.Entry<String, Integer> entry : contadorGeneros.entrySet()) {
            if (entry.getValue() > maxRepeticiones) {
                maxRepeticiones = entry.getValue();
                generoPreferido = entry.getKey();
            }
        }

        return generoPreferido;
    }

    public String getNumBiblioteca() {
        return numBiblioteca;
    }

    public String ultimaLectura() {
        return listaObrasLeidas.get(listaObrasLeidas.size() - 1).getTitulo();
    }

    @Override
    public String toString() {
        return "Lector: " + getNombre() +" "+getApellidos() + "\nNumeroBiblio: "+ getNumBiblioteca() + "\nGenero favorito: " + generoPreferido() +
        "\nÚltima lectura: " + ultimaLectura();
    }
}
