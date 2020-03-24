/**
 * Osama Askar
 */
public class SaveCommand implements Command {

	
	private Document doc;
	
	/**
	 * @param doc: Document Type
	 */
	public SaveCommand (Document doc) {
		this.doc = doc;
		
	}
	/**
	 * executes and calls save function
	 */
	@Override
	public void execute() {
		doc.save();
		
	}
	/**
	 * returns the name: save
	 */
	@Override
	public String getName() {
		return "save";
	}
	

}