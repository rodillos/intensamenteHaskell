import java.util.ArrayList;
import java.util.Date;

public class Niña {
	
	private double nivelDeFelicidad;
	private Emocion emocionDominante;
	ArrayList<Recuerdo> recuerdos = new ArrayList<Recuerdo>();                                 
	ArrayList<Recuerdo> pensamientosCentrales = new ArrayList<Recuerdo>();
	ArrayList<ProcesoMental> procesosMentales = new ArrayList<ProcesoMental>();
	ArrayList<Recuerdo> memoriaALargoPlazo = new ArrayList<Recuerdo>();
	
	//Punto 1 - Terminado
	
	//Setter y getter de nivelDeFelicidad
	
	public double obtenerNivelDeFelicidad() {
		return nivelDeFelicidad;
	}
	
	public void establecerNivelDeFelicidad(double unNivelDeFelicidad) {
		nivelDeFelicidad = unNivelDeFelicidad;
	}
	
	//Setter y getter de emocionDominante
	
	public void establecerEmocionDominante(Emocion unaEmocion){
		emocionDominante = unaEmocion;
	}
	
	public Emocion obtenerEmocionDominante() {
		return emocionDominante;
	}
	
	//Resolución de la consigna
	
	public void vivir(String unEvento) {
	
		registrarRecuerdo(unEvento);
		
	}
	
	public void registrarRecuerdo(String unEvento) {
		
		Recuerdo recuerdo = new Recuerdo();
		Date fecha = new Date ();
		
		recuerdo.establecerDescripcion(unEvento);
		recuerdo.establecerEmocionDominante(emocionDominante);
		recuerdo.establecerFecha(fecha);
		
		recuerdos.add(recuerdo);
		
	}
	

	
	//Punto 2 - Terminado
	
    public void disminuirFelicidad() {
    	nivelDeFelicidad = (nivelDeFelicidad * 0.9);
    }
    
    public void puedeDisminuirFelicidad() throws Exception {
		if((nivelDeFelicidad*0.9) < 1) {
			throw new Exception();
		}
	}
    	
    //Punto 3 - Terminado
    
    //Se usa para el test
    
    public ArrayList<Recuerdo> obtenerRecuerdosRecientes(){
    	ArrayList<Recuerdo> recuerdosRecientes = new ArrayList<Recuerdo>();    
    	int contador;
		for ( contador= 0; contador<=5; contador++){
			
			if(contador <= recuerdos.size()) {
			recuerdosRecientes.add(recuerdos.get(contador));
			}
		}
		return recuerdosRecientes;
	}
    
    //Resuelve la consigna
    
    public void mostrarRecuerdosRecientes(){
		int contador;
		for ( contador= 0; contador<=5; contador++){
			
			if(contador <= recuerdos.size()) {
			System.out.println(recuerdos.get(contador));
			}
		}
	}
    
    //Punto 4 - Terminado
    
    public void mostrarPensamientoscentrales (){
    	int contador;
        for(contador = 0; contador < pensamientosCentrales.size(); contador++) {
    			System.out.println(pensamientosCentrales.get(contador));
        }
    }
        
     //Punto 5 - Terminado
    
    public void mostrarPensamientosCentralesDificiles() {
    	
    	ArrayList<Recuerdo> pensamientosCentralesDificiles = new ArrayList<Recuerdo>();
    	
    	for(int contador1 = 0; contador1 < pensamientosCentrales.size(); contador1++ ) {
    		
    		if (pensamientosCentrales.get(contador1).obtenerDescripcion().length() > 10) {
    			pensamientosCentralesDificiles.add(pensamientosCentrales.get(contador1));
    		}
    	}
    	
    	for(int contador2 = 0; contador2 < pensamientosCentralesDificiles.size(); contador2++) {
            System.out.println(pensamientosCentralesDificiles.get(contador2));
    	}

    }
    
    //Punto 6 - Terminado
    
    public boolean niega (Recuerdo recuerdo) {
    	return emocionDominante.niega(recuerdo);
    }
    
    
    //Punto 7
    
    public void puedeAumentarFelicidad() throws Exception {
		if(nivelDeFelicidad + 100 > 1000) {
			throw new Exception();
		}
	}
    
    //Falta la resolucion del punto 7 y verificar si cada proceso mental estaria cumpliendo su funcion correspondiente
    
    public void dormir(String palabraclave) {
    	
    	
    	
    }
    
    
    //Punto 8
    
    //Punto 9
    
    //Punto 10
    
    //Punto 11
    
    public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
