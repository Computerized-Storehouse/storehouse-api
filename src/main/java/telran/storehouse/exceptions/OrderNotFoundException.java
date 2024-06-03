package telran.storehouse.exceptions;

@SuppressWarnings("serial")
public class OrderNotFoundException extends RuntimeException {
	public  OrderNotFoundException() {
		super("Order not found");
	}

}
