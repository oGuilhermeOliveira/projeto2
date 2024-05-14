//package br.com.guilhermeoli.services;
//
//
//import br.com.guilhermeoli.DAO.IClienteDAO;
//import br.com.guilhermeoli.domain.Cliente;
//
///**
// * @author guiol
// */
//public class ClienteService implements IClienteService {
//
//    private IClienteDAO clienteDAO;
//
//    public ClienteService(IClienteDAO clienteDAO) {
//        this.clienteDAO = clienteDAO;
//    }
//
//    @Override
//    public void salvar(Cliente cliente) {
//        clienteDAO.salvar(cliente);
//    }
//
//    @Override
//    public Cliente buscarPorCpf(Long cpf) {
//        return clienteDAO.buscarPorCpf(cpf);
//    }
//}
