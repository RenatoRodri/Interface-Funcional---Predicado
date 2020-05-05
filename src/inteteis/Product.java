package inteteis;

public class Product {


	private String name;
	private Double Value;
	
	public Product(String name, Double value) {
		this.name = name;
		Value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getValue() {
		return Value;
	}

	public void setValue(Double value) {
		Value = value;
	}

	
	public static void UpdadeValueConsumer(Product p) {
		p.setValue(p.getValue() * 1.1);
	}
	
	public void noStaticupadadeValueConsumer() {
		setValue(getValue() * 1.1);
	}
	
	
	@Override
	public String toString() {
		return "name = " + name + ", Value = " + String.format("%.2f", Value);
	}
}
