/* Реализовать приложение, позволяющее создавать подарки (объект, представляющий собой
 * подарок). Составляющими целого подарка являются сладости и упаковка.
 * Request format:
 * Command name:parameter
 * or
 * Command name
 * */
package by.jonline.basicsofoop.task5.main;

import by.jonline.basicsofoop.task5.view.GiftMenu;

public class Main {
	public static void main(String[] args) {
		GiftMenu menu = new GiftMenu();
		menu.runMenu();
	}
}
