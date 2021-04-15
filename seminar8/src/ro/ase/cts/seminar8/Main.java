package ro.ase.cts.seminar8;

import ro.ase.cts.seminar8.composite.CatalogComponent;
import ro.ase.cts.seminar8.composite.Product;
import ro.ase.cts.seminar8.composite.ProductCatalog;
import ro.ase.cts.seminar8.decorator.AbstractBackpack;
import ro.ase.cts.seminar8.decorator.BackPack;
import ro.ase.cts.seminar8.decorator.WithFood;
import ro.ase.cts.seminar8.decorator.WithLaptopDecorator;
import ro.ase.cts.seminar8.facade.OrderFacade;

public class Main {

	public static void main(String[] args) {

		OrderFacade facade = new OrderFacade();
		facade.order();
		System.out.println("-----------------------------------------------");
		CatalogComponent laptop = new Product("Asus", 2000);
		CatalogComponent smartPhone = new Product("Samsung s20", 3500);

		CatalogComponent techProductsCatalog = new ProductCatalog("Tech Product");
		techProductsCatalog.add(laptop);
		techProductsCatalog.add(smartPhone);

		CatalogComponent officeProductCatalog = new ProductCatalog("Office");
		CatalogComponent paperclip = new Product("Paperclip", 5);
		CatalogComponent pen = new Product("Blue pen", 2);
		officeProductCatalog.add(paperclip);
		officeProductCatalog.add(pen);

		CatalogComponent genericProducts = new ProductCatalog("Generic products");
		genericProducts.add(new Product("Generic Product", 0));
		genericProducts.add(techProductsCatalog);
		genericProducts.add(officeProductCatalog);

		System.out.println(genericProducts);

		System.out.println("-----------------------------------------------");

		AbstractBackpack myBackpack = new BackPack();
		myBackpack.pack();
		System.out.println("\n");
		AbstractBackpack decoratedBackPack = new WithLaptopDecorator(new WithFood(myBackpack, "banana"));
		decoratedBackPack.pack();
	}

}
