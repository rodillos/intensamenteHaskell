import static org.junit.Assert.*;

import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;

public class TestRememorar {

	private Niña riley = new Niña(11);
	private Niña riley1 = new Niña(11);
	private Niña riley2 = new Niña(11);
	private Alegria alegria = new Alegria();
	private int añoTest = 1999;
	private int mesTest = 0; 
	private int diaTest = 19; 
	private ArrayList<Recuerdo> recuerdosTest = new ArrayList<Recuerdo>();
	private Recuerdo recuerdo1 = new Recuerdo();
	private Recuerdo recuerdo2 = new Recuerdo();
	private Recuerdo recuerdo3 = new Recuerdo();
	
	@Before
	//8.Hacer rememorar algo a Riley
	public void antesQue8(){
		recuerdo1.establecerDescripcion("saltar la soga");
		recuerdo1.establecerEmocionDominante(alegria);
		recuerdo1.establecerFecha(añoTest , mesTest , diaTest);
		riley2.establecerEmocionDominante(alegria);
		riley2.memoriaALargoPlazo.add(recuerdo1);
		riley2.memoriaALargoPlazo.add(recuerdo2);
		riley2.memoriaALargoPlazo.add(recuerdo3);
	}
	
	@Test
	public void hacerRememorar(){
		assertEquals(recuerdo1.obtenerDescripcion(), riley2.rememorar().obtenerDescripcion());
		assertEquals(recuerdo1.obtenerEmocionDominante(), riley2.rememorar().obtenerEmocionDominante());
		assertEquals(recuerdo1.obtenerAño(), riley2.rememorar().obtenerAño());
		assertEquals(recuerdo1.obtenerMes(), riley2.rememorar().obtenerMes());
		assertEquals(recuerdo1.obtenerDia(), riley2.rememorar().obtenerDia());
	}
	
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
			recuerdosTest.get(iterador).establecerFecha(añoTest, mesTest , diaTest);
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
	
	@Before
	//10.Saber si Riley esta teniendo un Deja vu
	public void antesQue10(){
		recuerdo1.establecerDescripcion("saltar la soga");
		recuerdo2.establecerDescripcion("jugar al futbol");
		recuerdo3.establecerDescripcion("pasear al perro");
		recuerdosTest.add(recuerdo1);
		recuerdosTest.add(recuerdo2);
		recuerdosTest.add(recuerdo3);
		int iterador = 0;
		while (iterador < recuerdosTest.size()){
			recuerdosTest.get(iterador).establecerEmocionDominante(alegria);
			recuerdosTest.get(iterador).establecerFecha(añoTest , mesTest , diaTest);
			iterador++;
		}
		riley1.pensamientoActual = recuerdo1;
		riley1.memoriaALargoPlazo.add(recuerdo1);
		riley1.memoriaALargoPlazo.add(recuerdo2);
		riley1.memoriaALargoPlazo.add(recuerdo1);
		riley1.memoriaALargoPlazo.add(recuerdo3);
		riley1.memoriaALargoPlazo.add(recuerdo1);
		}
	
	@Test
	public void conocerSiEsDejaVu(){
		assert(riley1.tieneUnDejaVu());
	}
}

