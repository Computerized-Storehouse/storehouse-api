package telran.storehouse.dto;

import jakarta.validation.constraints.NotNull;
import static telran.storehouse.messages.ValidationErrorMessages.*;
/**
 * @id sensor unique ID
 * @fullness container filling percentage
 * @timestamp time mark
 */
public record SensorDataDto(@NotNull(message = MISSING_SENSOR_ID) long id,
		@NotNull(message = MISSING_SENSOR_FULLNESS) double fullness,
		@NotNull(message = MISSING_TIMESTAMP_VALUE) long timestamp) {

}