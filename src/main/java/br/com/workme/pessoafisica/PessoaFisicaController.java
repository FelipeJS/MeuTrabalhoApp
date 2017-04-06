package br.com.workme.pessoafisica;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/pessoaFisica")
public class PessoaFisicaController {

	@Autowired
	private PessoaFisicaRepository pessoaFisicaRepository;

	@RequestMapping(value = "/salvar", method = POST)
	public PessoaFisica salvar(@RequestBody PessoaFisica pessoaFisica) {
		return pessoaFisicaRepository.save(pessoaFisica);
	}

	@RequestMapping(value = "/consultar", method = GET)
	public PessoaFisica consultar(@RequestParam Long cdUsuario) {
		return pessoaFisicaRepository.findByCdUsuario(cdUsuario);
	}

	@RequestMapping("/listar")
	public Iterable<PessoaFisica> listar() {
		return pessoaFisicaRepository.findAll();
	}
}
