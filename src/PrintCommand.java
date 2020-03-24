/**
 *  @author ravipatel
 *  this class executes and prints the docs
 */
public class PrintCommand implements Command {

	private Document doc;
	
	/**
	 * @param doc: type of Document
	 */
	public PrintCommand (Document doc) {
		this.doc = doc;
	}
	
	/**
	 * this method excutes and calls print function in Document class 
	 */
	@Override
	public void execute() {
		doc.print();	
	}

	/**
	 * this method returns the name 
	 */
	@Override
	public String getName() {
		return "Print";
	}
	

}