package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

import inteteis.Product;
import util.ToUpercase;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 1500.00));
		list.add(new Product("Grill", 40.00));
		list.add(new Product("Notebook", 4000.00));
		list.add(new Product("Cafeteira", 80.00));
		
		List<String> names = list.stream().map(new ToUpercase()).collect(Collectors.toList());
		
		names.forEach(System.out::println);
		
		
		
	}

}
