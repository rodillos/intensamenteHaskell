import java.util.ArrayList;
import java.util.Date;

public class Ni�a {
	
	private double nivelDeFelicidad;
	private Emocion emocionDominante;
	private int edad;
	private Recuerdo pensamientoActual;
	ArrayList<Recuerdo> recuerdos = new ArrayList<Recuerdo>();                                 
	ArrayList<Recuerdo> pensamientosCentrales = new ArrayList<Recuerdo>();
	ArrayList<ProcesoMental> procesosMentales = new ArrayList<ProcesoMental>();
	ArrayList<Recuerdo> memoriaALargoPlazo = new ArrayList<Recuerdo>();
	
	public Ni�a(int edadNi�a) {
		edad = edadNi�a;
		nivelDeFelicidad = 1000;
	}
	
	public int getEdad() {
		return edad;
	}
	
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
	
	//Resoluci�n de la consigna
	
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
    	Recuerdo recuerdo;
    	for (int i = (recuerdos.size() - 5); i < recuerdos.size(); i++){
    		recuerdo = recuerdos.get(i);
    		recuerdosRecientes.add(recuerdo);
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
    
    public ArrayList<Recuerdo> obtenerPensamientosCentrales (){
    	return pensamientosCentrales;
    	}
        
     //Punto 5 - Terminado
    
    public ArrayList<Recuerdo> obtenerPensamientosCentralesDificiles() {
    	ArrayList<Recuerdo> pensamientosCentralesDificiles = new ArrayList<Recuerdo>(); 
    	Recuerdo recuerdo;
    	for (int i = 0; i < recuerdos.size(); i++ ){
    		recuerdo = recuerdos.get(i);
    		if(recuerdo.obtenerDescripcion().length() > 10){
    			pensamientosCentralesDificiles.add(recuerdo);
    		}
    	}
    	return pensamientosCentralesDificiles;
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
    
    public int cantidadDeRepeticionesDeUnRecuerdo(Recuerdo unRecuerdo) {
    	int contadorRepeticiones = 0;
    	int iterador = 0;
    	String descripcionRecuerdo = unRecuerdo.obtenerDescripcion();
    	Date fechaRecuerdo = unRecuerdo.obtenerFecha();
    	Emocion emocionRecuerdo =  unRecuerdo.obtenerEmocionDominante();
    	while (iterador < memoriaALargoPlazo.size()) {
    		
    		// No tiene ningun fin productivo, solamnete para que quede mas prolijo el codigo
    		String descripcionComparado = memoriaALargoPlazo.get(iterador).obtenerDescripcion();
    		Date fechaComparado = memoriaALargoPlazo.get(iterador).obtenerFecha();
    		Emocion emocionComparado = memoriaALargoPlazo.get(iterador).obtenerEmocionDominante();
    		
        	if ((descripcionComparado == descripcionRecuerdo) && (fechaComparado == fechaRecuerdo) &&(emocionComparado == emocionRecuerdo) ){
    			contadorRepeticiones++;
        	}
    		iterador++;
    	}
       	return contadorRepeticiones;
    }
    
    //Punto 10
    
    public boolean tieneUnDejaVu() {
    	return this.estaRepetidoEnMemoriaALargoPlazo(pensamientoActual);
    }
    
    public boolean estaRepetidoEnMemoriaALargoPlazo(Recuerdo unRecuerdo) {
    	if (this.cantidadDeRepeticionesDeUnRecuerdo(unRecuerdo) > 1) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    //Punto 11
    
    public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
