
public class ControlHormonal implements ProcesoMental {
	
	//Punto 7
	
	public void afectarA(Niña unaNiña, String palabraClave) {
		for(int i = 0; i < unaNiña.pensamientosCentrales.size(); i++) {
			if(unaNiña.memoriaALargoPlazo.contains(unaNiña.pensamientosCentrales.get(i)) || this.todosLosRecuerdosDelDiaMismaEmocionDominante(unaNiña)) {
				this.desequilibrioHormonal();				
			}
		}
	}
	
	public boolean todosLosRecuerdosDelDiaMismaEmocionDominante(Niña unaNiña) {
		boolean mismaEmocionEnTodosLosRecuerdos = true;
		int i= 0;
		int j= 0;
		while(mismaEmocionEnTodosLosRecuerdos && j <= unaNiña.recuerdos.size()) {
		
				if (unaNiña.recuerdos.get(j).obtenerEmocionDominante() != unaNiña.recuerdos.get(i).obtenerEmocionDominante()) {
					mismaEmocionEnTodosLosRecuerdos = false;
			}
				j++;
		}
		return mismaEmocionEnTodosLosRecuerdos;
	}
	
	public void desequilibrioHormonal() {
		
	}

}
