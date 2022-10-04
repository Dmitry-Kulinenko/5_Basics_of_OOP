package by.jonline.basicsofoop.task5.dao.util.impl;

import by.jonline.basicsofoop.task5.dao.util.GiftPackageBuilder;
import by.jonline.basicsofoop.task5.entity.giftpackage.GiftPackage;
import by.jonline.basicsofoop.task5.entity.giftpackage.PackageColor;
import by.jonline.basicsofoop.task5.entity.giftpackage.PackageShape;

public class GiftPackageBuilderImpl implements GiftPackageBuilder {

	@Override
	public GiftPackage create(String[] giftPackageData) {
		return new GiftPackage(giftPackageData[0], Integer.parseInt(giftPackageData[1]),
				PackageColor.valueOf(giftPackageData[2].toUpperCase()),
				PackageShape.valueOf(giftPackageData[3].toUpperCase()));
	}

}
