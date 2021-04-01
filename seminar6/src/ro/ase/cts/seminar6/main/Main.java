package ro.ase.cts.seminar6.main;

import java.util.Scanner;

import ro.ase.cts.seminar6.builder.AbstractProductFactory;
import ro.ase.cts.seminar6.builder.Product;
import ro.ase.cts.seminar6.singleton.Cart;
import ro.ase.cts.seminar6.builder.TechProductFactory;


public class Main {

	public static void main(String[] args) {
		Cart myShoppingCart = Cart.getInstance("shopping");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Selectati categoria de produse:\n Produse tech \n Produse office");
		String userPreferences = scan.nextLine();
		Product myProduct = null;
		
		AbstractProductFactory productFactory = null;
		if(userPreferences != null) {
			if(userPreferences.equalsIgnoreCase("tech")) {
				productFactory = new TechProductFactory();
			}
		}
		myProduct = productFactory.makeProduct();
		
//		}else {
//			System.out.println("Optiune invalida");
//			System.out.println("Catalog de produse:\n Produse tech \n  Produse office");
//		}
		
		if(myProduct !=null) {
			myShoppingCart.products.add(myProduct);
		}
		
		for (Product p: myShoppingCart.products) {
			System.out.println(p.getDescription());
		}
	}

}
