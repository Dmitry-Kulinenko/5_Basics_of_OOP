/* Дракон и его сокровища. Создать программу, позволяющую обрабатывать сведения о 100 сокровищах в пещере
 * дракона. Реализовать возможность просмотра сокровищ, выбора самого дорогого по стоимости сокровища и
 * выбора сокровищ на заданную сумму.
 * Request format:
 * Command name:parameter
 * or
 * Command name
 * */

package by.jonline.basicsofoop.task4.main;

import by.jonline.basicsofoop.task4.view.DragonCaveMenu;

public class Main {
	public static void main(String[] args) {
		DragonCaveMenu menu = new DragonCaveMenu();
		menu.runMenu();
	}
}
