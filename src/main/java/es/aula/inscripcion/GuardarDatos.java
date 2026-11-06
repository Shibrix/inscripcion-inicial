package es.aula.inscripcion;

import java.time.LocalDate;

import javafx.*;
import javafx.collections.*;

public final class GuardarDatos {

	private static final ObservableList<InscripcionCrochet> inscripciones =
			FXCollections.observableArrayList(
				new InscripcionCrochet("Ruth Velázquez",30,111111111,"ruth.velazquez@gmail.com","Curso intermedio adulto",LocalDate.of(2026, 11, 06),"",true),
				new InscripcionCrochet("Cristian Devolx",33,222222222,"cristian.devolx@gmail.com","Curso de principiante adulto",LocalDate.of(2026, 11, 10),"",false),
				new InscripcionCrochet("Macarena Jiménes",45,444444444,"macax@gmail.com","Curso intermedio adulto",LocalDate.of(2026, 12, 14),"Me encanta el crochet",true),
				new InscripcionCrochet("Margarita Flores",18,888888888,"margaaaFlor@gmail.es","Curso avanzado adulto",LocalDate.of(2026, 12, 4),"",true),
				new InscripcionCrochet("Izan de la Fuente",12,777777777,"madredeizan@outlook.com","Curso de principiante infantil",LocalDate.of(2026, 11, 26),"",false)
			);
	public static ObservableList<InscripcionCrochet> getInscripciones()
	{
		return inscripciones;
	}
}
