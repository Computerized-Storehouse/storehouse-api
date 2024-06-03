package telran.storehouse.exceptions;

@SuppressWarnings("serial")
public class IllegalOrderStateException extends IllegalStateException {
	public IllegalOrderStateException() {
		super("Order already exist");
	}
}