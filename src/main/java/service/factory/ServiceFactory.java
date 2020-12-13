package service.factory;

import service.ClientService;
import service.impl.ClientServiceImpl;

public final class ServiceFactory 
{
    private static final ServiceFactory instance = new ServiceFactory();
    private final ClientService clientService = new ClientServiceImpl();

    private ServiceFactory(){}

    public static ServiceFactory getInstance()
	{
        return instance;
    }

    public ClientService getClientService()
	{
        return clientService;
    }
}
