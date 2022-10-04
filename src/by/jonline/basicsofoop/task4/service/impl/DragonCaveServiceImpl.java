
package by.jonline.basicsofoop.task4.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import by.jonline.basicsofoop.task4.dao.DAOException;
import by.jonline.basicsofoop.task4.dao.DAOProvider;
import by.jonline.basicsofoop.task4.entity.DragonCave;
import by.jonline.basicsofoop.task4.entity.Treasure;
import by.jonline.basicsofoop.task4.service.DragonCaveService;
import by.jonline.basicsofoop.task4.service.ServiceException;

public class DragonCaveServiceImpl implements DragonCaveService {
	DAOProvider daoInstance = DAOProvider.getInstance();

	@Override
	public Treasure getTreasureByName(String name) throws ServiceException {
		DragonCave cave;
		try {
			cave = daoInstance.getDragonCaveDAO().getDragonCave();
		} catch (DAOException e) {
			throw new ServiceException(e);
		}
		List<Treasure> treasureList = cave.getTreasureList();
		for (Treasure treasure : treasureList) {
			if (treasure.getName().equals(name)) {
				return treasure;
			}
		}
		throw new ServiceException("Неверное название сокровища.");
	}

	@Override
	public Treasure findTheMostExpenciveTreasure() throws ServiceException {
		DragonCave cave;
		try {
			cave = daoInstance.getDragonCaveDAO().getDragonCave();
		} catch (DAOException e) {
			throw new ServiceException(e);
		}
		List<Treasure> treasureList = cave.getTreasureList();
		Treasure max = new Treasure();
		for (Treasure treasure : treasureList) {
			if (treasure.compareTo(max) > 0) {
				max = treasure;
			}
		}
		return max;
	}

	@Override
	public List<Treasure> selectTreasure(int sum) throws ServiceException {
		DragonCave cave;
		try {
			cave = daoInstance.getDragonCaveDAO().getDragonCave();
		} catch (DAOException e) {
			throw new ServiceException(e);
		}
		List<Treasure> treasureList = cave.getTreasureList();
		Map<Integer, Integer> possibleSums = new HashMap<>();// карта всех возможных сумм стоимости сокровищ
		Map<Integer, Integer> newSums = new HashMap<>();// вспомогательная карта
		List<Integer> valueArray = new ArrayList<>(treasureList.size());// массив стоимости всех сокровищ
		List<Map<Integer, Integer>> records = new ArrayList<>();// массив карт. В картах лежат суммы сокровищ, карты
																// расположены в порядке для поиска сокровищ, из которых
																// была составлена сумма
		int bestSum = 0;// ближайшая сумма к заданной(<=)
		int recordIndex = treasureList.size() - 1;// индекс для поиска сокровищ, из которы составлена сумма
		List<Treasure> result = new LinkedList<>();

		for (Treasure treasure : treasureList) {
			valueArray.add(treasure.getValue());
		}

		for (int i = 0; i < valueArray.size(); i++) {// поиск всех возможных сумм
			for (Map.Entry<Integer, Integer> entry : possibleSums.entrySet()) {
				newSums.put(entry.getKey() + valueArray.get(i), i);
			}
			newSums.put(valueArray.get(i), i);
			possibleSums.putAll(newSums);
			records.add(new HashMap<>(possibleSums));
		}

		for (Map<Integer, Integer> map : records) {// поиск ближайшей суммы
			for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
				if (entry.getKey() <= sum && entry.getKey() > bestSum) {
					bestSum = entry.getKey();
				}
			}
		}

		while (bestSum > 0) {// поиск сокровищ, из которых составлена сумма
			int lastindex = records.get(recordIndex).get(bestSum);
			result.add(treasureList.get(lastindex));
			bestSum -= valueArray.get(lastindex);
			recordIndex = lastindex - 1;
		}

		return result;
	}

}