package exercicioProdutos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import exercicioProdutos.model.enums.OrderStatus;
import exercicioProdutos.model.entities.Client;
import exercicioProdutos.model.entities.Order;
import exercicioProdutos.model.entities.OrderItem;
import exercicioProdutos.model.entities.Product;

public class Program {

	
	public static void main(String[] args) throws ParseException {
		
		//Inicio
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter client data");
		System.out.println("Name");
		String name = sc.nextLine();
		System.out.println("Email");
		String email = sc.nextLine();
		System.out.println("Birth date formated like yyyy-mm-year");
		String birthDate = sc.nextLine();
		// ajusta o valor recebido
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = sdf.parse(birthDate); // Converte a string para Date
		
		Client client = new Client(name, email, date);
		// Escolhendo o primeiro valor de enum na forma de array.
		Order order = new Order(OrderStatus.values()[0], client);
	
		System.out.println("How many itens to this order ? please put only number in the field");
		int countItens = sc.nextInt();
		
		
		// Aqui o programa cria a quantidade desejada de itens
		for(int i = 0; i < countItens; i++) {
			
			System.out.println("Enter product name");
			
			System.out.println("Enter #" + i + " item data:");
			System.out.print("Product name: ");
			sc.nextLine();
			String productName = sc.nextLine();
			System.out.print("Product price: ");
			double productPrice = sc.nextDouble();

			Product product = new Product(productName, productPrice);

			System.out.print("Quantity: ");
			int quantity = sc.nextInt();

			OrderItem orderItem = new OrderItem(quantity, productPrice, product); 
			
			order.addItem(orderItem);
			
		}
		//imprime no terminal o valor final com os itens e o nome do comprador
		System.out.println();
		System.out.println("ORDER SUMMARY:");
		System.out.println(order);
		sc.close();

	}

}
