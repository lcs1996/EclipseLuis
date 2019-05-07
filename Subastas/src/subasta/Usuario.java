package subasta;
/**
 * Define la clase Usuario de la aplicación de subastas.
Un usuario se caracteriza por dos propiedades (consultables):
- nombre: es una cadena que almacena el nombre del usuario. El valor de esta
propiedad no podrá variar una vez establecida en la construcción.
- crédito: número real que corresponde con el dinero disponible para poder pujar
en las subastas.
La clase ofrece dos constructores. El primer constructor recibe como parámetros
las dos propiedades del tipo de datos (nombre y crédito). El segundo constructor
solo recibe el nombre, quedando el crédito inicialmente con valor 50 (constante).
La funcionalidad de la clase es:
- incrementar crédito: incrementa el crédito del usuario en una cantidad
(parámetro).
- decrementar crédito: decrementar el crédito del usuario en una cantidad.
 * @author Luis, Marouan
 */
public class Usuario {
	
	//ATRRIBUTOS
	String nombre;
	double credito;
	final static double CREDITO_MINIMO = 50;
	
	//GETTERS & SETTERS	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getCredito() {
		return credito;
	}

	public void setCredito(double credito) {
		this.credito = credito;
	}
	
	//CONSTRUCTORES
	public Usuario(String nombre, double credito) {
		this.nombre = nombre;
		this.credito = credito;
	}
	
	public Usuario(String nombre) {
		this.nombre = nombre;
		this.credito = 50;
	}
	
	//MÉTODOS
	public void addCredito(double saldo) {
		this.credito += saldo;
	}

	public void subCredito(double saldo) {
		this.credito -=saldo;
	}
	
	public boolean equals(Object u2) {
		boolean equals=false;
		if(u2 instanceof Usuario) {
			if(((Usuario) u2).getNombre()==this.getNombre()) {
				equals=true;
			}
		}
		return equals;		
	}
}