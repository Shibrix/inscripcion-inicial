package es.aula.inscripcion;

import java.io.IOException;
import java.time.LocalDate;

import javafx.fxml.*;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.*;
import javafx.scene.*;

public class FormularioController {
	@FXML
	private TextField nombre;
	@FXML
	private TextField edad;
	@FXML
	private TextField telefono;
	@FXML
	private TextField email;
	@FXML
	private ComboBox<String> combo;
	@FXML
	private DatePicker fecha;
	@FXML
	private TextArea observaciones;
	@FXML
	private CheckBox check;
	@FXML
	private Label mostrarResumen;

	@FXML
	private void resumen() {
		String nombre1 = nombre.getText();
		String edad1 = edad.getText();
		String telefono1 = telefono.getText();
		String email1 = email.getText();
		String combo1 = combo.getValue();
		LocalDate fecha1 = fecha.getValue();
		String observaciones1 = observaciones.getText();
		boolean check1 = check.isSelected();
		
		if(nombre1.isEmpty() || edad1.isEmpty() || telefono1.isEmpty() || email1.isEmpty() || combo1==null || fecha1 == null) {
			mostrarResumen.setStyle("-fx-text-fill: #d9534f;");
			mostrarResumen.setText("Faltan campos por rellenar");
	        mostrarResumen.setVisible(true);
	        return;
		}

		String textoResumen = nombre1 + ", " + edad1 + ", " + telefono1 + ", " + email1 + ", " + combo1 + ", " + fecha1
				+ ", " + observaciones1 + ", " + check1;

		mostrarResumen.setText(textoResumen);
		mostrarResumen.setVisible(true);

	}

	@FXML
	private void volver() {
		try {
			Parent raizInicio = FXMLLoader.load(getClass().getResource("/es/aula/inscripcion/inicio.fxml"));
			Stage ventana = (Stage) nombre.getScene().getWindow();
			ventana.getScene().setRoot(raizInicio);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
