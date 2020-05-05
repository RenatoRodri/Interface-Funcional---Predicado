package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

import inteteis.Product;
import util.UpadadePrice;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 1500.00));
		list.add(new Product("Grill", 40.00));
		list.add(new Product("Notebook", 4000.00));
		list.add(new Product("Cafeteira", 80.00));
		
		list.forEach(p-> {p.setValue(p.getValue() * 1.1);});
		
		list.forEach(System.out::println);
			
		
		
		
	}

}
