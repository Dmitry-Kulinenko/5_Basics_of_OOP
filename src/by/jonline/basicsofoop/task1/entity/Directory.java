package by.jonline.basicsofoop.task1.entity;

import java.util.LinkedList;
import java.util.List;

public class Directory {

	private String name;
	private List<CustomFile> customFileList;

	public Directory() {
		customFileList = new LinkedList<>();
	}

	public Directory(String name) {
		this.name = name;
		customFileList = new LinkedList<>();
	}

	public String getName() {
		return name;
	}

	public List<CustomFile> getcustomFileList() {
		return customFileList;
	}

	public void addCustomFile(CustomFile customFile) {
		customFileList.add(customFile);
	}

	public void deleteCustomFile(CustomFile customFile) {
		customFileList.remove(customFile);
	}

	@Override
	public String toString() {
		return "Directory [name = " + name + ", customFileList = " + customFileList + "]";
	}

}
