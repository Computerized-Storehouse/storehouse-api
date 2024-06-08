package telran.storehouse.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import telran.storehouse.dto.ProductDto;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "product")
public class Product {
	@Id
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
