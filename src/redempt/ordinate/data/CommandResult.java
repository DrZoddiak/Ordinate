package redempt.ordinate.data;

import redempt.ordinate.component.CommandComponent;

public class CommandResult<T> {
	
	private CommandComponent<T> component;
	private String[] error;
	
	public CommandResult(CommandComponent<T> component, String[] error) {
		this.component = component;
		this.error = error;
	}
	
	public CommandComponent<T> getComponent() {
		return component;
	}
	
	public boolean isSuccess() {
		return error == null;
	}
	
	public String[] getError() {
		return error;
	}
	
}
