//package br.com.guilhermeoli;
//
//import br.com.guilhermeoli.DAO.ClienteDAOMock;
//import br.com.guilhermeoli.DAO.IClienteDAO;
//import br.com.guilhermeoli.domain.Cliente;
//import br.com.guilhermeoli.services.ClienteService;
//import br.com.guilhermeoli.services.IClienteService;
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.Test;
//
///**
// * @author guiol
// */
//public class ClienteServiceTest {
//
//    private IClienteService clienteService;
//
//    private Cliente cliente;
//
//    public ClienteServiceTest() {
//        IClienteDAO dao = new ClienteDAOMock();
//        clienteService = new ClienteService(dao);
//    }
//
//    @Before
//    public void init() {
//        Cliente cliente = new Cliente();
//        cliente.setCpf(1231231231L);
//        cliente.setNome("Steve Harris");
//        cliente.setCidade("Londres");
//        cliente.setEnd("Leytonstone");
//        cliente.setNumero(10);
//        cliente.setEstado("Reino Unido");
//        cliente.setTel(999999999L);
//
//        clienteService.salvar(cliente);
//    }
//
//    @Test
//    public void pesquisarCliente() {
//        Cliente clienteConsultado = clienteService.buscarPorCpf(cliente.getCpf());
//        Assert.assertNotNull(clienteConsultado);
//    }
//}
