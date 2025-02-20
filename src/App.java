import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
       
      // Crear libros
      Libro libro1 = new Libro("1984", "Distopía", 328, 1949);
      Libro libro2 = new Libro("El señor de los anillos", "Fantasía", 1200, 1954);
      Libro libro3 = new Libro("Cien años de soledad", "Realismo mágico", 471, 1967);
      Libro libro4 = new Libro("El principito", "Fábula", 96, 1943);

      // Crear escritor
      Escritor escritor = new Escritor("Gabriel", "García Márquez", LocalDate.of(1927, 3, 6), "Colombia", libro3);
      escritor.añadirObra(libro4);

      // Crear lector
      Lector lector = new Lector("Juan", "Pérez", LocalDate.of(1990, 5, 15), "España", libro1, "BIB123");
      lector.leer(libro2);
      lector.leer(libro3);
      lector.leer(libro4);

      // Mostrar información
      System.out.println("Información del escritor:");
      System.out.println(escritor);
      
      System.out.println("\nInformación del lector:");
      System.out.println(lector);
    
    }
}
