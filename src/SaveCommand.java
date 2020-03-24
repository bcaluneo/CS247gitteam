
public class SaveCommand implements Command {

	
	private Document doc;
	
	/**
	 * @param doc: Document Type
	 */
	public SaveCommand (Document doc) {
		this.doc = doc;
		
	}
	@Override
	public void execute() {
		doc.save();
		
	}

	@Override
	public String getName() {
		return "save";
	}
	

}