package by.jonline.basicsofoop.task5.dao;

import by.jonline.basicsofoop.task5.dao.impl.TextFileGiftDAO;

public class DAOProvider {
	private static final DAOProvider instance = new DAOProvider();
	private GiftDAO giftDAO = new TextFileGiftDAO();

	private DAOProvider() {
	}

	public static DAOProvider getInstance() {
		return instance;
	}

	public GiftDAO getGiftDAO() {
		return giftDAO;
	}

}
