package by.jonline.basicsofoop.task4.entity;

public class Treasure implements Comparable<Treasure> {
	private String name;
	private int value;

	public Treasure() {
	}

	public Treasure(String name, int value) {
		this.name = name;
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public int getValue() {
		return value;
	}

	@Override
	public int compareTo(Treasure o) {
		return this.value - o.value;
	}

	@Override
	public String toString() {
		return "Treasure [name = " + name + ", value = " + value + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + value;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Treasure)) {
			return false;
		}
		Treasure other = (Treasure) obj;
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		if (value != other.value) {
			return false;
		}
		return true;
	}

}
