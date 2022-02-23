import java.util.Scanner;


public class Test {
	public static void main(String[] args) {
		/**
		 * @author M. Firat Sen, 2022
		 */
		double apple, banana, tomato, aubergine, pear, totalPrice,applePrice,bananaPrice,tomatoPrice,auberginePrice,pearPrice;
		apple = 3.67;
		banana = 0.95;
		tomato = 1.11;
		aubergine = 5.0;
		pear = 2.14;
		Scanner input = new Scanner(System.in);
		System.out.println("What is the quantity of  apple?: ");
		double quantityApple = input.nextDouble();
		applePrice = quantityApple*apple;
		System.out.println("What is the quantity of  banana?: ");
		double quantityBanana = input.nextDouble();
		bananaPrice = quantityBanana*banana;
		System.out.println("What is the quantity of  tomato?: ");
		double quantityTomato = input.nextDouble();
		tomatoPrice = quantityTomato*tomato;
		System.out.println("What is the quantity of  aubergine?: ");
		double quantityAubergine = input.nextDouble();
		auberginePrice = quantityAubergine*aubergine;
		System.out.println("What is the quantity of  pear?: ");
		double quantityPear = input.nextDouble();
		pearPrice = quantityPear*pear;
		totalPrice = pearPrice + auberginePrice + tomatoPrice + bananaPrice + applePrice;
		System.out.println("The total price that you must gonna pay: ");
		System.out.println(totalPrice);
	}
}
