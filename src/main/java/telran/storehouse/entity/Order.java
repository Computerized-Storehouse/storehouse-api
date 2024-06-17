package telran.storehouse.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import telran.storehouse.dto.OrderDataDto;
import telran.storehouse.dto.OrderStatus;
import telran.storehouse.dto.ProductDto;

@Entity
@Getter
@NoArgsConstructor
@ToString
@Table(name = "order_table")
public class Order {
	@Id
	@Column(name = "order_id")
	Long orderId;

	@Column(unique = true, name = "container_id", nullable = false)
	Long containerId;

	@Column(nullable = false)
	String coordinates;

	@ManyToOne
	@JoinColumn(name = "product", nullable = false)
	@Setter
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

	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	@Setter
	OrderStatus status;

	public Order(Long orderId, Long containerId, String coordinates, Long requiredQuantity, Long openingTime,
			Long closingTime, String creator, OrderStatus status) {		
		this.orderId = orderId;
		this.containerId = containerId;
		this.coordinates = coordinates;
		this.requiredQuantity = requiredQuantity;
		this.openingTime = openingTime;
		this.closingTime = closingTime;
		this.creator = creator;
		this.status = status;
	}

	public static Order of(OrderDataDto orderDataDto) {
		return new Order(orderDataDto.orderId(), orderDataDto.containerId(), orderDataDto.coordinates(),
				orderDataDto.requiredQuantity(), orderDataDto.openingTime(), orderDataDto.closingTime(),
				orderDataDto.creator(), orderDataDto.status());
	}

	public OrderDataDto build() {
		return new OrderDataDto(orderId, containerId, coordinates,
				new ProductDto(product.getProductName(), product.getProductUnit()), requiredQuantity, openingTime, closingTime,
				creator, status);
	}

}
