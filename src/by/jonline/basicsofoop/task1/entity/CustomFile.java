package by.jonline.basicsofoop.task1.entity;

public class CustomFile {
	private String name;
	private String extension;
	private Directory directory;

	public CustomFile() {
	}

	public CustomFile(String name, String extension, Directory directory) {
		this.name = name;
		this.extension = extension;
		this.directory = directory;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public Directory getDirectory() {
		return directory;
	}

	public void setDirectory(Directory directory) {
		this.directory = directory;
	}

	@Override
	public String toString() {
		return "CustomFile [name = " + name + ", extension = " + extension + ", directory = " + directory.getName()
				+ "]";
	}

}
