package by.jonline.basicsofoop.task5.controller;

import java.util.HashMap;
import java.util.Map;

import by.jonline.basicsofoop.task5.controller.impl.AddGiftToList;
import by.jonline.basicsofoop.task5.controller.impl.CalculateCalories;
import by.jonline.basicsofoop.task5.controller.impl.CalculatePrice;
import by.jonline.basicsofoop.task5.controller.impl.ClearList;
import by.jonline.basicsofoop.task5.controller.impl.GetAllGiftOptions;

public class CommandProvider {
	private static final CommandProvider instance = new CommandProvider();
	private Map<String, Command> commands = new HashMap<>();

	private CommandProvider() {
		commands.put("Add gift to list", new AddGiftToList());
		commands.put("Calculate price", new CalculatePrice());
		commands.put("Calculate calories", new CalculateCalories());
		commands.put("Get all gift options", new GetAllGiftOptions());
		commands.put("Clear list", new ClearList());
	}

	public static CommandProvider getInstance() {
		return instance;
	}

	public Command getCommand(String name) {
		return commands.get(name);
	}

}
