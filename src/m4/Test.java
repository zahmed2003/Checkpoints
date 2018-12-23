package m4;

import java.util.Random;

public class Test {

	public static void main(String[] args) {
		Cake[] cakes = new Cake[20];
		int totalPrice = 0;
		int readyPrice = 0;
		int readyQuant = 0;
		
		for(int i = 0; i < cakes.length; i++)
		{
			int r = new Random().nextInt(2);
			
			switch(r) {
			case 0:
				cakes[i] = new orderCake("order" + i, new Random().nextInt(100) + 1, new Random().nextInt(100) + 1);
				break;
			case 1:
				cakes[i] = new readymadeCake("order" + i, new Random().nextInt(100) + 1, new Random().nextInt(100) + 1);
				break;
			}
		}
		
		for(Cake c: cakes)
		{
			System.out.println(c.calcPrice());
			totalPrice += c.calcPrice();
		}
		
		System.out.println(totalPrice);
	}			
}
