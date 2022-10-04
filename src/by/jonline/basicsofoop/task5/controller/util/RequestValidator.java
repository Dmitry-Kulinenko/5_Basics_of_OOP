package by.jonline.basicsofoop.task5.controller.util;

import by.jonline.basicsofoop.task5.controller.CommandProvider;

public class RequestValidator {

	public boolean commandIsValid(String commandName) {
		CommandProvider provider = CommandProvider.getInstance();
		return provider.getCommand(commandName) != null;
	}
}
