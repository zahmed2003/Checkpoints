package m4;

public class readymadeCake extends Cake{

	int quantity;
	
	public readymadeCake(String n, double r, int q) {
		super(n, r);
		q = quantity;
	}

	@Override
	public double calcPrice() {
		return rate*quantity;
	}

}
