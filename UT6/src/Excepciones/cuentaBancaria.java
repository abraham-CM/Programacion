package Excepciones;

public class cuentaBancaria {
private int saldo;


public cuentaBancaria(int saldo) {
	this.saldo = saldo;
}

public int getSaldo() {
	return saldo;
}

public void setSaldo(int saldo) {
	this.saldo = saldo;
}


public void ingresar(double ingresos) {
	saldo+= ingresos;
}
public void retirar(double retirada) {
	saldo-= retirada;
}
}
