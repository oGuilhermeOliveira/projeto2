package br.com.guilhermeoli.DAO;

import br.com.guilhermeoli.domain.Cliente;

public interface IClienteDAO {
    void salvar(Cliente cliente);

    Cliente buscarPorCpf(Long cpf);
}
