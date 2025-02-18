package payroll;

public class CartorioNotFoundException extends RuntimeException {
	public CartorioNotFoundException(int id) {
		super("Não foi possivel encontroado o cartorio de id" + id);
	}

}
