package br.com.lkf.exception;

public class LimiteCreditoExcedidoException extends Exception {
	private double quantiaExcedida;

	// Construtor
	public LimiteCreditoExcedidoException(double quantiaExcedida) {
		super("Limite de crédito excedido por: " + quantiaExcedida);
		this.quantiaExcedida = quantiaExcedida;
	}
	
	public double getQuantiaExcedida() {
		return this.quantiaExcedida;
	}
}
