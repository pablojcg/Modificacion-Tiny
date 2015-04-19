package ast;

public class NodoFor extends NodoBase {

	private NodoBase asig1;
	private NodoBase condicion;
	private NodoBase asig2;
        private NodoBase parteThen;

	public NodoFor(NodoBase asig1, NodoBase condicion,NodoBase asig2, NodoBase parteThen) {
		super();
		this.asig1 = asig1;
		this.condicion = condicion;
		this.asig2 = asig2;
                this.parteThen = parteThen;
	}

	public NodoFor() {
		super();
		this.asig1 = null;
		this.condicion = null;
		this.asig2 = null;
                this.parteThen = null;
	}

	public NodoBase getAsig1() {
		return asig1;
	}

	public void setAsig1(NodoBase asig1) {
		this.asig1 = asig1;
	}

	public NodoBase getCondicion() {
		return condicion;
	}

	public void setCondidion(NodoBase condicion) {
		this.condicion = condicion;
	}

	public NodoBase getAsig2() {
		return asig2;
	}

	public void setAsig2(NodoBase asig2) {
		this.asig2 = asig2;
	}

        public NodoBase getParteThen() {
		return parteThen;
	}

	public void setParteThen(NodoBase parteThen) {
		this.parteThen = parteThen;
	}



}

   