/**
 * 
 */
package br.com.guilhermeoli.DAO;

import br.com.guilhermeoli.DAO.generic.IGenericDAO;
import br.com.guilhermeoli.domain.Venda;
import br.com.guilhermeoli.exceptions.TipoChaveNaoEncontradaException;


public interface IVendaDAO extends IGenericDAO<Venda, String> {

	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException;
}
