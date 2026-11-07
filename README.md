# Plantilla inicial: inscripción a una actividad

Proyecto mínimo para la práctica de consolidación de Desarrollo de Interfaces.
Incluye Java 21, JavaFX 21.0.12, Maven y una ventana con una etiqueta.

## 1. Importar en Eclipse

1. Descomprime el ZIP en una carpeta de trabajo. No trabajes dentro del ZIP.
2. En Eclipse: File > Import > Maven > Existing Maven Projects.
3. En Root Directory selecciona la carpeta `inscripcion-inicial` que contiene `pom.xml`.
4. Selecciona el proyecto y pulsa Finish. Espera a que Maven descargue las dependencias.

No necesitas instalar el SDK de JavaFX ni Maven por separado si tu Eclipse ya tiene integración Maven.
La primera ejecución necesita conexión a Internet para descargar las dependencias que falten.

## 2. Ejecutar

1. Clic derecho en el proyecto > Run As > Maven build…
2. En Goals escribe: `clean javafx:run`.
3. En la pestaña JRE selecciona el JDK 21 instalado (Alternate JRE).
4. Pulsa Apply y después Run.

La ventana debe mostrar «Mi aplicación de inscripción».
Para repetir: Run > Run Configurations > Maven Build y selecciona esta configuración guardada.
No ejecutes App mediante Run As > Java Application.

Si no aparece el JDK: Window > Preferences > Java > Installed JREs > Add > Standard VM,
selecciona su carpeta de instalación y vuelve a elegirlo en la configuración Maven.
El pom hace que la aplicación use el mismo Java con el que se ejecuta Maven.

## 3. Trabajar en la práctica

- Abre `src/main/resources/es/aula/inscripcion/inicio.fxml` desde Scene Builder (File > Open).
- Construye la bienvenida y crea la segunda vista en esa misma carpeta de recursos.
- Crea tus controladores dentro de `src/main/java/es/aula/inscripcion`.
- Añade tu hoja CSS junto a los FXML y enlázala desde las vistas o desde la Scene.
- Guarda en Scene Builder y actualiza el proyecto con F5 en Eclipse si fuera necesario.
- Ejecuta después de cada cambio importante.

La plantilla no incluye controlador, navegación, formulario ni CSS resueltos.
El FXML inicial no necesita controlador porque solo muestra una etiqueta.
Cuando añadas eventos, crea el controlador y asigna su nombre completo en Scene Builder.
Si conservas el paquete y la clase App no necesitas modificar el pom.xml.

## 4. Git y entrega

El ZIP no contiene un repositorio Git. Inicializa uno en esta carpeta con el procedimiento
utilizado en clase (en Eclipse: Team > Share Project > Git).
Haz un primer commit de la plantilla y otro significativo al finalizar cada sesión.
Entrega el proyecto sin la carpeta target. Completa este README con:

- Nombre del alumno: Ruth Velázquez Aznárez

- Temática elegida: Ganchillo

- Funcionalidades realizadas y pendientes:
	Las funcionalidades realizadas son las siguientes:
	1. Navegación completa entre pantallas, siguiendo el siguiente esquema:
		- Inicio>tabla de inscripciones
		- Desde tabla de inscripciones si le das al botón de volver regresa a la pantalla de inicio. Si le das al botón de
			inscribirse accede directamente al formulario.
		- Desde el formulario tanto si le das al botón de volver como al botón de añadir, regresas a la pantalla de inscripciones.
	2. Formulario de inscripción con diferentes campos y botones, abarcando nombre y apellidos, edad, teléfono, email, desplegable de
	cursos a elegir, datepicker, campo de observaciones y check de newsletter.
	3. Sistema de validación y gestión de errores: si le das al botón de añadir o resumen y los campos están vacíos se indica tanto con
	un mensaje como con el bordeado en rojo de los campos, con redirección al primer campo vacío. También hay una validación individual para
	cada campo, con mensaje de error concreto y reborde del campo en rojo. Sólamente cuando todos los campos están rellenos y son correctos (salvo
	el de observaciones y el checkbox que son opcionales) permite al usuario obtener un resumen o bien añadir la inscripción.
	4. Vista previa en tiempo real: combina automáticamente el campo de nombre con el de curso mediante un bind.
	5. Tabla interactiva de inscripciones: presentación de inscripciones mediante carga de colecciones observables. También permite la ordenación
	de las inscripciones al pulsar sobre las cabeceras de las columnas. La columna de newsletter muestra "Subscrito" o "No subscrito" en vez de true
	o false
	6. Panel lateral para mostrar los detalles: si no hay registros seleccionados no muestra nada. Al marcar un registro vuelca los datos
	automáticamente.
	7. Control del apartado contador y el bloqueo del botón eliminar: al introducir un nuevo registro el contador aumenta. Si eliminamos
	un registro el contador disminuye. Se muestra un texto de "registro eliminado correctamente". El botón de eliminar está deshabilitado
	por defecto hasta que no se pinche en un registro.
	
	Las funcionalidades pendientes son todas las relativas a los apartados opcionales por falta de tiempo.
	
- Comprobación por un compañero y mejora realizada: mi compañero Carlos ha revisado tanto los bocetos como el funcionamiento. En cuanto
a los bocetos me indicó que son muy descriptivos y que se entienden perfectamente. En cuanto al funcionamiento no ha tenido nada que comentar.

- Uso de IA, si lo ha habido: solamente la he usado para poder acoplar bien los tamaños de las pantallas cuando cambiaba de una a otra, ya
que estaba siendo incapaz de hacerlo por mi cuenta.

- Pruebas de contraste: se realizan pruebas de contraste mediante la aplicación pick color online. Se obtiene resultados de 6:1. Se adjunta una
captura en el apartado de bocetos de GitHub

- El último commit realizado ha sido el dfce7f0e54523cae869aa2dabe066a2d435c39a2 

Referencia de configuración: https://openjfx.io/openjfx-docs/
