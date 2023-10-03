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

compress: pikinim/Amarillo.java pikinim/Cyan.java pikinim/Magenta.java pikinim/Pikinim.java zona/Enemigo.java zona/ILevantar.java zona/Muralla.java zona/Pieza.java zona/Pildora.java zona/Zona.java Juego.java Makefile readme.txt
	tar -czf Tarea3LP_202273560-0.tar.gz pikinim zona Juego.java Makefile readme.txt