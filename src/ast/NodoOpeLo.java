package ast;

public class NodoOpeLo extends NodoBase {

	private NodoBase nodoizq;
	private NodoBase nododer;

	
	public NodoOpeLo(NodoBase izq, NodoBase der) {
		super();
		this.nodoizq = izq;
		this.nododer = der;
	
	}
	
	public NodoOpeLo() {
		super();
		this.nodoizq = null;
		this.nododer = null;
				
	}

	public NodoBase getNodoIzq() {
		return nodoizq;
	}

	public void setNodoIzq(NodoBase izq) {
		this.nodoizq = izq;
	}

	public NodoBase getNodoDer() {
		return nododer;
	}

	public void setNodoDer(NodoBase der) {
		this.nododer = der;
	}

	
}
