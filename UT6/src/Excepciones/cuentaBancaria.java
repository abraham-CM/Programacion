package Excepciones;
/**
 * <h1> La clase cuentaBancaria, 
 * se utiliza para retirar y 
 * depositar dinero en el banco </h1>
 * @see MainBanco
 * @author Abraham
 * @version 20-2025
 * @param saldo, dinero en la cuenta del banco
 */
public class cuentaBancaria {
private int saldo;
/**
 * Constructor con un parametro.
 * Crea el objeto saldo
 * @param saldo dinero de la cuenta
 * 
 */

public cuentaBancaria(int saldo) {
	this.saldo = saldo;
}
/**
 * 
 * @return saldo
 */
public int getSaldo() {
	return saldo;
}

public void setSaldo(int saldo) {
	this.saldo = saldo;
}
/**
 * 
 * @param ingresos
 * @return saldo
 */

public void ingresar(double ingresos) {
	saldo+= ingresos;
}
/**
 * @return saldo
 * @param retirada
 */
public void retirar(double retirada) {
	saldo-= retirada;
}
}
