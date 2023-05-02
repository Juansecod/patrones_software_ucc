# Bridge Pattern

El patrón Bridge es un patrón de diseño de software que se utiliza para separar la abstracción de una funcionalidad de su implementación concreta, permitiendo que ambas puedan evolucionar y modificarse de forma independiente.

En otras palabras, el patrón Bridge se utiliza cuando se desea desacoplar la lógica de la aplicación de los detalles de implementación específicos, lo que permite cambiar o actualizar uno sin afectar al otro. Esto se logra mediante la creación de una interfaz abstracta que actúa como un puente entre la abstracción y su implementación concreta.

![Diagrama Patron Bridge](https://refactoring.guru/images/patterns/diagrams/bridge/structure-es.png)

[Mas informacion sobre el patron Bridge](https://refactoring.guru/es/design-patterns/bridge)

## Ejemplo práctico

En este ejemplo, la jerarquia `Client` actua como una **Abstraccion**, y la jerarquia `DataObjectImplementor` actua como una **Implementacion** Los objetos de la clase `Client` pueden mostrar por conosola los datos proporcionados por un objeto `DataObjectImplementor`. Al estar ambas jerarquias de clase separadas, se pueden añadir una nueva clase `DataObjectImplementor` sin cambiar ninguna de las clases `Client` y vicebersa.

>A continuacion se presenta un diagrama de clases del programa:

<img src="./BridgePattern.svg" alt="Diagrama de clases" style="padding: 5%; background: white"/>
