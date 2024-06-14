package telran.storehouse.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import telran.storehouse.dto.ProductDto;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Product implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Column(name = "product_name")
	String productName;

	
	@Column(name = "product_unit", nullable = false)
	String productUnit;

	public static Product of(ProductDto productDto) {
		return new Product(productDto.productName(), productDto.productUnit());
	}

	public ProductDto build() {
		return new ProductDto(productName, productUnit);
	}
}
