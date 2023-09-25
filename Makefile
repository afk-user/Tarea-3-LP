main: Amarillo.java Cyan.java Enemigo.java ILevantar.java Juego.java Magenta.java Muralla.java Pieza.java Pikinim.java Pildora.java Zona.java
	javac *.java

delete: Amarillo.class Cyan.class Enemigo.class ILevantable.class Juego.class Magenta.class Muralla.class Pieza.class Pikinim.class Pildora.class Zona.class
	rm *.class

compress: Amarillo.java Cyan.java Enemigo.java ILevantar.java Juego.java Magenta.java Muralla.java Pieza.java Pikinim.java Pildora.java Zona.java Makefile readme.txt
	tar -czf Tarea3LP_202273560-0.tar.gz Amarillo.java Cyan.java Enemigo.java ILevantar.java Juego.java Magenta.java Muralla.java Pieza.java Pikinim.java Pildora.java Zona.java Makefile readme.txt