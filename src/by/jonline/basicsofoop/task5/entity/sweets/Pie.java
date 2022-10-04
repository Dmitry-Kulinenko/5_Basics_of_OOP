package by.jonline.basicsofoop.task5.entity.sweets;

public class Pie extends Sweet {
	private String filling;

	public Pie() {
	}

	public Pie(String name, int price, int caloris, String filling) {
		super(name, price, caloris);
		this.filling = filling;
	}

	public String getFilling() {
		return filling;
	}

	public void setFilling(String filling) {
		this.filling = filling;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((filling == null) ? 0 : filling.hashCode());
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
		if (!(obj instanceof Pie)) {
			return false;
		}
		Pie other = (Pie) obj;
		if (filling == null) {
			if (other.filling != null) {
				return false;
			}
		} else if (!filling.equals(other.filling)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return super.toString() + ": " + "Pie [filling = " + filling + "]";
	}

}
