/**
 * Osama Askar
 */
public class SpellCommand implements Command {
	
	private Document doc;
	
	/**
	 * @param doc: Document Type
	 */
	public SpellCommand (Document doc) {
		this.doc = doc;
		
	}
	/**
	 * executes and calls spell function 
	 */
	@Override
	public void execute() {
		doc.spell();
		
	}
	/**
	 * returns the name: spell
	 */
	@Override
	public String getName() {
		return "spell";
	}
	

}
