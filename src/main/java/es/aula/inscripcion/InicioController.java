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
	private void irFormulario() {
		try {
			Parent nuevaRaiz = FXMLLoader.load(getClass().getResource("/es/aula/inscripcion/formulario.fxml"));
			Stage ventana = (Stage)inscribirse.getScene().getWindow();
			ventana.getScene().setRoot(nuevaRaiz);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
