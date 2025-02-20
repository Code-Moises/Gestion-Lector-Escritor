# Proyecto de Gestión de Lectores y Escritores

Este proyecto implementa un sistema para gestionar lectores, escritores y libros en Java. Permite registrar libros, asignarlos a escritores y realizar un seguimiento de los hábitos de lectura de los usuarios.

## Características
- Clases principales: `Lector`, `Escritor`, `Libro` y `Persona`.
- Seguimiento de libros leídos por cada lector.
- Determinación del género literario preferido de cada lector.
- Gestión de obras escritas por cada escritor.
- Control del número total de libros registrados.

## Instalación y Uso
1. Clonar este repositorio:
   ```sh
   git clone https://github.com/tuusuario/nombre-repo.git
   ```
2. Compilar y ejecutar el programa en un entorno compatible con Java.
3. Crear instancias de `Lector`, `Escritor` y `Libro` en el método `main` para probar las funcionalidades.

## Ejemplo de Uso
```java
public class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro("El principito", "Fantasía", 98, 1943);
        Libro libro2 = new Libro("1984", "Distopía", 328, 1949);
        
        Escritor escritor = new Escritor("George", "Orwell", LocalDate.of(1903, 6, 25), "Reino Unido", libro2);
        
        Lector lector = new Lector("Juan", "Pérez", LocalDate.of(1990, 5, 15), "España", libro1, "BIB123");
        lector.leer(libro2);
        
        System.out.println("Información del escritor:\n" + escritor);
        System.out.println("Información del lector:\n" + lector);
    }
}
```

## Posibles Mejoras
- Implementar persistencia de datos.
- Agregar interfaz gráfica para la gestión de libros y usuarios.
- Integración con una base de datos.

## Licencia
Este proyecto está bajo la licencia MIT.
