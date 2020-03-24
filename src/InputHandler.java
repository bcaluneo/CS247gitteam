import java.util.HashMap;

public class InputHandler {
	
	private HashMap<String, Command> commands;
	
	public InputHandler(Document document) {
		commands = new HashMap<String, Command>();
		
		commands.put("load", new LoadCommand(document));
		commands.put("save", new SaveCommand(document));
		commands.put("print", new PrintCommand(document));
		commands.put("spell", new SpellCommand(document));
	}
	
	public void inputEntered(String data) {
		Command c = commands.get(data);
		if (c == null) {
			System.out.println("error: inputEntered(String): command not found");
			return;
		}
		
		c.execute();
	}
}