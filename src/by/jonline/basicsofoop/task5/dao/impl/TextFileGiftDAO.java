package by.jonline.basicsofoop.task5.dao.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import by.jonline.basicsofoop.task5.dao.DAOException;
import by.jonline.basicsofoop.task5.dao.GiftDAO;
import by.jonline.basicsofoop.task5.dao.util.GiftBuilder;
import by.jonline.basicsofoop.task5.dao.util.impl.GiftBuilderImpl;
import by.jonline.basicsofoop.task5.entity.Gift;

public class TextFileGiftDAO implements GiftDAO {
	private List<Gift> gifts = new LinkedList<>();

	@Override
	public List<Gift> getGiftList() {
		return gifts;
	}

	@Override
	public void addGiftToList(String name) throws DAOException {
		String sweetFileSource = "src\\by\\jonline\\basicsofoop\\task5\\resources\\" + name + "\\" + name + ".txt";
		String giftPackageFileSource = "src\\by\\jonline\\basicsofoop\\task5\\resources\\" + name
				+ "\\Gift package.txt";
		File sweetFile = new File(sweetFileSource);
		File giftPackageFile = new File(giftPackageFileSource);

		String separator = ";\\s?";

		String[] sweetData;
		String[] giftPackageData;

		try (BufferedReader reader = new BufferedReader(new FileReader(sweetFile))) {
			String data = reader.readLine();
			sweetData = data.split(separator);
		} catch (IOException e) {
			throw new DAOException(e);
		}

		try (BufferedReader reader = new BufferedReader(new FileReader(giftPackageFile))) {
			String data = reader.readLine();
			giftPackageData = data.split(separator);
		} catch (IOException e) {
			throw new DAOException(e);
		}

		GiftBuilder giftBuilder = new GiftBuilderImpl();
		gifts.add(giftBuilder.create(sweetData, giftPackageData));
	}

	@Override
	public void clearList() {
		this.gifts.clear();
	}

	@Override
	public String[] getAllGiftOption() {
		String giftsSource = "src\\by\\jonline\\basicsofoop\\task5\\resources\\";
		File file = new File(giftsSource);
		return file.list();
	}
}
