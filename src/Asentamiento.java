
public class Asentamiento implements ProcesoMental {
	public void afectarA(Niña unaNiña, String palabraClave) {
		for(int i = 0; i < unaNiña.recuerdos.size(); i++ ) {
			unaNiña.recuerdos.get(i).obtenerEmocionDominante().afectarA(unaNiña.recuerdos.get(i), unaNiña);
		}
	}
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

	}

}
