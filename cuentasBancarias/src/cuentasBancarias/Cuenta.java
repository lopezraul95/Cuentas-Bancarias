package cuentasBancarias;

public class Cuenta {

	private int saldo = 0;

	public Cuenta() {
	}

	public int getSaldo() {
		return saldo;
	}

	public void depositarDinero(int monto) {
		this.valorValido(monto);
		this.saldo += monto;
	}
	
	public void extraerDinero(int monto) {
		this.valorValido2(monto);
		this.saldo-=monto;
	}
	
	public void transferir(int monto, Cuenta cuentaDestino) {
		this.valorValido2(monto);
		this.extraerDinero(monto);
		cuentaDestino.depositarDinero(monto);
	}
	
	public void valorValido(int monto) {
		if (monto < 0) {
			throw new Error("Monto negativo");
		}
	}
	
	public void valorValido2(int monto) {
		this.valorValido(monto);
		if (monto > this.saldo) {
			throw new Error("Saldo Insuficiente");
		}
	}

}
