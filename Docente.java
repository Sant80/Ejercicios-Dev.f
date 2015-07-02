
public class Docente {
	private String nombre, apellido, tipo;
	private int horas;
	private int sueldoCiencias, sueldoLetras;
	private double descuento;
	private double sueldoNeto;

	public Docente(String nombre, String apellido, String tipo, int horas) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.tipo = tipo;
		this.horas = horas;
	}

	public void setProperties(String nombre, String apellido, String tipo, int horas) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.tipo = tipo;
		this.horas = horas;
		}

	public String getProperties() {
		return String.format("Nombre: %s \n Apellido: %s \n Tipo: %s \n Horas: %d \n", this.nombre, this.apellido, this.tipo, this.horas);
	}

	public String getFullName() {
		return String.format("Nombre completo: %s %s", this.nombre, this.apellido);
	}

	public int getPay(int s, String subject) {

		if (subject.equals("ciencias")) {
			 return sueldoCiencias = s * 3;
		}

		else {
			 return sueldoLetras = s / 5;			
		}
	}

	public double getDiscount(int sueldoBruto) {
		descuento = sueldoBruto * 0.10;
		return descuento;
	}

	public double getPayClean(int sueldoBruto) {
		sueldoNeto = sueldoBruto - descuento;
		return sueldoNeto;
	}


}