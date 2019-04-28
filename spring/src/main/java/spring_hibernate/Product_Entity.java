package spring_hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="annt_product_info")
@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product_Entity {

	@Id
	private int productId;
	private String productName;
	private double productPrice;
	private boolean isActive;
}
