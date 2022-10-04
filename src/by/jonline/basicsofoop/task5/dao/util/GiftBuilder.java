package by.jonline.basicsofoop.task5.dao.util;

import by.jonline.basicsofoop.task5.entity.Gift;

public interface GiftBuilder {
	Gift create(String[] sweetData, String[] giftPackageData);
}
