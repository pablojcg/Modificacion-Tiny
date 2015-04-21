package ast;

public class NodoArg extends NodoBase {

	private NodoBase ex;
	private NodoBase ar;
	
	public NodoArg(NodoBase ex, NodoBase ar) {
		super();
		this.ex = ex;
		this.ar = ar;
	}
	
	public NodoArg() {
		super();
		this.ar = null;
		this.ex = null;		
	}

	public NodoBase getEx() {
		return ex;
	}

	public void setEx(NodoBase ex) {
		this.ex = ex;
	}

	public NodoBase getAr() {
		return ar;
	}

	public void setAr(NodoBase ar) {
		this.ar = ar;
	}
			
}
