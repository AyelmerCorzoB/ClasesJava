## Clases Java
Este repositorio contiene todas las clases y ejemplos prácticos relacionados con el curso de Java, desde el 13/03/2025 en adelante.

### Expresiones Lambda en Java
Las expresiones lambda son una característica introducida en Java 8 que permite escribir código más conciso y funcional. Facilitan la implementación de interfaces funcionales (interfaces con un único método abstracto) de manera más legible y eficiente.

**Temas Cubiertos**
A continuación, se detallan los temas vistos en clase, junto con una breve explicación de cada uno:

1. **Comparator:**
La interfaz Comparator se utiliza para definir un orden personalizado en colecciones de objetos. Es especialmente útil cuando se necesita ordenar objetos de una clase que no implementa Comparable o cuando se desea un orden diferente al natural.

Ejemplo:
````bash
List<Persona> personas = new ArrayList<>();
personas.add(new Persona("Juan", 25));
personas.add(new Persona("Ana", 30));

// Ordenar por edad usando lambda
personas.sort((p1, p2) -> p1.getEdad() - p2.getEdad());
````
2. **Consumer:**
La interfaz Consumer representa una operación que acepta un solo argumento de entrada y no devuelve ningún resultado. Es útil para realizar acciones sobre un objeto, como imprimir o modificar su estado.

Ejemplo:
````bash
Consumer<String> imprimir = (s) -> System.out.println(s);
imprimir.accept("Hola, mundo!");
````
3. **BiConsumer:**
Similar a Consumer, pero acepta dos argumentos en lugar de uno. Es útil para operaciones que requieren dos entradas, como agregar elementos a un mapa.

Ejemplo:
````
BiConsumer<String, Integer> imprimirDatos = (nombre, edad) -> 
    System.out.println(nombre + " tiene " + edad + " años.");
imprimirDatos.accept("Ana", 30);
````
4. **Supplier:**
La interfaz Supplier no acepta argumentos, pero devuelve un resultado. Es útil para generar o proporcionar valores, como la creación de objetos o la generación de números aleatorios.

Ejemplo:
````bash
Supplier<Double> numeroAleatorio = () -> Math.random();
System.out.println("Número aleatorio: " + numeroAleatorio.get());
````
5. **Predicate:**
La interfaz Predicate representa una función que toma un argumento y devuelve un valor booleano. Se utiliza comúnmente para filtrar elementos en una colección.

Ejemplo:
````bash
Predicate<Integer> esMayorDeEdad = (edad) -> edad >= 18;
System.out.println("¿Es mayor de edad? " + esMayorDeEdad.test(20));
````
