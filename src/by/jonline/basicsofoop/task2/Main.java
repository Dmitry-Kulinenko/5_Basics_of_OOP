/*2. Создать класс Payment с внутренним классом, с помощью объектов кото-
рого можно сформировать покупку из нескольких товаров.*/

package by.jonline.basicsofoop.task2;

public class Main {
	public static void main(String[] args) {
		Payment payment = new Payment();
		Payment.PaymentLogic logic = payment.new PaymentLogic();
		logic.addProduct("Chips", 1, 2);
		logic.addProduct("Cola", 3, 1);
		logic.addProduct("Bread", 4, 5);
		System.out.println(payment);
	}
}
