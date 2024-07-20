package poly.edu.shop.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "orders")
public class Order implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int orderId;
	@Temporal(TemporalType.DATE)
	private Date orderDate;
//	@Column(nullable = false)
//	private int customerId;
	@Column(nullable = false)
	private double amount;
	@Column(nullable = false)
	private short status;
	
	@ManyToOne
	@JoinColumn(name = "customerId")
	private Customer customer;
	
	@OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
	private Set<OrderDetail> orderDetails;
}















