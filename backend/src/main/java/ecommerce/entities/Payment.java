package ecommerce.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="payments")
public class Payment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String cardno;
	
	private String nameoncard;
	
	private int amount;
	
	private Date paymentdate;
	
}
