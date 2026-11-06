package es.aula.inscripcion;

import java.io.IOException;
import java.time.LocalDate;

import javafx.beans.binding.Bindings;
import javafx.fxml.*;
import javafx.scene.control.Button;
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
	private Button botonAniadir;

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

		nombre.setStyle("");
		edad.setStyle("");
		telefono.setStyle("");
		email.setStyle("");
		combo.setStyle("");
		fecha.setStyle("");

		boolean error = true;
		boolean foco = false;

		if (nombre1.isEmpty() && edad1.isEmpty() && telefono1.isEmpty() && email1.isEmpty() && (combo1==null || combo1.isEmpty())
				&& fecha1 == null) {
			mostrarResumen.setStyle("-fx-text-fill: red");
			mostrarResumen.setText("Faltan campos por rellenar");
			mostrarResumen.setVisible(true);
			if (!foco) {
				nombre.requestFocus();
				nombre.setStyle("-fx-border-color:red");
				edad.setStyle("-fx-border-color:red");
				telefono.setStyle("-fx-border-color:red");
				email.setStyle("-fx-border-color:red");
				combo.setStyle("-fx-border-color:red");
				fecha.setStyle("-fx-border-color:red");
				foco = true;
			}
			error = false;
			return;
		}

		if (nombre1.isEmpty()) {
			mostrarResumen.setStyle("-fx-text-fill: red");
			mostrarResumen.setText("Debe introducir el nombre");
			mostrarResumen.setVisible(true);
			if (!foco) {
				nombre.requestFocus();
				nombre.setStyle("-fx-border-color:red");
				foco = true;
			}
			error = false;
			return;
		}

		if (edad1.isEmpty()) {
			mostrarResumen.setStyle("-fx-text-fill: red");
			mostrarResumen.setText("Debe introducir la edad");
			mostrarResumen.setVisible(true);
			if (!foco) {
				edad.requestFocus();
				edad.setStyle("-fx-border-color:red");
				foco = true;
			}
			error = false;
			return;
		}

		if (telefono1.isEmpty()) {
			mostrarResumen.setStyle("-fx-text-fill: red");
			mostrarResumen.setText("Debe introducir el teléfono");
			mostrarResumen.setVisible(true);
			if (!foco) {
				telefono.requestFocus();
				telefono.setStyle("-fx-border-color:red");
				foco = true;
			}
			error = false;
			return;
		}

		if (edad1.isEmpty()) {
			mostrarResumen.setStyle("-fx-text-fill: red;");
			mostrarResumen.setText("Debe introducir la edad");
			mostrarResumen.setVisible(true);
			if (!foco) {
				edad.requestFocus();
				edad.setStyle("-fx-border-color:red");
				foco = true;
			}
			error = false;
			return;
		}

		if (email1.isEmpty()) {
			mostrarResumen.setStyle("-fx-text-fill: red;");
			mostrarResumen.setText("Debe introducir el email");
			mostrarResumen.setVisible(true);
			if (!foco) {
				email.requestFocus();
				email.setStyle("-fx-border-color:red");
				foco = true;
			}
			error = false;
			return;
		}

		if (combo1.isEmpty()) {
			mostrarResumen.setStyle("-fx-text-fill: red");
			mostrarResumen.setText("Debe seleccionar un curso");
			mostrarResumen.setVisible(true);
			if (!foco) {
				combo.requestFocus();
				combo.setStyle("-fx-border-color:red");
				foco = true;
			}
			error = false;
			return;
		}

		if (fecha1 == null) {
			mostrarResumen.setStyle("-fx-text-fill: red");
			mostrarResumen.setText("Debe seleccionar la fecha de realización");
			mostrarResumen.setVisible(true);
			if (!foco) {
				fecha.requestFocus();
				fecha.setStyle("-fx-border-color:red");
				foco = true;
			}
			error = false;
			return;
		}

		if (!email.getText().matches("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$")) {
			mostrarResumen.setStyle("-fx-text-fill: red");
			mostrarResumen.setText("El correo debe seguir el patrón usuario@dominio");
			mostrarResumen.setVisible(true);
			if (!foco) {
				email.requestFocus();
				foco = true;
			}
			error = false;
			return;
		}
		String casilla;

		if (check1 == true) {
			casilla = "seleccionado";
		} else {
			casilla = "no seleccionado";
		}

		if (error) {
			String textoResumen = nombre1 + ", " + edad1 + ", " + telefono1 + ", " + email1 + ", " + combo1 + ", "
					+ fecha1 + ", " + observaciones1 + ", " + casilla;

			mostrarResumen.setText(textoResumen);
			mostrarResumen.setVisible(true);
		}

	}

	@FXML
	private void aniadir() {
		String nombre1 = nombre.getText();
		String edad1 = edad.getText();
		String telefono1 = telefono.getText();
		String email1 = email.getText();
		String combo1 = combo.getValue();
		LocalDate fecha1 = fecha.getValue();
		String observaciones1 = observaciones.getText();
		boolean check1 = check.isSelected();

		nombre.setStyle("");
		edad.setStyle("");
		telefono.setStyle("");
		email.setStyle("");
		combo.setStyle("");
		fecha.setStyle("");

		boolean error = true;
		boolean foco = false;

		if (nombre1.isEmpty() && edad1.isEmpty() && telefono1.isEmpty() && email1.isEmpty() && combo1==null || (combo1.isEmpty())
				&& fecha1 == null) {

			mostrarResumen.setStyle("-fx-text-fill: red");
			mostrarResumen.setText("Faltan campos por rellenar");
			mostrarResumen.setVisible(true);
			if (!foco) {
				nombre.requestFocus();
				nombre.setStyle("-fx-border-color:red");
				edad.setStyle("-fx-border-color:red");
				telefono.setStyle("-fx-border-color:red");
				email.setStyle("-fx-border-color:red");
				combo.setStyle("-fx-border-color:red");
				fecha.setStyle("-fx-border-color:red");
				foco = true;
			}
			error = false;
			return;
		}

		if (nombre1.isEmpty()) {
			mostrarResumen.setStyle("-fx-text-fill: red");
			mostrarResumen.setText("Debe introducir el nombre");
			mostrarResumen.setVisible(true);
			if (!foco) {
				nombre.requestFocus();
				nombre.setStyle("-fx-border-color:red");
				foco = true;
			}
			error = false;
			return;
		}

		if (edad1.isEmpty()) {
			mostrarResumen.setStyle("-fx-text-fill: red");
			mostrarResumen.setText("Debe introducir la edad");
			mostrarResumen.setVisible(true);
			if (!foco) {
				edad.requestFocus();
				edad.setStyle("-fx-border-color:red");
				foco = true;
			}
			error = false;
			return;
		}

		if (telefono1.isEmpty()) {
			mostrarResumen.setStyle("-fx-text-fill: red");
			mostrarResumen.setText("Debe introducir el teléfono");
			mostrarResumen.setVisible(true);
			if (!foco) {
				telefono.requestFocus();
				telefono.setStyle("-fx-border-color:red");
				foco = true;
			}
			error = false;
			return;
		}

		if (edad1.isEmpty()) {
			mostrarResumen.setStyle("-fx-text-fill: red;");
			mostrarResumen.setText("Debe introducir la edad");
			mostrarResumen.setVisible(true);
			if (!foco) {
				edad.requestFocus();
				edad.setStyle("-fx-border-color:red");
				foco = true;
			}
			error = false;
			return;
		}

		if (email1.isEmpty()) {
			mostrarResumen.setStyle("-fx-text-fill: red;");
			mostrarResumen.setText("Debe introducir el email");
			mostrarResumen.setVisible(true);
			if (!foco) {
				email.requestFocus();
				email.setStyle("-fx-border-color:red");
				foco = true;
			}
			error = false;
			return;
		}

		if (combo1.isEmpty()) {
			mostrarResumen.setStyle("-fx-text-fill: red");
			mostrarResumen.setText("Debe seleccionar un curso");
			mostrarResumen.setVisible(true);
			if (!foco) {
				combo.requestFocus();
				combo.setStyle("-fx-border-color:red");
				foco = true;
			}
			error = false;
			return;
		}

		if (fecha1 == null) {
			mostrarResumen.setStyle("-fx-text-fill: red");
			mostrarResumen.setText("Debe seleccionar la fecha de realización");
			mostrarResumen.setVisible(true);
			if (!foco) {
				fecha.requestFocus();
				fecha.setStyle("-fx-border-color:red");
				foco = true;
			}
			error = false;
			return;
		}

		if (!email.getText().matches("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$")) {
			mostrarResumen.setStyle("-fx-text-fill: red");
			mostrarResumen.setText("El correo debe seguir el patrón usuario@dominio");
			mostrarResumen.setVisible(true);
			if (!foco) {
				email.requestFocus();
				foco = true;
			}
			error = false;
			return;
		}
		String casilla;

		if (check1 == true) {
			casilla = "seleccionado";
		} else {
			casilla = "no seleccionado";
		}
		if (error) {

			int edadParseada = Integer.parseInt(edad1);
			int telefonoParseado = Integer.parseInt(telefono1);

			InscripcionCrochet ins = new InscripcionCrochet(nombre1, edadParseada, telefonoParseado, email1, combo1,
					fecha1, observaciones1, check1);
			GuardarDatos.getInscripciones().add(ins);
		}

		try {
			Parent nuevaRaiz = FXMLLoader.load(getClass().getResource("/es/aula/inscripcion/inscripciones.fxml"));
			Stage ventana = (Stage) botonAniadir.getScene().getWindow();

			ventana.setMinWidth(0);
			ventana.setMinHeight(0);

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
