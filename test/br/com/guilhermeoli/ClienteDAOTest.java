package br.com.guilhermeoli;

import br.com.guilhermeoli.DAO.ClienteDAO;
import br.com.guilhermeoli.DAO.IClienteDAO;
import br.com.guilhermeoli.domain.Cliente;

/**
 * @author guiol
 */
public class ClienteDAOTest {

    private IClienteDAO clienteDAO;

    private Cliente cliente;

    public ClienteDAOTest() {
        clienteDAO = new ClienteDAO();
    }

    public void pesquisarCliente() {

    }
}
