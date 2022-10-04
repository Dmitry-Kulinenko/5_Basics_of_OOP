package by.jonline.basicsofoop.task5.entity.giftpackage;

import by.jonline.basicsofoop.task5.entity.TradeItem;

public class GiftPackage extends TradeItem {
	private PackageColor color;
	private PackageShape shape;

	public GiftPackage() {
	}

	public GiftPackage(String name, int price, PackageColor color, PackageShape shape) {
		super(name, price);
		this.color = color;
		this.shape = shape;
	}

	public PackageColor getColor() {
		return color;
	}

	public void setColor(PackageColor color) {
		this.color = color;
	}

	public PackageShape getShape() {
		return shape;
	}

	public void setShape(PackageShape shape) {
		this.shape = shape;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((shape == null) ? 0 : shape.hashCode());
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
		if (!(obj instanceof GiftPackage)) {
			return false;
		}
		GiftPackage other = (GiftPackage) obj;
		if (color != other.color) {
			return false;
		}
		if (shape != other.shape) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return super.toString() + ": " + "GiftPackage [color = " + color + ", shape = " + shape + "]";
	}

}
