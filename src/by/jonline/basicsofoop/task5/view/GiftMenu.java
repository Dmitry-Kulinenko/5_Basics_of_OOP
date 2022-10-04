package by.jonline.basicsofoop.task5.view;

import java.util.Scanner;

import by.jonline.basicsofoop.task5.controller.impl.GiftController;

public class GiftMenu {

	public void runMenu() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		GiftController controller = new GiftController();
		String programTerminationCommand = "stop";
		String request = null;
		String response = null;

		do {
			System.out.println(
					"Введите команду и параметр, или " + programTerminationCommand + " для завершения программы.");

			request = scanner.nextLine();
			if (request.equals(programTerminationCommand)) {
				return;
			}
			response = controller.doAction(request);
			System.out.println(response);
		} while (true);

	}

}
