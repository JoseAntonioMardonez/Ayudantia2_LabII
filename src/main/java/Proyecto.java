import java.util.ArrayList;

public class Proyecto {
	private String nombre;
	private String descripcion;
	private ArrayList<Empleado> empleados = new ArrayList<Empleado>();

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}