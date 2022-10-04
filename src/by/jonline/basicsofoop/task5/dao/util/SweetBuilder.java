package by.jonline.basicsofoop.task5.dao.util;

import by.jonline.basicsofoop.task5.entity.sweets.Sweet;

public interface SweetBuilder {
	Sweet create(String[] sweetData);
}
