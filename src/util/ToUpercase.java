package util;

import java.util.function.Function;

import inteteis.Product;

public class ToUpercase implements Function<Product, String> {

	@Override
	public String apply(Product p) {
		
		return p.getName().toUpperCase();
	}

}
