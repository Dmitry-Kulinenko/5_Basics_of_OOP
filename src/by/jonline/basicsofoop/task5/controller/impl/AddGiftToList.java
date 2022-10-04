package by.jonline.basicsofoop.task5.controller.impl;

import by.jonline.basicsofoop.task5.controller.Command;
import by.jonline.basicsofoop.task5.service.GiftService;
import by.jonline.basicsofoop.task5.service.ServiceException;
import by.jonline.basicsofoop.task5.service.ServiceProvider;

public class AddGiftToList implements Command {

	@Override
	public String execute(String parameter) {
		ServiceProvider instance = ServiceProvider.getInstance();
		GiftService service = instance.getGiftService();
		try {
			service.addGiftToList(parameter);
		} catch (ServiceException e) {
			return "Ошибка:\n" + e.getMessage();
		}
		return "Подарок " + parameter + " добавлен в список";
	}

}
