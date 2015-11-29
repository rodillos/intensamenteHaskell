import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;

public class TestRememorar {

	private Niña riley = new Niña(11);
	private Alegria alegria = new Alegria();
	private Date fecha = new Date ();
	private ArrayList<Recuerdo> recuerdosTest = new ArrayList<Recuerdo>();
	private Recuerdo recuerdo1 = new Recuerdo();
	private Recuerdo recuerdo2 = new Recuerdo();
	private Recuerdo recuerdo3 = new Recuerdo();
	
	@Before
	//9.Cantidad de repeticiones de un recuerdo en la memoria a largo plazo.
	public void antesQue9(){
		recuerdo1.establecerDescripcion("saltar la soga");
		recuerdo2.establecerDescripcion("jugar al futbol");
		recuerdo3.establecerDescripcion("pasear al perro");
		recuerdosTest.add(recuerdo1);
		recuerdosTest.add(recuerdo2);
		recuerdosTest.add(recuerdo3);
		int iterador = 0;
		while (iterador < recuerdosTest.size()){
			recuerdosTest.get(iterador).establecerEmocionDominante(alegria);
			recuerdosTest.get(iterador).establecerFecha(fecha);
			iterador++;
		}
		riley.memoriaALargoPlazo.add(recuerdo1);
		riley.memoriaALargoPlazo.add(recuerdo2);
		riley.memoriaALargoPlazo.add(recuerdo1);
		riley.memoriaALargoPlazo.add(recuerdo3);
		riley.memoriaALargoPlazo.add(recuerdo1);
	}
	
	@Test
	public void conocercCantidadDeRepeticiones(){
		assertEquals(3 , riley.cantidadDeRepeticionesDeUnRecuerdo(recuerdo1));
		assertEquals(1 , riley.cantidadDeRepeticionesDeUnRecuerdo(recuerdo2));
		assertEquals(1 , riley.cantidadDeRepeticionesDeUnRecuerdo(recuerdo3));
	}
	
	
}

