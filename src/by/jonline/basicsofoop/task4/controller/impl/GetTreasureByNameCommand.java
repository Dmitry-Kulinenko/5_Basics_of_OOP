package by.jonline.basicsofoop.task4.controller.impl;

import by.jonline.basicsofoop.task4.controller.Command;
import by.jonline.basicsofoop.task4.service.DragonCaveService;
import by.jonline.basicsofoop.task4.service.ServiceException;
import by.jonline.basicsofoop.task4.service.ServiceProvider;

public class GetTreasureByNameCommand implements Command {

	@Override
	public String execute(String parameter) {
		ServiceProvider instance = ServiceProvider.getInstance();
		DragonCaveService service = instance.getDragonCaveService();

		try {
			return service.getTreasureByName(parameter).toString();
		} catch (ServiceException e) {
			return "Ошибка:\n " + e.getMessage();
		}
	}

}
