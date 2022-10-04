package by.jonline.basicsofoop.task5.service;

import by.jonline.basicsofoop.task5.service.impl.GiftServiceImpl;

public class ServiceProvider {
	private static final ServiceProvider instance = new ServiceProvider();
	private GiftService giftService = new GiftServiceImpl();

	private ServiceProvider() {
	}

	public static ServiceProvider getInstance() {
		return instance;
	}

	public GiftService getGiftService() {
		return giftService;
	}
}
