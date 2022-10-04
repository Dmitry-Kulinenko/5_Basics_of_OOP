package by.jonline.basicsofoop.task4.service;

import by.jonline.basicsofoop.task4.service.impl.DragonCaveServiceImpl;

public class ServiceProvider {
	private static final ServiceProvider instance = new ServiceProvider();
	private DragonCaveService dragonCaveService = new DragonCaveServiceImpl();

	private ServiceProvider() {
	}

	public static ServiceProvider getInstance() {
		return instance;
	}

	public DragonCaveService getDragonCaveService() {
		return dragonCaveService;
	}
}
