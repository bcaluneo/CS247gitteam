/**
 * @author Frank Habersham
 * this class is used as a by the command classes
 */
public class Document {
	private String name;
	
	/**
	 * this constructor is used to create and name a document
	 * @param name: name of the document
	 */
	public Document(String name) {
		this.name = name;
		System.out.println("Documented named "+this.name+" is created");
	}
	
	/**
	 * this method is used to load a document
	 */
	public void load() {
		System.out.println("document "+this.name+" is loaded into view");
	}
	
	/**
	 * this method is used to save a document
	 */
	public void save() {
		System.out.println("document "+this.name+" is being saved...");
	}
	
	/**
	 * this method is used to spell check a document
	 */
	public void spellCheck() {
		System.out.println("documen "+this.name+" is being checked for spelling errors");
	}
	
	/**
	 * this method is used to print out a document
	 */
	public void print() {
		System.out.println("document "+this.name+" is printing...");
	}
}
