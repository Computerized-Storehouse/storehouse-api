package telran.storehouse.dto;

import static telran.storehouse.messages.ValidationErrorMessages.*;

import jakarta.validation.constraints.NotNull;

public record NewStateDto(@NotNull(message = MISSING_SENSOR_DATA) SensorDataDto sensorData,
		@NotNull(message = MISSING_DIFFERENCE) double difference) {

}