import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestsIntensamente {
	private Niña riley;
	private Niña riley2;
	private Niña riley3;
	private Alegria alegria = new Alegria();
	private Tristeza tristeza = new Tristeza();
	private Furia furia = new Furia();
	
	@Before
	public void antesQue1(){
		riley = new Niña();
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
		riley2 = new Niña();
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
		riley3 = new Niña();
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
	
	@Before 
	public void antesQue4(){
		riley = new Niña();
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
	public void conocerPensamientosCentrales(){
		pensamientosEsperados = {"ir a cursar paradigmas", "Cursar un martes" , "Votar" , "Tomar un helado de chocolate" , "Pasear al perro"};
		//instanciar una nueva riley rileyB o como quieras , y comparas los dos array de pensamientos centrales.
		assertEquals(pensamientosEsperados , riley.pensamientosCentrales);
	}


}
