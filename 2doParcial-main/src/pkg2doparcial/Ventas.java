package pkg2doparcial;

public class Ventas {
	
	private String nombreCliente;
	private Destino destinoSeleccionado;
	private Vendedor vendedorSeleccionado;
	public Ventas(String nombreCliente, Destino destinoSeleccionado, Vendedor vendedorSeleccionado) {
		super();
		this.nombreCliente = nombreCliente;
		this.destinoSeleccionado = destinoSeleccionado;
		this.vendedorSeleccionado = vendedorSeleccionado;
	}
	public String getNombreCliente() {
		return nombreCliente;
	}
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	public Destino getDestinoSeleccionado() {
		return destinoSeleccionado;
	}
	public void setDestinoSeleccionado(Destino destinoSeleccionado) {
		this.destinoSeleccionado = destinoSeleccionado;
	}
	public Vendedor getVendedorSeleccionado() {
		return vendedorSeleccionado;
	}
	public void setVendedorSeleccionado(Vendedor vendedorSeleccionado) {
		this.vendedorSeleccionado = vendedorSeleccionado;
	}
	
	

}
