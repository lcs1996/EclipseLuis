package subasta;
/**
 * Define la clase Subasta que representa un producto por el que se pueden realizar
pujas.
Las propiedades que caracterizan a una subasta son (todas consultables):
- nombre del producto: cadena que describe el producto subastado.
- propietario: referencia al objeto Usuario que es propietario de la subasta.
- abierta: valor booleano que indica si la subasta está abierta o cerrada. El valor
true significa que está abierta. En cambio, el valor false indica que está
cerrada.
- pujas: lista de pujas realizadas por el producto que ofrece la subasta.
Nota: los objetos de tipo Puja se pueden compartir sin riesgo. Sin embargo, la
lista que contiene todas las pujas no debe ser compartida. Así pues, el método
de consulta de esta propiedad debe realizar una copia defensiva de la lista para
evitar el riesgo de aliasing.
- puja mayor: referencia al objeto Puja con la cantidad mayor ofrecida en la
subasta (propiedad calculada). En caso de que no existan pujas, el valor de
esta propiedad es null.
 * @author Luis, Marouan
 */
import java.util.ArrayList;

public class Subasta {
	private String nomProducto;
	private Usuario propietario;
	Boolean abierta;
	ArrayList<String> pujas = new ArrayList<String>();
	
	public Subasta(String nomProducto,Usuario propietario,Boolean abierta) {
		this.nomProducto=nomProducto;
		this.propietario=propietario;
		this.abierta=true;
	}
	
	public void pujaMax() {
		String ultimo = pujas.get(pujas.size() - 1);
	}
	
	public void ejecutar() {
		for (String string : pujas) {
			System.out.println("Elemento: " + pujas);
		}
	}
}
