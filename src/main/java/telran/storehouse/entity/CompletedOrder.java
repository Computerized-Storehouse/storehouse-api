package telran.storehouse.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "completed_order")
public class CompletedOrder {
	@Id
	@Column(name = "oreder_id")
	Long orderId;

	@Column(unique = true, name = "container_id", nullable = false)
	Long containerId;

	@Column(nullable = false)
	String coordinates;

	@ManyToOne
	@JoinColumn
	Product product;

	@Column(name = "required_quantity", nullable = false)
	Long requiredQuantity;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "opening_time", nullable = false)
	Long openingTime;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "closing_time", nullable = false)
	Long closingTime;

	String creator;

	@Column(nullable = false)
	String status;

	public static CompletedOrder of(Order order) {
		return new CompletedOrder(order.orderId, order.containerId, order.coordinates, order.product,
				order.requiredQuantity, order.openingTime, order.closingTime, order.creator, order.status);
	}
}
