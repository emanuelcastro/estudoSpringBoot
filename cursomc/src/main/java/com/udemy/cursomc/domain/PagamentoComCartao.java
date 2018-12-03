package com.udemy.cursomc.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.udemy.cursomc.domain.enums.EstadoPagamento;
import com.udemy.cursomc.domain.enums.TipoCliente;


@Entity
public class PagamentoComCartao extends Pagamento{
	
	/**
	 * Serial.
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer numeroParcelas;
	
	public PagamentoComCartao() {
		
	}

	public PagamentoComCartao(Integer id, Integer estadoPagamento, Pedido pedido, Integer numeroParcelas) {
		super(id, estadoPagamento, pedido);
		this.numeroParcelas = numeroParcelas;
	}

	public Integer getNumeroParcelas() {
		return numeroParcelas;
	}

	public void setNumeroParcelas(Integer numeroParcelas) {
		this.numeroParcelas = numeroParcelas;
	}

}
