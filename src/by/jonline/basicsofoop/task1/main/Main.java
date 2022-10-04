/* Создать объект класса Текстовый файл, используя классы Файл, Директория.
 * Методы: создать, переименовать, вывести на консоль содержимое, дополнить, удалить.*/

package by.jonline.basicsofoop.task1.main;

import by.jonline.basicsofoop.task1.entity.Directory;
import by.jonline.basicsofoop.task1.entity.TextFile;
import by.jonline.basicsofoop.task1.service.TextFileLogic;

public class Main {
	public static void main(String[] args) {
		Directory directory = new Directory("D:\\newDir");// создаём директорию
		TextFileLogic logic = new TextFileLogic();
		TextFile file = logic.create("Shopping list", "1.Milk\n2.Bread\n3.Chips", directory);
		// создаём текстовый файл
		logic.rename(file, "My shopping list");// переименуем файл
		logic.print(file);
		logic.addContect(file, "\n4.Apple");// дополним файл
		logic.print(file);
		System.out.println(directory);// покажем, что файл есть в директории
		logic.delete(file);
		System.out.println(directory);// файл удалён
		// logic.print(file);--NullPointerException
	}

}
