package by.jonline.basicsofoop.task4.controller.impl;

import by.jonline.basicsofoop.task4.controller.Command;
import by.jonline.basicsofoop.task4.controller.CommandProvider;
import by.jonline.basicsofoop.task4.controller.Controller;

public class DragonCaveController implements Controller {

	@Override
	public String doAction(String request) {
		// Request format:
		// Command name: parameter
		// or
		// Command name
		CommandProvider commandProvider = CommandProvider.getInstance();
		final String SEPARATOR = ":\s";
		String response = null;
		Command command = null;

		if (request.contains(SEPARATOR)) {
			String[] params = request.split(SEPARATOR);
			command = commandProvider.getCommand(params[0]);
			response = command.execute(params[1]);

		} else {
			command = commandProvider.getCommand(request);
			response = command.execute(null);
		}
		return response;
	}

}
