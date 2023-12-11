package br.com.api.aplicacao.DAO;

import br.com.api.aplicacao.model.DAO.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface IUsuario extends CrudRepository<Usuario, Integer> {
}
