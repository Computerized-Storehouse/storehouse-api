package telran.storehouse.dto;

import jakarta.validation.constraints.*;
import static telran.storehouse.messages.ValidationErrorMessages.*;

public record ContainerDataDto(@NotNull(message = MISSING_CONTAINER_ID) long containerId, 
		@NotNull(message = MISSING_SENSOR_ID) long sensorUsedId, 
		@NotEmpty(message = MISSING_CONTAINER_COORDINATES) @Pattern(regexp = CONTAINER_COORDINATES_REGEXP, 
		message = WRONG_CONTAINER_COORDINATES_MESSAGE) String coordinates, 
		@NotNull(message = MISSING_CONTAINER_MAX_VALUE) double containerMaxValue,
		@NotNull(message = MISSING_CONTAINER_CURRENT_VALUE) double containerCurrentValue,
		@NotEmpty(message = MISSING_CONTAINER_STATUS) String status,
		@NotNull(message = MISSING_THRESHOLD_VALUE) double thresholdValue, 
		@NotEmpty(message = MISSING_PRODUCT_DATA) Products product) {

}
