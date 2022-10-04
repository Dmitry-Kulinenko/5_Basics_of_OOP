package by.jonline.basicsofoop.task2;

import java.util.LinkedList;
import java.util.List;

public class Payment {
	private List<Product> productList;

	public Payment() {
		productList = new LinkedList<>();
	}

	public class PaymentLogic {
		public void addProduct(String name, int cost, int quantity) {
			productList.add(new Product(name, cost, quantity));
		}

		public int getTotalCost() {
			int total = 0;
			for (Product product : productList) {
				total += (product.getCost() * product.getQuantity());
			}
			return total;
		}
	}

	public class Product {
		private String name;
		private int cost;
		private int quantity;

		public Product() {
		}

		public Product(String name, int cost, int quantity) {
			this.name = name;
			this.cost = cost;
			this.quantity = quantity;
		}

		public String getName() {
			return name;
		}

		public int getCost() {
			return cost;
		}

		public int getQuantity() {
			return quantity;
		}

		@Override
		public String toString() {
			return "Product [name = " + name + ", cost = " + cost + ", quantity = " + quantity + "]";
		}

	}

	@Override
	public String toString() {
		return "Payment [productList = " + productList + "]";
	}
}
