package Pratice;

public class Vendor {

	private int v_id;
	private String v_name;
	private Vend_supp vend_id;
	

	public Vend_supp getVend_id() {
		return vend_id;
	}
	public void setVend_id(Vend_supp vend_id) {
		this.vend_id = vend_id;
	}
	public Vendor(int v_id, String v_name, Vend_supp vend_id) {
		super();
		this.v_id = v_id;
		this.v_name = v_name;
		this.vend_id = vend_id;
	}
	public int getV_id() {
		return v_id;
	}
	public void setV_id(int v_id) {
		this.v_id = v_id;
	}
	public String getV_name() {
		return v_name;
	}
	public void setV_name(String v_name) {
		this.v_name = v_name;
	}
	
		
	public Vendor() {
		super();
	}
	@Override
	public String toString() {
		return "Vendor [v_id=" + v_id + ", v_name=" + v_name + ", vend_id=" + vend_id + "]";
	}
	
	
	
}
