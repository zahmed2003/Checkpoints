package m4;

public class orderCake extends Cake{
	
	double weight;

	public orderCake(String n, double r, double w) {
		super(n, r);
		w = weight;
	}

	@Override
	public double calcPrice() {
		return weight*rate;
	}

}
