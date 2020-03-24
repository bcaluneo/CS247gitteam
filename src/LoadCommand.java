/**
 *   @author ravipatel
 *   this class executes and Loads the document
 */
public class LoadCommand implements Command {
	
	private Document doc;
	
	/**
	 * @param doc: type of Document
	 */
	public LoadCommand (Document doc) {
		this.doc = doc;
	}
	
	/**
	 * this method excutes and calls load function in Document class  
	 */
	@Override
	public void execute() {
		doc.load();
	}

	/**
	 * this function returns the name
	 */
	@Override
	public String getName() {
		return "Load";
	}
	

}
