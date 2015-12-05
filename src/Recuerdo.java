import java.util.Calendar;
import java.util.Date;

public class Recuerdo {

	private String descripcion;
	private Date fecha;
	private Emocion emocionDominante;
	private Estado estado = new SinAsentar();
	private int a�o;
	private int mes;
	private int dia;
	
	//Punto 1
	
	public void establecerDescripcion(String textoDescripcion) {
		descripcion = textoDescripcion;
	}
	
	public String obtenerDescripcion() {
		return descripcion;
	}
	
	public void mosnotrarDescripcion() {
		System.out.println(descripcion);
	}
	
	
	public void establecerFecha(int unA�o , int unMes , int unDia) {
		a�o = unA�o;
		mes = unMes;
		dia = unDia;
	}

	public int obtenerA�o() {	
		return a�o;
		}
	
	public int obtenerMes() {	
		return mes;
		}
	
	public int obtenerDia() {	
		return dia;
		}
	
	public void mostrarFecha() {
		System.out.println(fecha);
	}

	public Emocion obtenerEmocionDominante() {
		return emocionDominante;
	}

	public void establecerEmocionDominante(Emocion unaEmocion) {
		emocionDominante = unaEmocion;
	}
			
	public void mostrarEmocionDominante() {
		System.out.println(emocionDominante);
	}
	
	//Punto 2
	
	public void asentateEn(Ni�a unaNi�a) {
		
		this.obtenerEstado().asentarRecuerdo(this, unaNi�a);
		estado = new Asentado ();
	}

	public Estado obtenerEstado() {
		return estado;
	}

	public void establecerEstado(Estado estado) {
		this.estado = estado;
	}
	
}
