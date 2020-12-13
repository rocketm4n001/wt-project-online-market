package controller;

import controller.command.Command;
import controller.command.impl.*;

// Перечисление комманд
public enum CommandName 
{
    REGISTRATION (new Register()),
    SIGN_IN (new SignIn()),
    DEFAULT_PAGE (new DefaultPage()),
    MAIN (new OpenMain()),
    CART (new Cart()),
    ABOUT (new ProductInfo());

    private Command command;

    CommandName(Command command)
	{
        this.command = command;
    }

    public Command getCommand()
	{
        return command;
    }
}
