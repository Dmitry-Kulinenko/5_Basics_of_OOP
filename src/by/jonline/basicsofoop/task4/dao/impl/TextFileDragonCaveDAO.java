package by.jonline.basicsofoop.task4.dao.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import by.jonline.basicsofoop.task4.dao.DAOException;
import by.jonline.basicsofoop.task4.dao.DragonCaveDAO;
import by.jonline.basicsofoop.task4.entity.DragonCave;
import by.jonline.basicsofoop.task4.entity.Treasure;

public class TextFileDragonCaveDAO implements DragonCaveDAO {

	private DragonCave dragonCave;

	@Override
	public DragonCave getDragonCave() throws DAOException {
		if (dragonCave != null) {
			return dragonCave;
		}
		String fileSource = "src\\by\\jonline\\basicsofoop\\task4\\resources\\Source.txt";
		String regex = "(\\w+\\s#\\d+);\\s\\w+:\\s(\\d+)";
		List<String> treasureData = null;
		try {
			treasureData = readListFromFile(fileSource);
		} catch (IOException e) {
			throw new DAOException(e);
		}
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = null;
		List<Treasure> treasureList = new LinkedList<>();
		for (String treasureString : treasureData) {
			matcher = pattern.matcher(treasureString);
			if (matcher.matches()) {
				treasureList.add(new Treasure(matcher.group(1), Integer.parseInt(matcher.group(2))));
			}
		}
		dragonCave = new DragonCave(treasureList);
		return dragonCave;
	}

	private List<String> readListFromFile(String fileName) throws IOException {
		File file = new File(fileName);

		try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
			List<String> output = new LinkedList<>();

			String data = reader.readLine();
			do {
				output.add(data);
				data = reader.readLine();
			} while (data != null);

			return output;
		}
	}
}
