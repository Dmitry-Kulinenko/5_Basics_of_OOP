package by.jonline.basicsofoop.task5.dao.util.impl;

import by.jonline.basicsofoop.task5.dao.util.GiftBuilder;
import by.jonline.basicsofoop.task5.dao.util.GiftPackageBuilder;
import by.jonline.basicsofoop.task5.dao.util.SweetBuilder;
import by.jonline.basicsofoop.task5.entity.Gift;
import by.jonline.basicsofoop.task5.entity.giftpackage.GiftPackage;
import by.jonline.basicsofoop.task5.entity.sweets.Sweet;

public class GiftBuilderImpl implements GiftBuilder {

	@Override
	public Gift create(String[] sweetData, String[] giftPackageData) {
		SweetBuilder sweetBuilder = null;
		String type = sweetData[0].split("\\s")[1];

		switch (type) {
		case "pie":
			sweetBuilder = new PieBuilderImpl();
			break;
		case "donut":
			sweetBuilder = new DonutBuilderImpl();
			break;
		case "candy":
			sweetBuilder = new CandyBuilderImpl();
			break;
		}

		GiftPackageBuilder giftPackageBuilder = new GiftPackageBuilderImpl();
		Sweet sweet = sweetBuilder.create(sweetData);
		GiftPackage giftPackage = giftPackageBuilder.create(giftPackageData);
		return new Gift(sweet, giftPackage);
	}

}
