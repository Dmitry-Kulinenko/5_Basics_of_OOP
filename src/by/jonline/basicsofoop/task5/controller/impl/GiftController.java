package by.jonline.basicsofoop.task5.controller.impl;

import by.jonline.basicsofoop.task5.controller.Command;
import by.jonline.basicsofoop.task5.controller.CommandProvider;
import by.jonline.basicsofoop.task5.controller.Controller;
import by.jonline.basicsofoop.task5.controller.util.RequestValidator;

public class GiftController implements Controller {

	@Override
	public String doAction(String request) {
		// Request format:
		// Command name:parameter
		// or
		// Command name
		CommandProvider commandProvider = CommandProvider.getInstance();
		final String SEPARATOR = ":\s";
		RequestValidator validator = new RequestValidator();
		String response = null;
		Command command = null;

		if (request.contains(SEPARATOR)) {
			String[] params = request.split(SEPARATOR);
			String commandName = params[0];
			if (validator.commandIsValid(commandName)) {
				command = commandProvider.getCommand(commandName);
				response = command.execute(params[1]);
			} else {
				response = "Не верное имя команды";
			}

		} else {
			if (validator.commandIsValid(request)) {
				command = commandProvider.getCommand(request);
				response = command.execute(null);
			} else {
				response = "Не верное имя команды";
			}

		}
		return response;
	}

}
