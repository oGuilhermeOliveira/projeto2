package br.com.guilhermeoli.DAO;

import br.com.guilhermeoli.domain.Cliente;

/**
 * @author guiol
 */
public class ClienteDAOMock implements IClienteDAO{
    @Override
    public void salvar(Cliente cliente) {

    }

    @Override
    public Cliente buscarPorCpf(Long cpf) {
        Cliente cliente = new Cliente();
        cliente.setCpf(cpf);
        return cliente;
    }
}
