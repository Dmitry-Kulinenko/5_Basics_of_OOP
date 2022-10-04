package by.jonline.basicsofoop.task5.entity;

import by.jonline.basicsofoop.task5.entity.giftpackage.GiftPackage;
import by.jonline.basicsofoop.task5.entity.sweets.Sweet;

public class Gift {
	private Sweet sweet;
	private GiftPackage giftPackage;

	public Gift() {
	}

	public Gift(Sweet sweet, GiftPackage giftPackage) {
		this.sweet = sweet;
		this.giftPackage = giftPackage;
	}

	public Sweet getSweet() {
		return sweet;
	}

	public void setSweet(Sweet sweet) {
		this.sweet = sweet;
	}

	public GiftPackage getGiftPackage() {
		return giftPackage;
	}

	public void setGiftPackage(GiftPackage giftPackage) {
		this.giftPackage = giftPackage;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((giftPackage == null) ? 0 : giftPackage.hashCode());
		result = prime * result + ((sweet == null) ? 0 : sweet.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Gift)) {
			return false;
		}
		Gift other = (Gift) obj;
		if (giftPackage == null) {
			if (other.giftPackage != null) {
				return false;
			}
		} else if (!giftPackage.equals(other.giftPackage)) {
			return false;
		}
		if (sweet == null) {
			if (other.sweet != null) {
				return false;
			}
		} else if (!sweet.equals(other.sweet)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Gift [sweet = " + sweet + "\ngiftPackage = " + giftPackage + "]";
	}

}
