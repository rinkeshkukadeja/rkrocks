package autowiring;

import com.scp.pratice.hibernate.spring.Address;

public class Employee1 {

	private Address addr1;	

	public Address getAddr1() {
		return addr1;
	}
	
	public void setAddr1(Address addr1) {
		this.addr1 = addr1;
	}
	
	public Employee1(Address addr1) {
		super();
		this.addr1 = addr1;
	}

	
	
}
