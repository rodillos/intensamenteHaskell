
public class SinAsentar implements Estado {
	public void asentarRecuerdo(Recuerdo recuerdo, Niña unaNiña){
		recuerdo.obtenerEmocionDominante().afectarA(recuerdo, unaNiña);
	}
}
