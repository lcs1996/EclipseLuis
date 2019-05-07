package subasta;
/**
 * 4. Escribe el siguiente programa:
- Crea tres usuarios con nombre "Juan", "Pedro" y "Enrique" con un crédito inicial
de 100, 150 y 300 euros, respectivamente.
- Crea una subasta del producto "Teléfono Móvil" cuyo propietario sea el usuario
Juan.
- El usuario Pedro puja por esa subasta 100 euros.
- Muestra en la consola la puja mayor de la subasta (nombre del usuario y
cantidad).
- El usuario Enrique puja por esa subasta 50 euros.
- Muestra en la consola la puja mayor. Comprueba que esta segunda puja no ha
sido acepta, ya que es menor que la primera.
- Ejecuta la subasta.
- El usuario Enrique puja de nuevo por esa subasta con 200 euros. Comprueba
que no es aceptada, ya que la subasta ha sido cerrada.
- Muestra por la consola los créditos de los tres usuarios. Observa que los
créditos de Juan y Pedro han cambiado.
 */
import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		
		Usuario usu1=new Usuario("Juan",100);
		Usuario usu2=new Usuario("Pedro",150);
		Usuario usu3=new Usuario("Enrique",300);
			
		Subasta sub1=new Subasta("Telefono móvil",usu1,true);
		
		Puja puj1=new Puja(usu2,100,sub1);
		
		sub1.pujaMax();
		
	}

}
