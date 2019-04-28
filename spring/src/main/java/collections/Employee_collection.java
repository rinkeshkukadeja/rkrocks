package collections;

import java.util.ArrayList;
import java.util.List;

import com.scp.pratice.hibernate.spring.Address;

public class Employee_collection {

	List<Address> l1 = new ArrayList<Address>();

	public Employee_collection() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<Address> getL1() {
		return l1;
	}

	public void setL1(List<Address> l1) {
		this.l1 = l1;
	}

	public Employee_collection(List<Address> l1) {
		super();
		this.l1 = l1;
	}

}
