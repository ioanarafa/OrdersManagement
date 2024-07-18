package businessLogic;


import dataAccess.ClientDAO;
import model.Client;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class ClientBLL {
    private ClientDAO clientDAO;

    public ClientBLL() {
        clientDAO = new ClientDAO();
    }

    public List<Client> getAllClients() {
        return clientDAO.findAll();
    }

    public Client getClientById(int id) {
        return clientDAO.findById(id);
    }

    public Client addClient(Client client) {
        return clientDAO.insert(client);
    }

    public Client updateClient(Client client) {
        return clientDAO.update(client);
    }
    public void deleteClient(int clientId) {
        clientDAO.delete(clientId);
    }

}
