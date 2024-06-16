package telran.storehouse.exceptions;

@SuppressWarnings("serial")
public class IllegalProductStateException extends RuntimeException {
	public IllegalProductStateException() {
		super("Product not found");
	}
}
