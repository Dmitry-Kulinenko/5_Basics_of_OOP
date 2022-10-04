package by.jonline.basicsofoop.task5.service;

public interface GiftService {
	void addGiftToList(String name) throws ServiceException;

	void clearList();

	int calculatePrice();

	int calculateCalories();

	String[] getAllGiftOption();
}
