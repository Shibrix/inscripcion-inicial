package es.aula.inscripcion;

import java.io.IOException;

import javafx.fxml.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.stage.*;
import java.time.LocalDate;

public class InicioController {

	@FXML
	private Button inscribirse;

	
	@FXML
	private void irInscripciones() {
		try {
			Parent nuevaRaiz = FXMLLoader.load(getClass().getResource("/es/aula/inscripcion/inscripciones.fxml"));
			Stage ventana = (Stage)inscribirse.getScene().getWindow();
			Scene nuevaEscena = new Scene(nuevaRaiz);
			ventana.setScene(nuevaEscena);
			
			ventana.sizeToScene();
			
			ventana.setMinWidth(ventana.getWidth());
			ventana.setMinHeight(ventana.getHeight());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
