package Exercice1;


/**
 * @author  h40003073
 */
public class Game {
	/**
	 * @uml.property  name="commands"
	 * @uml.associationEnd  multiplicity="(0 -1)"
	 */
	private Command[] commands = new Command[4];
	/**
	 * @uml.property  name="undoCommand"
	 * @uml.associationEnd  
	 */
	private Command undoCommand;
	
	public void pushKey(int key) {
		commands[key].execute();
		undoCommand = commands[key];
	}

	public void undo(){
		undoCommand.undo();
	}

	public void setCommand(int key, Command command){
		commands[key] = command;
	}
	
}

