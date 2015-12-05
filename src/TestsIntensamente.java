import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;

public class TestsIntensamente {
	private Niña riley;
	private Niña riley2;
	private Niña riley3;
	private Niña riley4;
	private Niña riley5;
	private Alegria alegria = new Alegria();
	private Tristeza tristeza = new Tristeza();
	private Furia furia = new Furia();
	private int añoTest = 1999;
	private int mesTest = 0; 
	private int diaTest = 19; 
	private ArrayList<Recuerdo> recuerdosTest = new ArrayList<Recuerdo>();
	private Recuerdo recuerdo1 = new Recuerdo();
	private Recuerdo recuerdo2 = new Recuerdo();
	private Recuerdo recuerdo3 = new Recuerdo();
	private Recuerdo recuerdo4 = new Recuerdo();
	private Recuerdo recuerdo5 = new Recuerdo();
	
	//1. Hacer que Riley viva un evento y 2. Asentar un Recuerdo. Probado en los estados Alegria, Tristeza y Furia.
	@Before
	public void antesQue1(){
		riley = new Niña(11);
		riley.establecerNivelDeFelicidad(1000);
		riley.establecerEmocionDominante(alegria);
		riley.vivir("ir a cursar paradigmas");
		riley.vivir("Cursar un martes");
		riley.vivir("Votar");
		riley.vivir("Tomar un helado de chocolate");
		riley.vivir("Pasear al perro");
		for (int posicion = 0; posicion < 5; posicion++) {
		riley.recuerdos.get(posicion).asentateEn(riley);
		}
	}
	
	@Test
	public void vivirAlegriaTest() {
		assertEquals(5 , riley.recuerdos.size());
		assertEquals(5 , riley.pensamientosCentrales.size());
		assertEquals(1000 , riley.obtenerNivelDeFelicidad(),0);
	}
	
	@Before
	public void antesQue2(){
		riley2 = new Niña(11);
		riley2.establecerNivelDeFelicidad(1000);
		riley2.establecerEmocionDominante(tristeza);
		riley2.vivir("ir a cursar paradigmas");
		riley2.vivir("Cursar un martes");
		riley2.vivir("Votar");
		riley2.vivir("Tomar un helado de chocolate");
		riley2.vivir("Pasear al perro");
		for (int posicion2 = 0; posicion2 < 5; posicion2++) {
			riley2.recuerdos.get(posicion2).asentateEn(riley2);
			}
	}
	
	@Test
	public void vivirTristezaTest(){
		assertEquals(5 , riley2.recuerdos.size(),0);
		assertEquals(5 , riley2.pensamientosCentrales.size(),0);
		assertEquals( 590.49 , riley2.obtenerNivelDeFelicidad(),0);
	}
	
	@Before
	public void antesQue3(){
		riley3 = new Niña(11);
		riley3.establecerNivelDeFelicidad(1000);
		riley3.establecerEmocionDominante(furia);
		riley3.vivir("ir a cursar paradigmas");
		riley3.vivir("Cursar un martes");
		riley3.vivir("Votar");
		riley3.vivir("Tomar un helado de chocolate");
		riley3.vivir("Pasear al perro");
		for (int posicion3 = 0; posicion3 < 5; posicion3++) {
			riley3.recuerdos.get(posicion3).asentateEn(riley3);
			}
	}
	
	@Test
	public void vivirFuriaTest(){
		assertEquals(0 , riley3.pensamientosCentrales.size());
		assertEquals(5 , riley3.recuerdos.size());
		assertEquals(1000 , riley3.obtenerNivelDeFelicidad(),0);
	}
	
	// 3. Conocer los recuerdos recientes.
	@Before 
	public void antesQue4(){
		recuerdo1.establecerDescripcion("ir a cursar paradigmas");
		recuerdo2.establecerDescripcion("Cursar un martes");
		recuerdo3.establecerDescripcion("Votar");
		recuerdo4.establecerDescripcion("Tomar un helado de chocolate");
		recuerdo5.establecerDescripcion("Pasear al perro");
		recuerdosTest.add(recuerdo1);
		recuerdosTest.add(recuerdo2);
		recuerdosTest.add(recuerdo3);
		recuerdosTest.add(recuerdo4);
		recuerdosTest.add(recuerdo5);
		for (int pos = 0; pos < 5; pos++){
			recuerdosTest.get(pos).establecerFecha(añoTest , mesTest , diaTest);
			recuerdosTest.get(pos).establecerEmocionDominante(alegria);
		}
		riley = new Niña(11);
		riley.establecerNivelDeFelicidad(1000);
		riley.establecerEmocionDominante(alegria);
		riley.recuerdos.add(recuerdo1);
		riley.recuerdos.add(recuerdo2);
		riley.recuerdos.add(recuerdo3);
		riley.recuerdos.add(recuerdo4);
		riley.recuerdos.add(recuerdo5);
		}
	
