package by.jonline.basicsofoop.task5.dao.util.impl;

import by.jonline.basicsofoop.task5.dao.util.SweetBuilder;
import by.jonline.basicsofoop.task5.entity.sweets.Donut;
import by.jonline.basicsofoop.task5.entity.sweets.Sweet;

public class DonutBuilderImpl implements SweetBuilder {

	@Override
	public Sweet create(String[] sweetData) {
		return new Donut(sweetData[0], Integer.parseInt(sweetData[1]), Integer.parseInt(sweetData[2]), sweetData[3]);
	}

}
