
public class RestauracionCognitiva implements ProcesoMental {
	
	public void afectarA(Niña unaNiña, String palabraClave) {
		try {
			unaNiña.puedeAumentarFelicidad();
		} 
		catch (Exception excepcion) {
			System.err.println("El nivel de felicidad no puede ser mayor a 1000");
		}
		unaNiña.establecerNivelDeFelicidad(unaNiña.obtenerNivelDeFelicidad() + 100);
	}
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

	}
	
}
