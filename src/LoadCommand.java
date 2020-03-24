/**
 *   @author RaviPatel
 *   this class executes and Loads the document
 */
public class LoadCommand implements Command {
	
	private Document doc;
	
	/**
	 * @param doc: Type of Document
	 */
	public LoadCommand (Document doc) {
		this.doc = doc;
	}
	
	/**
	 * this method executes and calls load function in Document class  
	 */
	@Override
	public void execute() {
		doc.load();
	}

	/**
	 * this function returns the name: load
	 */
	@Override
	public String getName() {
		return "load";
	}
	

}
