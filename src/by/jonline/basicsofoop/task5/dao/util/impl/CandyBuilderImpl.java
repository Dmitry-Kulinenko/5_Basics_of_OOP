package by.jonline.basicsofoop.task5.dao.util.impl;

import by.jonline.basicsofoop.task5.dao.util.SweetBuilder;
import by.jonline.basicsofoop.task5.entity.sweets.Candy;
import by.jonline.basicsofoop.task5.entity.sweets.Sweet;

public class CandyBuilderImpl implements SweetBuilder {

	@Override
	public Sweet create(String[] sweetData) {
		return new Candy(sweetData[0], Integer.parseInt(sweetData[1]), Integer.parseInt(sweetData[2]), sweetData[3]);
	}

}
