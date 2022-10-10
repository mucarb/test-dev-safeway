package entities;

public class Usuario {
	private String username;
	private String senha;
	private Cliente cliente;
	private Empresa empresa;

	public Usuario() {
		super();
	}

	public Usuario(String username, String senha, Cliente cliente, Empresa empresa) {
		super();
		this.username = username;
		this.senha = senha;
		this.cliente = cliente;
		this.empresa = empresa;
	}

	public boolean IsAdmin() {
		return this.empresa == null && this.cliente == null;
	}

	public boolean IsEmpresa() {
		return this.empresa != null;
	}

	public boolean IsCliente() {
		return this.cliente != null;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	
	@Override
	public String toString() {
		return "Usuário: " + username;
	}

}
