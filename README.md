En programación orientada a objetos, las clases genéricas y los datos tienen un papel crucial, especialmente en lenguajes como Java, C#, o C++.

DATOS:
En el contexto de la programación, los datos se refieren a la información que es procesada, almacenada y manipulada por un programa. Los datos pueden ser de diversos tipos y se dividen en categorías tales como:

- Datos primitivos: Estos son los tipos de datos básicos, como enteros, flotantes, booleanos, y caracteres. Cada lenguaje de programación define los tipos primitivos que se pueden usar.

Ejemplos:
- Entero: int (Java, C#, C++)
- Decimal: float, double
- Booleano: boolean
- Carácter: char

- Datos compuestos: Estos son tipos de datos que se construyen a partir de tipos primitivos. Pueden incluir arreglos, listas, mapas, estructuras y objetos.

Ejemplos:
- Arreglos (arrays)
- Estructuras (structs en C)
- Objetos (instancias de clases)

- Tipos de datos abstractos: Son estructuras más complejas como pilas, colas, listas enlazadas, árboles, etc., que organizan y gestionan los datos de formas específicas para optimizar las operaciones sobre ellos.


CLASES GENERICAS:
Las clases genéricas son una característica de los lenguajes de programación orientados a objetos que permiten crear clases, interfaces y métodos que pueden funcionar con cualquier tipo de datos. La idea principal detrás de las clases genéricas es que permiten la reutilización de código y la creación de estructuras de datos más flexibles y seguras.

Características de las clases genéricas
- Tipado flexible: Una clase genérica no se limita a trabajar con un tipo de dato específico. En lugar de eso, se define un tipo genérico (usualmente representado por una letra o palabra como T, E, K, V, etc.) que se sustituye con un tipo real cuando se instancie la clase.

- Reutilización de código: Las clases genéricas permiten que una única implementación de clase maneje diferentes tipos de datos, lo que evita la duplicación de código.

- Seguridad en tiempo de compilación: Las clases genéricas mejoran la seguridad de tipo, ya que el compilador verifica el tipo de datos en tiempo de compilación. Esto ayuda a evitar errores en tiempo de ejecución relacionados con tipos incorrectos.

- Parámetros de tipo múltiples: Algunas clases genéricas pueden usar más de un parámetro de tipo, lo que las hace aún más flexibles. Por ejemplo, un mapa (como en Map<K, V> en Java) usa dos tipos: uno para la clave (K) y otro para el valor (V).

Ventajas de las clases genéricas:
- Reutilización de código: Una vez que creas una clase genérica, puedes usarla con diferentes tipos sin necesidad de escribir clases específicas para cada tipo.
- Seguridad de tipos: Ayuda a evitar errores en tiempo de ejecución, ya que el tipo se especifica en el momento de la compilación.
- Flexibilidad: Puedes crear estructuras de datos o colecciones que no dependen de un tipo específico.
- Restricciones de tipos (Bounded Types):
A veces, puedes restringir los tipos que se pueden utilizar con una clase genérica mediante "límites" o restricciones. Esto es útil cuando deseas que el tipo genérico sea de una subclase específica o implemente una interfaz determinada.

