
public class Document {
	private String name;
	public Document(String name) {
		this.name = name;
		System.out.println("Documented named "+this.name+" is created");
	}
	
	public void load() {
		System.out.println("document "+this.name+" is loaded into view");
	}
	
	public void save() {
		System.out.println("document "+this.name+" is being saved...");
	}
	
	public void spellCeck() {
		System.out.println("documen "+this.name+" is being checked for spelling errors");
	}
	
	public void print() {
		System.out.println("document "+this.name+" is printing...");
	}
}
