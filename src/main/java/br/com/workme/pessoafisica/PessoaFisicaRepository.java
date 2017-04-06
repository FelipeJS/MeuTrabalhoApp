package br.com.workme.pessoafisica;

import org.springframework.data.repository.CrudRepository;

public interface PessoaFisicaRepository extends CrudRepository<PessoaFisica, Long> {

	PessoaFisica findByCdUsuario(Long cdUsuario);
	PessoaFisica findByDsEmailAndDsSenha(String dsEmail, String dsSenha);

}
