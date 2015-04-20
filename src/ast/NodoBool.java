package ast;

public class NodoBool extends NodoBase {
	private Boolean expb;

	public NodoBool(Boolean expb) {
		super();
		this.expb = expb;
	}

	public NodoBool() {
		super();
	}
	
	public Boolean getValor() {
		return expb;
	}

}