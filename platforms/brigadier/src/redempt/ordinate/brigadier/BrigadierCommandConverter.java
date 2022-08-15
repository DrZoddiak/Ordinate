package redempt.ordinate.brigadier;

import com.mojang.brigadier.tree.CommandNode;
import redempt.ordinate.command.CommandBase;
import redempt.ordinate.component.abstracts.CommandComponent;

import java.util.Map;

import static com.mojang.brigadier.builder.LiteralArgumentBuilder.literal;

public class BrigadierCommandConverter<T, S> {

	private Map<Class<? extends CommandComponent<T>>, BrigadierAdapter<T, ?>> converters;
	
	public <C extends CommandComponent<T>> void register(Class<C> type, BrigadierAdapter<T, C> adapter) {
		converters.put(type, adapter);
	}
	
	public CommandNode<T> convertToBrigadier(CommandBase<T> command) {
	
	}

}
