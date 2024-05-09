package br.com.guilhermeoli.services;

import br.com.guilhermeoli.DAO.ClienteDAO;
import br.com.guilhermeoli.DAO.IClienteDAO;
import br.com.guilhermeoli.domain.Cliente;

/**
 * @author guiol
 */
public class ClienteService implements IClienteService {

    private IClienteDAO clienteDAO;

    public ClienteService(IClienteDAO clienteDAO) {
        this.clienteDAO = new ClienteDAO();
    }

    @Override
    public void salvar(Cliente cliente) {
        clienteDAO.salvar(cliente);
    }

    @Override
    public Cliente buscarPorCpf(Long cpf) {
        return null;
    }
}
