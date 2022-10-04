package by.jonline.basicsofoop.task5.service.impl;

import java.util.List;

import by.jonline.basicsofoop.task5.dao.DAOException;
import by.jonline.basicsofoop.task5.dao.DAOProvider;
import by.jonline.basicsofoop.task5.dao.GiftDAO;
import by.jonline.basicsofoop.task5.entity.Gift;
import by.jonline.basicsofoop.task5.service.GiftService;
import by.jonline.basicsofoop.task5.service.ServiceException;

public class GiftServiceImpl implements GiftService {
	GiftDAO daoInstance = DAOProvider.getInstance().getGiftDAO();

	@Override
	public void addGiftToList(String name) throws ServiceException {
		try {
			daoInstance.addGiftToList(name);
		} catch (DAOException e) {
			throw new ServiceException(e);
		}

	}

	@Override
	public void clearList() {
		daoInstance.clearList();
	}

	@Override
	public int calculatePrice() {
		List<Gift> gifts = daoInstance.getGiftList();
		int price = 0;
		for (Gift gift : gifts) {
			price += gift.getSweet().getPrice() + gift.getGiftPackage().getPrice();
		}
		return price;
	}

	@Override
	public int calculateCalories() {
		List<Gift> gifts = daoInstance.getGiftList();
		int calories = 0;
		for (Gift gift : gifts) {
			calories += gift.getSweet().getCalories();
		}
		return calories;
	}

	@Override
	public String[] getAllGiftOption() {
		return daoInstance.getAllGiftOption();
	}

}
