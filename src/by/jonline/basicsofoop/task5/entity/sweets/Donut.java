package by.jonline.basicsofoop.task5.entity.sweets;

public class Donut extends Sweet {
	private String topping;

	public Donut() {
	}

	public Donut(String name, int price, int caloris, String topping) {
		super(name, price, caloris);
		this.topping = topping;
	}

	public String getTopping() {
		return topping;
	}

	public void setTopping(String topping) {
		this.topping = topping;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((topping == null) ? 0 : topping.hashCode());
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
		if (!(obj instanceof Donut)) {
			return false;
		}
		Donut other = (Donut) obj;
		if (topping == null) {
			if (other.topping != null) {
				return false;
			}
		} else if (!topping.equals(other.topping)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return super.toString() + ": " + "Donut [topping = " + topping + "]";
	}

}
