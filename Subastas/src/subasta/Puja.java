package subasta;
/**
 * Define la clase Puja de la aplicación de subastas. Una puja representa la cantidad
de dinero que ofrece un usuario por el producto de una subasta.
Las propiedades que caracterizan a una Puja son (todas consultables):
- pujador: referencia al objeto Usuario que la realiza la puja.
- cantidad: número real que representa la cantidad de dinero que se ofrece en la
puja.
- subasta: referencia al objeto Subasta en la que se realiza la puja. La clase
Subasta se describe en el ejercicio siguiente.
Las propiedades no pueden ser modificadas. Como consecuencia, la clase Puja
permite construir objetos inmutables que se pueden compartir sin que el aliasing
comprometa la información.
Las pujas se construyen estableciendo las tres propiedades que caracterizan a la
clase.
Por último, la clase no proporciona ninguna funcionalidad.
 * @author Luis, Marouan
 *
 */
public class Puja {
	final Usuario pujador;
	final double cantidad;
	final Subasta subasta;
	
	public Puja(Usuario pujador,double cantidad,Subasta subasta) {
		this.pujador=pujador;
		this.cantidad=cantidad;
		this.subasta=subasta;
	}
}
