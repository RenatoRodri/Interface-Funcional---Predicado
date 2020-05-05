package util;

import java.util.function.Consumer;

import inteteis.Product;

public class UpadadePrice implements Consumer<Product> {

	@Override
	public void accept(Product p) {
     	p.setValue(p.getValue() * 1.1);
	}
	
}
