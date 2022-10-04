package by.jonline.basicsofoop.task5.dao.util.impl;

import by.jonline.basicsofoop.task5.dao.util.SweetBuilder;
import by.jonline.basicsofoop.task5.entity.sweets.Pie;
import by.jonline.basicsofoop.task5.entity.sweets.Sweet;

public class PieBuilderImpl implements SweetBuilder {

	@Override
	public Sweet create(String[] sweetData) {
		return new Pie(sweetData[0], Integer.parseInt(sweetData[1]), Integer.parseInt(sweetData[2]), sweetData[3]);
	}

}
