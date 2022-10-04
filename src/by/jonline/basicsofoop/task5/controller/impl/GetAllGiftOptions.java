package by.jonline.basicsofoop.task5.controller.impl;

import by.jonline.basicsofoop.task5.controller.Command;
import by.jonline.basicsofoop.task5.service.GiftService;
import by.jonline.basicsofoop.task5.service.ServiceProvider;

public class GetAllGiftOptions implements Command {

	@Override
	public String execute(String parameter) {
		ServiceProvider instance = ServiceProvider.getInstance();
		GiftService service = instance.getGiftService();

		String[] giftOptions = service.getAllGiftOption();
		StringBuilder response = new StringBuilder();

		for (String gift : giftOptions) {
			response.append(gift + "\n");
		}
		return response.toString();
	}

}
