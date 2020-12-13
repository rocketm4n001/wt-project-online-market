package controller;

import controller.command.Command;
import controller.command.impl.*;

import java.util.HashMap;
import java.util.Map;

final class CommandProvider 
{
    private final Map<CommandName, Command> repository = new HashMap<>();

    CommandProvider() 
	{
        repository.put(CommandName.REGISTRATION, new Register());
        repository.put(CommandName.DEFAULT_PAGE, new DefaultPage());
        repository.put(CommandName.MAIN, new OpenMain());
        repository.put(CommandName.CART, new Cart());
        repository.put(CommandName.ABOUT, new ProductInfo());
        repository.put(CommandName.SIGN_IN, new SignIn());
    }

    Command getCommand (String name) 
	{
        CommandName commandName = null;
        Command command = null;

        name=name.substring(1);
        try
		{
            commandName = CommandName.valueOf(name.toUpperCase());
            command = repository.get(commandName);
        } 
		catch (IllegalArgumentException | NullPointerException e) 
		{
            command = repository.get(CommandName.DEFAULT_PAGE);
        }
		
        return command;
    }
}

