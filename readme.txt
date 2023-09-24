Nombre: Javier Matamala
Rol: 202273560-0

Versión 2.04 24 Sep 2023
Compilado con javac 11.0.20.1 desde WSL Ubuntu 22.042.04 24 Sep 2023
 
Copyright (c) 2023 Javier Matamala.
Todos los derechos reservados.


Instrucciones de Compilación:
- Extraer todos los archivos que se encuentran en el .tar.gz que se entrega en un directorio vacío.
- En el directorio recién creado, abrir una terminal que sea capaz de ejecutar javac y make.
- Para compilar todos los archivos, escribir en la terminal 'make main'.
- Una vez compilados todos los archivos, se ejecuta el juego escribiendo 'java Juego'.
- Para borrar los archivos .class se puede ejecutar el comando 'make delete' (usado para testear).

Como jugar:
Controlas al astronauta Lomiar, un Capitán espacial que quedó varado en un planeta sin nombre, a recuperar las 3 piezas de su nave.
Tienes que investigar un mapa, donde en cada turno será visible el estado de los Pikinim,
las piezas que lleva, y elegir si ir a la zona de la izquierda y la derecha.
Tienes 30 turnos para encontrar todas las piezas, y moverse a una zona del mapa implica pasar 1 turno.
Dentro de cada zona, el jugador puede encontrar enemigos, murallas destructibles, una pieza de la nave, o una píldora.
Cada zona interactúa de forma distinta con los Pikinim del jugador:
 - Las murallas destructibles pueden interrumpir tu camino.
 - Puedes pelear contra un enemigo en un arduo combate turno a turno.
 - Las píldoras te permiten aumentar los Pikinim que te acompañan.
Cuando ya no queden acciones por realizar en la zona, se indicará a través de un diálogo.
Si recuperas todas las piezas de la nave dentro de los 30 turnos, ganas el juego,
de lo contrario, pierdes y el capitán Lomiar no podrá volver a su hogar.
También puede perder si en alguna pelea te quedas sin Pikinim.