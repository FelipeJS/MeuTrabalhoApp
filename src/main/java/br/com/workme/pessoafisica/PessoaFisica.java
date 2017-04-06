package br.com.workme.pessoafisica;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PessoaFisica {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "cd_usuario")
	private Long cdUsuario;

	@Column(name = "nm_usuario")
	private String nmUsuario;

	@Column(name = "nr_cpf")
	private String nrCpf;

	@Column(name = "nr_telefone")
	private String nrTelefone;

	@Column(name = "ds_email", unique = true, nullable = false)
	private String dsEmail;

	@Column(name = "ds_senha")
	private String dsSenha;

	@Column(name = "sn_ativo")
	private String snAtivo;

	@Column(name = "ds_bairro")
	private String dsBairro;

	@Column(name = "ds_cidade")
	private String dsCidade;

	@Column(name = "ds_estado")
	private String dsEstado;

	public Long getCdUsuario() {
		return cdUsuario;
	}

	public void setCdUsuario(Long cdUsuario) {
		this.cdUsuario = cdUsuario;
	}

	public String getNmUsuario() {
		return nmUsuario;
	}

	public void setNmUsuario(String nmUsuario) {
		this.nmUsuario = nmUsuario;
	}

	public String getNrCpf() {
		return nrCpf;
	}

	public void setNrCpf(String nrCpf) {
		this.nrCpf = nrCpf;
	}

	public String getNrTelefone() {
		return nrTelefone;
	}

	public void setNrTelefone(String nrTelefone) {
		this.nrTelefone = nrTelefone;
	}

	public String getDsEmail() {
		return dsEmail;
	}

	public void setDsEmail(String dsEmail) {
		this.dsEmail = dsEmail;
	}

	public String getDsSenha() {
		return dsSenha;
	}

	public void setDsSenha(String dsSenha) {
		this.dsSenha = dsSenha;
	}

	public String getSnAtivo() {
		return snAtivo;
	}

	public void setSnAtivo(String snAtivo) {
		this.snAtivo = snAtivo;
	}

	public String getDsBairro() {
		return dsBairro;
	}

	public void setDsBairro(String dsBairro) {
		this.dsBairro = dsBairro;
	}

	public String getDsCidade() {
		return dsCidade;
	}

	public void setDsCidade(String dsCidade) {
		this.dsCidade = dsCidade;
	}

	public String getDsEstado() {
		return dsEstado;
	}

	public void setDsEstado(String dsEstado) {
		this.dsEstado = dsEstado;
	}

}
