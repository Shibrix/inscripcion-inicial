package es.aula.inscripcion;

import java.time.LocalDate;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class InscripcionCrochet {
	// ATRIBUTOS
	private final StringProperty nombre = new SimpleStringProperty();
	private final IntegerProperty edad = new SimpleIntegerProperty();
	private final IntegerProperty telefono = new SimpleIntegerProperty();
	private final StringProperty email = new SimpleStringProperty();
	private final StringProperty curso = new SimpleStringProperty();
	private final ObjectProperty<LocalDate> fecha = new SimpleObjectProperty<>();
	private final StringProperty observaciones = new SimpleStringProperty();
	private final BooleanProperty checkbox = new SimpleBooleanProperty();

	// CONSTRUCTOR
	public InscripcionCrochet(String nombre, int edad, int telefono, String email, String curso, LocalDate fecha,
			String observaciones, boolean checkbox) {
		this.nombre.set(nombre);
		this.edad.set(edad);
		this.telefono.set(telefono);
		this.email.set(email);
		this.curso.set(curso);
		this.fecha.set(fecha);
		this.observaciones.set(observaciones);
		this.checkbox.set(checkbox);
	}

	// GETTER Y SETTER
	public String getNombre() {
		return nombre.get();
	}
	public StringProperty NombreProperty() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre.set(nombre);
	}

	public IntegerProperty EdadProperty() {
		return edad;
	}
	public int getEdad() {
		return edad.get();
	}

	public void setEdad(int edad) {
		this.edad.set(edad);
	}

	public IntegerProperty TelefonoProperty() {
		return telefono;
	}
	public int getTelefono() {
		return telefono.get();
	}

	public void setTelefono(int telefono) {
		this.telefono.set(telefono);
	}

	public StringProperty EmailProperty() {
		return email;
	}
	
	public String getEmail() {
		return email.get();
	}

	public void setEmail(String email) {
		this.email.set(email);
	}

	public String getCurso() {
		return curso.get();
	}
	
	public StringProperty CursoProperty() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso.set(curso);
	}

	public ObjectProperty<LocalDate> FechaProperty() {
		return fecha;
	}
	
	public LocalDate getFecha() {
		return fecha.get();
	}

	public void setFecha(LocalDate fecha) {
		this.fecha.set(fecha);
	}

	public StringProperty ObservacionesProperty() {
		return observaciones;
	}
	
	public String getObservaciones() {
		return observaciones.get();
	}

	public void setObservaciones(String observaciones) {
		this.observaciones.set(observaciones);
	}

	public BooleanProperty CheckboxProperty() {
		return checkbox;
	}
	
	public boolean getCheckbox() {
		return checkbox.get();
	}

	public void setCheckbox(boolean checkbox) {
		this.checkbox.set(checkbox);
	}

}
