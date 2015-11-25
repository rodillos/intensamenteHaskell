
public class Profundizacion implements ProcesoMental {

	public void afectarA(Niña unaNiña, String palabraClave) {
		for(int i = 0; i < unaNiña.recuerdos.size(); i++) {
			if(unaNiña.pensamientosCentrales.contains(unaNiña.recuerdos.get(i)) && !unaNiña.obtenerEmocionDominante().niega(unaNiña.recuerdos.get(i))) {
				unaNiña.memoriaALargoPlazo.add(unaNiña.recuerdos.get(i));
			}
		}
	}
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

	}

	
}
