/**
 * 
 */
package br.com.guilhermeoli.services;

import br.com.guilhermeoli.DAO.IProdutoDAO;
import br.com.guilhermeoli.domain.Produto;
import br.com.guilhermeoli.services.generic.GenericService;


public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

	public ProdutoService(IProdutoDAO dao) {
		super(dao);
	}

}
