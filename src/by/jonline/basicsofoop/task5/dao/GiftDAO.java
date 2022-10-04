package by.jonline.basicsofoop.task5.dao;

import java.util.List;

import by.jonline.basicsofoop.task5.entity.Gift;

public interface GiftDAO {
	List<Gift> getGiftList();

	void addGiftToList(String name) throws DAOException;

	void clearList();

	String[] getAllGiftOption();
}
