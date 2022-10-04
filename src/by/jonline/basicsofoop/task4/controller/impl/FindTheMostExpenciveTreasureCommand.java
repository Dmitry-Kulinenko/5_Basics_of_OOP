package by.jonline.basicsofoop.task4.controller.impl;

import by.jonline.basicsofoop.task4.controller.Command;
import by.jonline.basicsofoop.task4.service.DragonCaveService;
import by.jonline.basicsofoop.task4.service.ServiceException;
import by.jonline.basicsofoop.task4.service.ServiceProvider;

public class FindTheMostExpenciveTreasureCommand implements Command {

	@Override
	public String execute(String parameter) {
		ServiceProvider instance = ServiceProvider.getInstance();
		DragonCaveService service = instance.getDragonCaveService();

		try {
			return service.findTheMostExpenciveTreasure().toString();
		} catch (ServiceException e) {
			return "Ошибка:\n" + e.getMessage();
		}
	}

}
