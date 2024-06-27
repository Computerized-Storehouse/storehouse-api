package telran.storehouse.dto;

import static telran.storehouse.messages.ValidationErrorMessages.*;

import java.util.List;

import jakarta.validation.constraints.NotNull;

public record ErrorDataDto(@NotNull(message = MISSING_SENSOR_ID) long sensorId,@NotNull(message = MISSING_TIMESTAMP_VALUE) long timestamp,
		@NotNull(message = MISSING_ERRORS_COUNTER) List<Double> errorsCounter) {

}
