package by.jonline.basicsofoop.task4.controller;

import java.util.HashMap;
import java.util.Map;

import by.jonline.basicsofoop.task4.controller.impl.FindTheMostExpenciveTreasureCommand;
import by.jonline.basicsofoop.task4.controller.impl.GetTreasureByNameCommand;
import by.jonline.basicsofoop.task4.controller.impl.SelectTreasureCommand;

public class CommandProvider {
	private static final CommandProvider instance = new CommandProvider();
	Map<String, Command> commands = new HashMap<>();

	private CommandProvider() {
		commands.put("Get treasure by name", new GetTreasureByNameCommand());
		commands.put("Find the most expencive treasure", new FindTheMostExpenciveTreasureCommand());
		commands.put("Select treasure", new SelectTreasureCommand());
	}

	public static CommandProvider getInstance() {
		return instance;
	}

	public Command getCommand(String name) {
		return commands.get(name);
	}

}
