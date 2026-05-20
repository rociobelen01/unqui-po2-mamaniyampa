package ar.edu.unq.po2.tp6.bancoyprestamos;

public class Cliente {
	
	String nombre;
	String apellido;
	String direccion;
	int edad;
	double sueldoNetoMensual;
	
	
	public Cliente(String nombre, String apellido, String direccion, int edad, double sueldoNetoMensual) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.edad = edad;
		this.sueldoNetoMensual = sueldoNetoMensual;
	}
	
	public double getSueldoNetoMensual() {
		return this.sueldoNetoMensual;
	}
	
	public void setSueldoNetoMensual(double sueldoNetoMensual) {
		this.sueldoNetoMensual = sueldoNetoMensual;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public double sueldoNetoAnual() {
		return getSueldoNetoMensual() * 12;
	}
	
}
