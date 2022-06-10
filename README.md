# Ejercicios tema 3

## Primera Parte

- Crear una función con tres parámetros que sean números que se suman entre sí.
- Llamar a la función en el main y darle valores.

```sh
    Calculadora calculadora = new Calculadora();
    int resultado = calculadora.suma(a, b, c);
    System.out.println("El resultado de la suma es: " + resultado);
```
## Segunda Parte

- Crear una clase coche.
- Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
- Una función que incremente el número de puertas que tiene el coche.
- Crear un objeto miCoche en el main y añadirle una puerta.
- Mostrar el número de puertas que tiene el objeto.

```sh
    try {
        Coche miCoche = new Coche(numeroPuertas);
        miCoche.agregarPuerta();
        System.out.println(
            "La cantidad de puertas del coche es: " + 
            miCoche.getNumeroPuertas()
        );
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
```
