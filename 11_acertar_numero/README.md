# Ejercicio 11 - Acertar número

Crea un minijuego en el que el ordenador elija un número aleatorio comprendido entre 0 y 100 para que el usuario intente adivinarlo. 

Cada vez que el usuario haga un intento le daremos pistas de si el número que busca es más alto o más bajo que el que ha escrito, hasta que acierte o escriba la palabra `FIN` para terminar el juego.

En caso de acertar el numero aleatorio se mostrará la cantidad de intentos.

Para obtener números aleatorios, haremos lo siguiente:

```java
Random r = new Random();

int aleatorio = r.nextInt(100);
```
