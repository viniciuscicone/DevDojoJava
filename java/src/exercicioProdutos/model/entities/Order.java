package exercicioProdutos.model.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import exercicioProdutos.model.enums.OrderStatus;

public class Order {
	
	private LocalDate moment;
	private OrderStatus status;
	private Client client;
	private List<OrderItem> items = new ArrayList<>();
	
	
	public Order( OrderStatus status, Client client) {
		
		this.moment = LocalDate.now();
		this.status = status;
		this.client = client;
		
	}

	public Client getClient() {
		return client;
	}
	
	public LocalDate getMoment() {
		return moment;
	}
	public void setMoment(LocalDate moment) {
		this.moment = moment;
	}
	public OrderStatus getStatus() {
		return status;
	}
	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	
	//metodos para os itens
	
	public List<OrderItem> getItems() {
		return items;
	}
	
	public void addItem(OrderItem item) {
		items.add(item);
	}

	public void removeItem(OrderItem item) {
		items.remove(item);
	}
	
	public double total() {
		double sum = 0.0;
		for (OrderItem item : items) {
			sum += item.calcValortotal();
		}
		return sum;
	}
	
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: ");
		sb.append("Order status: ");
		sb.append(status + "\n");
		sb.append("Client: ");
		sb.append(client + "\n");
		sb.append("Order items:\n");
		for (OrderItem item : items) {
			sb.append(item + "\n");
		}
		sb.append("Total price: $");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
	}
	
}
