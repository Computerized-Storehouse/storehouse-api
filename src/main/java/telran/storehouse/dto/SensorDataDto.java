package telran.storehouse.dto;

import jakarta.validation.constraints.NotNull;
import static telran.storehouse.messages.ValidationErrorMessages.*;


public record SensorDataDto(@NotNull(message = MISSING_SENSOR_ID) long id, 
		@NotNull(message = MISSING_SENSOR_FULLNESS) double fullnes, 
		@NotNull(message = MISSING_TIMESTAMP_VALUE) long timestamp) {

}
