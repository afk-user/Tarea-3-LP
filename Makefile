main: creatures zones Juego.java
	javac Juego.java

creatures: pikinim/Amarillo.java pikinim/Cyan.java pikinim/Magenta.java pikinim/Pikinim.java
	javac pikinim/*.java

zones: zona/Enemigo.java zona/ILevantar.java zona/Muralla.java zona/Pieza.java zona/Pildora.java zona/Zona.java
	javac zona/*.java

clean:
	rm Juego.class
	rm pikinim/*.class
	rm zona/*.class

compress: Amarillo.java Cyan.java Enemigo.java ILevantar.java Juego.java Magenta.java Muralla.java Pieza.java Pikinim.java Pildora.java Zona.java Makefile readme.txt
	tar -czf Tarea3LP_202273560-0.tar.gz Amarillo.java Cyan.java Enemigo.java ILevantar.java Juego.java Magenta.java Muralla.java Pieza.java Pikinim.java Pildora.java Zona.java Makefile readme.txt