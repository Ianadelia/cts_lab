package ro.ase.cts.seminar6.Main;

import java.util.Scanner;

import ro.ase.cts.seminar6.Singleton.Cart;
import ro.ase.cts.seminar6.builder.AbstractProductFactory;
import ro.ase.cts.seminar6.builder.OfficeProduct;
import ro.ase.cts.seminar6.builder.Product;
import ro.ase.cts.seminar6.builder.ProductFactory;
import ro.ase.cts.seminar6.builder.TechProdictFactory;
import ro.ase.cts.seminar6.builder.TechProduct;
import ro.ase.cts.seminar6.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Cart myShoppingCart = Cart.getInstance("shopping");
				
				Scanner scan = new Scanner(System.in);
				System.out.println("Selectati categoria de  produse:\n tech-Produse tech \n office - Produse office");
				String userPreference = scan.nextLine();
				Product myProduct = null;
				AbstractProductFactory productFactory=null;
				if(userPreference!=null) {
					if(userPreference.equalsIgnoreCase("tech")) {
						productFactory= new TechProdictFactory();
					}
				}
				System.out.println(productFactory.getCatalog());
				userPreference=scan.nextLine();
				try {
					int selectedId= Integer.valueOf(userPreference);
					myProduct = productFactory.makeProduct(selectedId);
				} catch(NumberFormatException e) {
					System.err.println("Selectie invalida");
				}
				
				if(myProduct != null) {
					myShoppingCart.products.add(myProduct);
				}
				
				for(Product p:myShoppingCart.products)
				{
					System.out.println(p.getDescription());
				}
				
				
			}
		
	}


