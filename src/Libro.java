public class Libro {
    private static int numLibros = 0; // numlibros totales
    private String titulo;
    private String genero;
    private int numPaginas;
    private int anyoPublicacion;

    public static boolean actualizarNumLibros(int num) {
        if (numLibros > 0) {
            numLibros = num;
            return true;
        } else {
            return false;
        }
    }

    public Libro(String titulo, String genero, int numPaginas, int anyoPublicacion) {
        if (titulo == null || titulo == "") {
            throw new IllegalArgumentException("El titulo no puede ser nulo o estar vacío");
        } else if (numPaginas < 0) {
            throw new IllegalArgumentException("El número de páginas no puede ser negativo");
        } else if (anyoPublicacion < 0) {
            throw new IllegalArgumentException("El año de publicación no puede ser negativo");
        } else {
            this.titulo = titulo;
            this.genero = genero;
            this.numPaginas = numPaginas;
            this.anyoPublicacion = anyoPublicacion;
            numLibros++;
        }
    }

    public Libro(String titulo, int numPaginas, int anyoPublicacion) {
        this(titulo, "DESCONOCIDO", numPaginas, anyoPublicacion);
    }

    public String tipoLibro() {
        if (numPaginas <= 100) {
            return "Pequeño";
        } else if (numPaginas <= 200) {
            return "Mediano";
        } else {
            return "Largo";
        }
    }

    public String obtenerInfo() {
        String salida = String.format(
                "Título: %s\nGénero: %s\nNumPáginas: %d\nAñoPublicación: %d",
                titulo, genero, numPaginas, anyoPublicacion);
        return salida;
    }

    public void mostrarInfo() {
        System.out.println(obtenerInfo());
    }

    public boolean actualizarNumPaginas(int numPaginas) {
        if (numPaginas > 0) {
            this.numPaginas = numPaginas;
            return true;
        } else {
            return false;
        }
    }

    public static int getNumLibros() {
        return numLibros;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public int getAnyoPublicacion() {
        return anyoPublicacion;
    }

    @Override
    public String toString() {
        return String.format("Título: %s, Género: %s, Páginas: %d, Año: %d",
                titulo, genero, numPaginas, anyoPublicacion);
    }

}
