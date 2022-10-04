package by.jonline.basicsofoop.task1.entity;

public class TextFile extends CustomFile {

	private String content;

	public TextFile() {
	}

	public TextFile(String name, String content, Directory directory) {
		super(name, ".txt", directory);
		this.content = content;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "TextFile [name = " + super.getName() + ", extension = " + super.getExtension() + ", content = "
				+ content + ", directory = " + super.getDirectory().getName() + "]";
	}

}
