package exercicioProdutos.model.entities;

public class OrderItem {
	
	private int quantity;
	private double price;
	private double valorTotal;
	private Product product;

	public OrderItem(int quantity, double price, Product product) {
		this.quantity = quantity;
		this.price = price;
		this.valorTotal = calcValortotal();
		this.product = product;
	}
	
	public double calcValortotal() {
		
		return quantity * price;
	}
	public double getValorTotal() {	
		return valorTotal;
	}
	
	public Product getProduct() {
		return product;
	}
	
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
		this.valorTotal = calcValortotal();
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
		this.valorTotal = calcValortotal();
	}
	
	@Override
	public String toString() {
		return product.getName() 
				+ ", $" 
				+ String.format("%.2f", price) 
				+ ", Quantity: " 
				+ quantity + 
				", Subtotal: $" 
				+ String.format("%.2f", getValorTotal());
	}
}
