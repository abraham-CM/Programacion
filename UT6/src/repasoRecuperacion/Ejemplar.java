package repasoRecuperacion;

public class Ejemplar extends libro {

	private int codigoEjemplar;

	
	public Ejemplar(String titulo, String autor, int añoPublicacion, int codigoEjemplar) {
		super(titulo, autor, añoPublicacion);
		this.codigoEjemplar = codigoEjemplar;
	}

	@Override
	public String toString() {
		return super.toString() + " codigo " + codigoEjemplar ;
	}

	public int getCodigoEjemplar() {
		return codigoEjemplar;
	}

	public void setCodigoEjemplar(int codigoEjemplar) {
		this.codigoEjemplar = codigoEjemplar;
	}

	 
}
