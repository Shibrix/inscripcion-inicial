package es.aula.inscripcion;

import java.io.IOException;

import javafx.beans.binding.Bindings;
import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.collections.transformation.SortedList;
import javafx.fxml.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.stage.*;
import java.time.LocalDate;

public class InscripcionCrochetController {

	@FXML
	private Button inscribirse;

	@FXML
	private Button eliminar;

	@FXML
	private Button volver;

	@FXML
	private TableView<InscripcionCrochet> tabla;

	@FXML
	private TableColumn<InscripcionCrochet, String> nombre;

	@FXML
	private TableColumn<InscripcionCrochet, Integer> edad;

	@FXML
	private TableColumn<InscripcionCrochet, Integer> telefono;

	@FXML
	private TableColumn<InscripcionCrochet, String> email;

	@FXML
	private TableColumn<InscripcionCrochet, String> curso;

	@FXML
	private TableColumn<InscripcionCrochet, LocalDate> fecha;

	@FXML
	private TableColumn<InscripcionCrochet, String> observaciones;

	@FXML
	private TableColumn<InscripcionCrochet, Boolean> newsletter;

	@FXML
	private Label mostrarNom;

	@FXML
	private Label mostrarEd;

	@FXML
	private Label mostrarTel;

	@FXML
	private Label mostrarEmail;

	@FXML
	private Label mostrarCur;

	@FXML
	private Label mostrarFech;

	@FXML
	private Label mostrarOb;

	@FXML
	private Label mostrarNew;

	@FXML
	private Label mostrarMensaje;

	@FXML
	private Label contador;

	@FXML
	void initialize() {
		tabla.setPlaceholder(new Label("No hay inscripciones que mostrar"));
		tabla.setItems(GuardarDatos.getInscripciones());

		SortedList<InscripcionCrochet> ordenada = new SortedList<>(GuardarDatos.getInscripciones());
		ordenada.comparatorProperty().bind(tabla.comparatorProperty());
		tabla.setItems(ordenada);

	
		contador.textProperty().bind(Bindings.size(GuardarDatos.getInscripciones()).asString("Contador de inscripciones: %d"));
		
		eliminar.disableProperty().bind(tabla.getSelectionModel().selectedItemProperty().isNull());
	

		nombre.setCellValueFactory(registro -> registro.getValue().NombreProperty());
		edad.setCellValueFactory(registro -> registro.getValue().EdadProperty().asObject());
		telefono.setCellValueFactory(registro -> registro.getValue().TelefonoProperty().asObject());
		email.setCellValueFactory(registro -> registro.getValue().EmailProperty());
		curso.setCellValueFactory(registro -> registro.getValue().CursoProperty());
		fecha.setCellValueFactory(registro -> registro.getValue().FechaProperty());
		observaciones.setCellValueFactory(registro -> registro.getValue().ObservacionesProperty());
		newsletter.setCellValueFactory(registro -> registro.getValue().CheckboxProperty());
		newsletter.setCellFactory(columna -> new TableCell<InscripcionCrochet, Boolean>() {
			@Override
			protected void updateItem(Boolean marcado, boolean empty) {
				super.updateItem(marcado, empty);

				if (empty || marcado == null) {
					setText(null);
				} else if (marcado) {
					setText("Subscrito");
				} else {
					setText("No subscrito");
				}
			}
		});
		tabla.getSelectionModel().selectedItemProperty().addListener((observable, anterior, actual) -> {
			mostrarDetalle(actual);
		});
		mostrarDetalle(null);

	}

	@FXML
	private void irFormulario() {
		try {
			Parent nuevaRaiz = FXMLLoader.load(getClass().getResource("/es/aula/inscripcion/formulario.fxml"));
			Stage ventana = (Stage) inscribirse.getScene().getWindow();

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
	private void irInicio() {
		try {
			Parent nuevaRaiz = FXMLLoader.load(getClass().getResource("/es/aula/inscripcion/inicio.fxml"));
			Stage ventana = (Stage) inscribirse.getScene().getWindow();

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
	private void mostrarDetalle(InscripcionCrochet crochet) {
		if (crochet == null) {
			mostrarNom.setText("Selecciona una inscripción");
			mostrarEd.setText("—");
			mostrarTel.setText("—");
			mostrarEmail.setText("—");
			mostrarCur.setText("—");
			mostrarFech.setText("—");
			mostrarOb.setText("—");
			mostrarNew.setText("—");
			return;
		}

		mostrarNom.setText(crochet.getNombre());
		mostrarEd.setText(String.valueOf(crochet.getEdad()));
		mostrarTel.setText(String.valueOf(crochet.getTelefono()));
		mostrarEmail.setText(crochet.getEmail().toString());
		mostrarCur.setText(crochet.getCurso().toString());
		mostrarFech.setText(crochet.getFecha().toString());
		mostrarOb.setText(crochet.getObservaciones().toString());
		boolean news = crochet.getCheckbox();
		if (news == true) {
			mostrarNew.setText("Subscrito");
		} else {
			mostrarNew.setText("No subscrito");
		}

	}

	@FXML
	public void eliminarRegistro() {
		InscripcionCrochet crochet = tabla.getSelectionModel().getSelectedItem();

		if (crochet != null) {
			GuardarDatos.getInscripciones().remove(crochet);
			mostrarMensaje.setStyle("-fx-text-fill:#173b73");
			mostrarMensaje.setText("Registro eliminado correctamente");
		} else {
			mostrarMensaje.setStyle("-fx-text-fill: red");
			mostrarMensaje.setText("Debe seleccionar una inscripción para poder borrarla");
		}

	}

}