	@Test
	//No se hace la comparacion de los arrays directamente debido a que compara el codigo de la variable y no su contenido.
	public void conocerRecuerdosRecientes(){
		assertEquals(recuerdosTest.get(1).obtenerDescripcion(), riley.obtenerRecuerdosRecientes().get(0).obtenerDescripcion());
		assertEquals(recuerdosTest.get(2).obtenerDescripcion(), riley.obtenerRecuerdosRecientes().get(1).obtenerDescripcion());
		assertEquals(recuerdosTest.get(3).obtenerDescripcion(), riley.obtenerRecuerdosRecientes().get(2).obtenerDescripcion());
		assertEquals(recuerdosTest.get(4).obtenerDescripcion(), riley.obtenerRecuerdosRecientes().get(3).obtenerDescripcion());
		assertEquals(recuerdosTest.get(5).obtenerDescripcion(), riley.obtenerRecuerdosRecientes().get(4).obtenerDescripcion());
	}
	
	// 4. Conocer los pensamientos centrales.
	@Before 
	public void antesQue5(){
		recuerdo1.establecerDescripcion("ir a cursar paradigmas");
		recuerdo2.establecerDescripcion("Cursar un martes");
		recuerdo3.establecerDescripcion("Votar");
		recuerdo4.establecerDescripcion("Tomar un helado de chocolate");
		recuerdo5.establecerDescripcion("Pasear al perro");
		recuerdosTest.add(recuerdo1);
		recuerdosTest.add(recuerdo2);
		recuerdosTest.add(recuerdo3);
		recuerdosTest.add(recuerdo4);
		recuerdosTest.add(recuerdo5);
		for (int pos = 0; pos < 5; pos++){
			recuerdosTest.get(pos).establecerFecha(añoTest , mesTest , diaTest);
			recuerdosTest.get(pos).establecerEmocionDominante(alegria);
		}
		riley = new Niña(11);
		riley.establecerNivelDeFelicidad(1000);
		riley.establecerEmocionDominante(alegria);
		riley.recuerdos.add(recuerdo1);
		riley.recuerdos.add(recuerdo2);
		riley.recuerdos.add(recuerdo3);
		riley.recuerdos.add(recuerdo4);
		riley.recuerdos.add(recuerdo5);
		}
	
	@Test 
	public void conocerPensamientosCentrales(){
		//No se hace la comparacion de los arrays directamente debido a que compara el codigo de la variable y no su contenido.
		assertEquals(recuerdosTest.get(1).obtenerDescripcion() , riley.obtenerPensamientosCentrales().get(0).obtenerDescripcion());
		assertEquals(recuerdosTest.get(2).obtenerDescripcion() , riley.obtenerPensamientosCentrales().get(1).obtenerDescripcion());
		assertEquals(recuerdosTest.get(3).obtenerDescripcion() , riley.obtenerPensamientosCentrales().get(2).obtenerDescripcion());
		assertEquals(recuerdosTest.get(4).obtenerDescripcion() , riley.obtenerPensamientosCentrales().get(3).obtenerDescripcion());
		assertEquals(recuerdosTest.get(5).obtenerDescripcion() , riley.obtenerPensamientosCentrales().get(4).obtenerDescripcion());
	}
	
	@Before
	// 5. Conocer los pensamientos centrales que sean dificiles de explicar.
	public void antesQue6(){
		riley4 = new Niña(11);
		riley4.establecerNivelDeFelicidad(1000);
		riley4.establecerEmocionDominante(alegria);
		riley4.recuerdos.add(recuerdo1);
		riley4.recuerdos.add(recuerdo2);
		riley4.recuerdos.add(recuerdo3);
		riley4.recuerdos.add(recuerdo4);
		riley4.recuerdos.add(recuerdo5);
	}
	
	@Test
	public void conocerPensamientosCentralesDificiles(){
		assertEquals(recuerdosTest.get(1).obtenerDescripcion() , riley4.obtenerPensamientosCentralesDificiles().get(0).obtenerDescripcion());
		assertEquals(recuerdosTest.get(2).obtenerDescripcion() , riley4.obtenerPensamientosCentralesDificiles().get(1).obtenerDescripcion());
		assertEquals(recuerdosTest.get(4).obtenerDescripcion() , riley4.obtenerPensamientosCentralesDificiles().get(2).obtenerDescripcion());
		assertEquals(recuerdosTest.get(5).obtenerDescripcion() , riley4.obtenerPensamientosCentralesDificiles().get(3).obtenerDescripcion());
	}
	
	@Before
	// 6. Saber si Riley niega un recuerdo
	public void antesQue7(){
		riley5 = new Niña(11);
		riley5.establecerNivelDeFelicidad(1000);
		riley5.establecerEmocionDominante(alegria);
		recuerdo1.establecerDescripcion("cursar");
		recuerdo1.establecerFecha(añoTest , mesTest , diaTest);
		recuerdo1.establecerEmocionDominante(alegria);
		recuerdosTest.add(recuerdo1);
	}
	//No entiendo como funciona (Bien por hacerlo sin funcionar , fenomeno total lo mio)
	@Test
	public void conocerSiRecuerdoEstadoNegado(){
		assert(riley.niega(recuerdo1));
	}
}

