package by.jonline.basicsofoop.task4.service;

import java.util.List;

import by.jonline.basicsofoop.task4.entity.Treasure;

public interface DragonCaveService {

	public Treasure getTreasureByName(String name) throws ServiceException;

	public Treasure findTheMostExpenciveTreasure() throws ServiceException;

	public List<Treasure> selectTreasure(int sum) throws ServiceException;
}
