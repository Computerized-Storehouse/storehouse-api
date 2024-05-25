package telran.storehouse.dto;

import jakarta.validation.constraints.NotEmpty;
import static telran.storehouse.messages.ValidationErrorMessages.*;

public record Products(@NotEmpty(message = MISSING_PRODUCT_NAME) String productName, 
		@NotEmpty(message = MISSING_PRODUCT_UNIT) String productUnit) {

}
