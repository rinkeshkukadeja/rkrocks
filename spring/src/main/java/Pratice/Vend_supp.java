package Pratice;

public class Vend_supp {

	private int vend_supp_id;

	@Override
	public String toString() {
		return "Vend_supp [vend_supp_id=" + vend_supp_id + "]";
	}

	public int getVend_supp_id() {
		return vend_supp_id;
	}

	public void setVend_supp_id(int vend_supp_id) {
		this.vend_supp_id = vend_supp_id;
	}

	public Vend_supp(int vend_supp_id) {
		super();
		this.vend_supp_id = vend_supp_id;
	}

	public Vend_supp() {
		super();
	}
	
	
}
