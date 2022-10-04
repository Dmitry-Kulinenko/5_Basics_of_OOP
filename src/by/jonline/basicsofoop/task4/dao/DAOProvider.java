package by.jonline.basicsofoop.task4.dao;

import by.jonline.basicsofoop.task4.dao.impl.TextFileDragonCaveDAO;

public class DAOProvider {
	private static final DAOProvider instance = new DAOProvider();
	private DragonCaveDAO DragonCaveDAO = new TextFileDragonCaveDAO();

	private DAOProvider() {
	}

	public static DAOProvider getInstance() {
		return instance;
	}

	public DragonCaveDAO getDragonCaveDAO() {
		return DragonCaveDAO;
	}

}
