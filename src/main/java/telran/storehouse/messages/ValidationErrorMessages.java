package telran.storehouse.messages;

public interface ValidationErrorMessages {
	String MISSING_SENSOR_ID = "missing sensor id value";
	String MISSING_SENSOR_FULLNESS = "missing sensor fullness value";
	String MISSING_CONTAINER_ID = "missing container id value";
	String MISSING_CONTAINER_COORDINATES = "missing container coordinates value";
	String MISSING_THRESHOLD_VALUE = "missing container threshold value";
	String MISSING_CONTAINER_CURRENT_VALUE = "missing container current value";
	String WRONG_CONTAINER_PERCENT_MAX_VALUE = "max value must be not greater than 100";
	String WRONG_CONTAINER_PERCENT_MIN_VALUE = "min value must be not less than 0";
	String MISSING_CONTAINER_MAX_VALUE = "missing container max value";
	String MISSING_PRODUCT_DATA = "missing container product value";
	String MISSING_PRODUCT_NAME = "missing product name";
	String MISSING_PRODUCT_UNIT = "missing product unit";
	String CONTAINER_COORDINATES_REGEXP = "(\\[a-zA-Z]{1,3}\\d+)";
	String WRONG_CONTAINER_COORDINATES_MESSAGE = "incorrect container coordinates";
	String MISSING_CONTAINER_STATUS = "missing container status";
	String MISSING_TIMESTAMP_VALUE = "missing timestamp value";
	String MISSING_CONTAINER_DATA = "missing container data";
	String MISSING_REQUIRED_QUANTITY = "missing required quantity value";
	String MISSING_SENSOR_DATA = "missing sensor data";
	String MISSING_DIFFERENCE = "missing sensor data difference";
	String MISSING_ORDER_ID = "missing order id value";
	String MISSING_OPENING_TIME = "missing opening time value";
	String MISSING_CLOSING_TIME = "missing opening time value";
	String MISSING_CREATOR = "missing creator value";
	String MISSING_ORDER_STATUS = "missing order status value";
}