
package pkg2doparcial;

import java.util.Objects;

public class Vendedor {
    private int idVendedor;
    private String nombre;
    protected double sueldoBase;
    protected int antiguedad; // en años

    public Vendedor(int idVendedor, String nombre, double sueldoBase, int antiguedad) {
        this.idVendedor = idVendedor;
        this.nombre = nombre;
        this.sueldoBase = sueldoBase;
        this.antiguedad = antiguedad;
    }

    public int getIdVendedor() {
        return idVendedor;
    }

    public void setIdVendedor(int idVendedor) {
        this.idVendedor = idVendedor;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public double calcularSueldo() {
       return (sueldoBase * (1 + (antiguedad * 0.01))); // Sueldo base + 1% por año de antigüedad
    }

	@Override
	public String toString() {
		return "Vendedor: ID= " + idVendedor + ", Nombre= " + nombre + ", Sueldo Base= " + sueldoBase
				+ ", Antiguedad= " + antiguedad;
	}


	@Override
	public boolean equals(Object obj) {
		Vendedor other = (Vendedor) obj;
		return Objects.equals(nombre, other.nombre);
	}

	

}
    

