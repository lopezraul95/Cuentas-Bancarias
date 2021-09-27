package cuentasBancarias;

public class AppCuenta {

	public static void main(String[] args) {
	    
	    Cuenta cuentaOrigen = new Cuenta();
	    cuentaOrigen.depositarDinero(1000);
	    System.out.println(cuentaOrigen.getSaldo()); // 10000

	    Cuenta cuentaDestino = new Cuenta();
	    System.out.println(cuentaDestino.getSaldo()); // 0

	    cuentaOrigen.transferir(550, cuentaDestino);
	    System.out.println(cuentaOrigen.getSaldo()); // 9450
	    System.out.println(cuentaDestino.getSaldo()); // 550

	}

}
