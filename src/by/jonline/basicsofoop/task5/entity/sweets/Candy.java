package by.jonline.basicsofoop.task5.entity.sweets;

public class Candy extends Sweet {
	private String flavor;

	public Candy() {
	}

	public Candy(String name, int price, int caloris, String flawor) {
		super(name, price, caloris);
		this.flavor = flawor;
	}

	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((flavor == null) ? 0 : flavor.hashCode());
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
		if (!(obj instanceof Candy)) {
			return false;
		}
		Candy other = (Candy) obj;
		if (flavor == null) {
			if (other.flavor != null) {
				return false;
			}
		} else if (!flavor.equals(other.flavor)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return super.toString() + ": " + "Candy [flavor = " + flavor + "]";
	}

}
