package telran.storehouse.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import telran.storehouse.dto.ContainerDataDto;
import telran.storehouse.dto.ProductDto;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "container_data")
public class ContainerData {
	@Id
	@Column(name = "container_id")
	Long containerId;

	@Column(name = "sensor_id", unique = true, nullable = false)
	Long sensorUsedId;

	@Column(nullable = false)
	String coordinates;

	@Column(name = "container_max_value", nullable = false)
	Double containerMaxValue;

	@Column(name = "container_current_value", nullable = false)
	@Setter
	double containerCurrentValue;

	@Column(nullable = false)
	@Setter
	String status;

	@Column(name = "threshold_value", nullable = false)
	double thresholdValue;

	@ManyToOne
	@EmbeddedId
	@JoinColumns({@JoinColumn(name="product_name", nullable = false), @JoinColumn(name="product_unit", nullable = false)})
	@Setter
	Product product;

	private ContainerData(Long containerId, Long sensorUsedId, String coordinates, Double containerMaxValue,
			double containerCurrentValue, String status, double thresholdValue) {
		this.containerId = containerId;
		this.sensorUsedId = sensorUsedId;
		this.coordinates = coordinates;
		this.containerMaxValue = containerMaxValue;
		this.containerCurrentValue = containerCurrentValue;
		this.status = status;
		this.thresholdValue = thresholdValue;
	}

	public static ContainerData of(ContainerDataDto dto) {
		return new ContainerData(dto.containerId(), dto.sensorUsedId(), dto.coordinates(), dto.containerMaxValue(),
				dto.containerCurrentValue(), dto.status(), dto.thresholdValue());
	}

	public ContainerDataDto build() {
		return new ContainerDataDto(containerId, sensorUsedId, coordinates, containerMaxValue, containerCurrentValue,
				status, thresholdValue, new ProductDto(product.productName, product.productUnit));
	}
}
