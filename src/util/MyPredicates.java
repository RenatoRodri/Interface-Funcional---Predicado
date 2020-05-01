package util;

import java.util.function.Predicate;

import inteteis.Product;

public class MyPredicates implements Predicate<Product> {

	@Override
	public boolean test(Product p) {
		
		return p.getValue() >= 100.0;
	}

}
