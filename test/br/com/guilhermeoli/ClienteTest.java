package br.com.guilhermeoli;

import br.com.guilhermeoli.DAO.ClienteDAO;
import br.com.guilhermeoli.domain.Cliente;
import br.com.guilhermeoli.services.ClienteService;
import br.com.guilhermeoli.services.IClienteService;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author guiol
 */
public class ClienteTest {

    private IClienteService clienteService;

    public ClienteTest() {
        IClienteDAO dao = new ClienteDAOMock();
        clienteService = new ClienteService();
    }

    @Test
    public void pesquisarCliente() {
        Cliente cliente = new Cliente();
        cliente.setCpf(1231231231L);
        cliente.setNome("Steve Harris");
        cliente.setCidade("Londres");
        cliente.setEnd("Stratford");
        cliente.setNumero(10);
        cliente.setEstado("Londres");
        cliente.setTel(999999999L);

        clienteService.salvar(cliente);

        Cliente clienteConsultado = clienteService.buscarPorCpf(cliente.getCpf());
        Assert.assertNotNull(clienteConsultado);
    }
}
