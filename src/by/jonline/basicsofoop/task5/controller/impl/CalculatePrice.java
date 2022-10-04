package by.jonline.basicsofoop.task5.controller.impl;

import by.jonline.basicsofoop.task5.controller.Command;
import by.jonline.basicsofoop.task5.service.GiftService;
import by.jonline.basicsofoop.task5.service.ServiceProvider;

public class CalculatePrice implements Command {

	@Override
	public String execute(String parameter) {
		ServiceProvider instance = ServiceProvider.getInstance();
		GiftService service = instance.getGiftService();
		int price = service.calculatePrice();
		return "Стоимость всех подарков в списке: " + price;
	}

}
