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
	 * executes and calls spellCheck function 
	 */
	@Override
	public void execute() {
		doc.spellCheck();
		
	}
	/**
	 * returns the name: spell
	 */
	@Override
	public String getName() {
		return "spell";
	}
	

}
