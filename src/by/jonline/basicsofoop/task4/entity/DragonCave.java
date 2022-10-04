package by.jonline.basicsofoop.task4.entity;

import java.util.List;

public class DragonCave {
	private List<Treasure> treasureList;

	public DragonCave() {
	}

	public DragonCave(List<Treasure> treasureList) {
		this.treasureList = treasureList;
	}

	public List<Treasure> getTreasureList() {
		return treasureList;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((treasureList == null) ? 0 : treasureList.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof DragonCave)) {
			return false;
		}
		DragonCave other = (DragonCave) obj;
		if (treasureList == null) {
			if (other.treasureList != null) {
				return false;
			}
		} else if (!treasureList.equals(other.treasureList)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "DragonCave [treasureList = " + treasureList + "]";
	}

}
