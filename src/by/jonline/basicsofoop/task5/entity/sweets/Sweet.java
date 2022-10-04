package by.jonline.basicsofoop.task5.entity.sweets;

import by.jonline.basicsofoop.task5.entity.TradeItem;

public abstract class Sweet extends TradeItem {
	private int calories;

	public Sweet() {
	}

	public Sweet(String name, int price, int caloris) {
		super(name, price);
		this.calories = caloris;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + calories;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!super.equals(obj)) {
			return false;
		}
		if (!(obj instanceof Sweet)) {
			return false;
		}
		Sweet other = (Sweet) obj;
		if (calories != other.calories) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return super.toString() + ": " + "Sweet [calories = " + calories + "]";
	}

}
