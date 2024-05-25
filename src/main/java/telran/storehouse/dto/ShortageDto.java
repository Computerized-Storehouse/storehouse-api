package telran.storehouse.dto;

import static telran.storehouse.messages.ValidationErrorMessages.*;

import jakarta.validation.constraints.NotNull;

public record ShortageDto(@NotNull(message = MISSING_CONTAINER_DATA) ContainerDataDto containerData,
		@NotNull(message = MISSING_REQUIRED_QUANTITY) long requiredQuantity, 
		@NotNull(message = MISSING_TIMESTAMP_VALUE) long timestamp) {

}
