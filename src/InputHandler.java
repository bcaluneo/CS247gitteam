import java.util.HashMap;

/**
 * A simple class for handling string input commands.
 * @author Brendan Caluneo
 *
 */
public class InputHandler {
	
	private HashMap<String, Command> commands;
	
	/**
	 * Creates the list of commands for the specified document.
	 * @param document
	 */
	public InputHandler(Document document) {
		commands = new HashMap<String, Command>();
		
		commands.put("load", new LoadCommand(document));
		commands.put("save", new SaveCommand(document));
		commands.put("print", new PrintCommand(document));
		commands.put("spell", new SpellCommand(document));
	}
	
	/**
	 * Parses a string to the right command and executes.
	 * @param data
	 */
	public void inputEntered(String data) {
		Command c = commands.get(data);
		if (c == null) {
			System.out.println("error: inputEntered(String): command not found");
			return;
		}
		
		c.execute();
	}
}