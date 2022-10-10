package entities;

import java.util.List;

public class Venda {
	private Integer código;
	private List<Produto> itens;
	private Double valor;
	private Double comissaoSistema;
	private Empresa empresa;
	private Cliente cliente;

	public Venda(Integer código, List<Produto> itens, Double valor, Double comissaoSistema, Empresa empresa,
			Cliente cliente) {
		super();
		this.código = código;
		this.itens = itens;
		this.valor = valor;
		this.comissaoSistema = comissaoSistema;
		this.empresa = empresa;
		this.cliente = cliente;
	}

	public Venda() {
		super();
	}

	public Integer getCódigo() {
		return código;
	}

	public void setCódigo(Integer código) {
		this.código = código;
	}

	public List<Produto> getItens() {
		return itens;
	}

	public void setItens(List<Produto> itens) {
		this.itens = itens;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Double getComissaoSistema() {
		return comissaoSistema;
	}

	public void setComissaoSistema(Double comissaoSistema) {
		this.comissaoSistema = comissaoSistema;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}
