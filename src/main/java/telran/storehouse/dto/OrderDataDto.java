package telran.storehouse.dto;

import static telran.storehouse.messages.ValidationErrorMessages.*;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;

public record OrderDataDto(@NotNull(message = MISSING_ORDER_ID) long orderId,
		@NotNull(message = MISSING_CONTAINER_ID) long containerId,
		@NotEmpty(message = MISSING_CONTAINER_COORDINATES) @Pattern(regexp = CONTAINER_COORDINATES_REGEXP, message = WRONG_CONTAINER_COORDINATES_MESSAGE) String coordinates,
		@Valid @NotEmpty(message = MISSING_PRODUCT_DATA) Products product,
		@NotNull(message = MISSING_REQUIRED_QUANTITY) long requiredQuantity,
		@NotNull(message = MISSING_OPENING_TIME) long openingTime,
		@NotNull(message = MISSING_CLOSING_TIME) long closingTime, @NotEmpty(message = MISSING_CREATOR) String creator,
		@NotEmpty(message = MISSING_ORDER_STATUS) String status) {

}