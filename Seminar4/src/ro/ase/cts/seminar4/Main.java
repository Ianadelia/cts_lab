package ro.ase.cts.seminar4;
import ro.ase.cts.seminar4.EagerShoppingCartExample;
public class Main {

	public static void main(String[] args) {
		Cart shoppingCart = Cart.getInstance("ShoppingCart");
       Cart wishList=Cart.getInstance("wishList");
       
       shoppingCart.getProducts();
       wishList.getProducts();
		
        
        EagerShoppingCartExample example= EagerShoppingCartExample.INSTANCE;
        EagerShoppingCartExample example2= EagerShoppingCartExample.INSTANCE;
        
        if(example == example2) {
        	System.out.println("Obiectele sunt identice");
        }
        SingletonEnum mySingleton=SingletonEnum.INSTANCE;
        mySingleton.getProducts();
	}

}
