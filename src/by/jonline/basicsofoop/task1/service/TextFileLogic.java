package by.jonline.basicsofoop.task1.service;

import by.jonline.basicsofoop.task1.entity.CustomFile;
import by.jonline.basicsofoop.task1.entity.Directory;
import by.jonline.basicsofoop.task1.entity.TextFile;

public class TextFileLogic {

	public TextFile create() {
		return new TextFile();
	}

	public TextFile create(String name, String content, Directory directory) {
		TextFile file = new TextFile(name, content, directory);
		directory.addCustomFile(file);
		return file;
	}

	public void rename(TextFile file, String newName) {
		file.setName(newName);
	}

	public void print(TextFile file) {
		System.out.println(file.getName() + "\n" + file.getContent());
	}

	public void addContect(TextFile file, String add) {
		file.setContent(file.getContent() + add);
	}

	public void delete(CustomFile file) {
		file.getDirectory().deleteCustomFile(file);
		file.setDirectory(null);
		file.setExtension(null);
		file.setName(null);
	}

}
