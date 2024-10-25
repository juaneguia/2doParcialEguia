package pkg2doparcial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int precioKmNacional = 25;
        int precioKmInternacional = 50;
        int gestionPasaporte = 500;

        List<Destino> destinos = new ArrayList<>();
        Destino d1 = new DestinoNacional(precioKmNacional, "Buenos Aires", 400, 01);
        Destino d2 = new DestinoNacional(precioKmNacional, "Córdoba", 700, 02);
        Destino d3 = new DestinoInternacional(precioKmInternacional, gestionPasaporte, false, "Miami", 7000, 04);
        Destino d4 = new DestinoInternacional(precioKmInternacional, gestionPasaporte, true, "Madrid", 11000, 05);
        Destino d5 = new DestinoInternacional(precioKmInternacional, gestionPasaporte, true, "Sídney", 15000, 06);
        
        destinos.add(d1);
        destinos.add(d2);
        destinos.add(d3);
        destinos.add(d4);
        destinos.add(d5);
        
        List<Vendedor> vendedores = new ArrayList<>();
        Vendedor v1 = new Vendedor(01,"Ana", 5000, 5);
        Vendedor v2 = new Vendedor(02,"Luis", 4500, 3);
        Vendedor v3 = new Vendedor(03,"María", 5500, 7);
        
        vendedores.add(v1);
        vendedores.add(v2);
        vendedores.add(v3);
        
        List<Ventas> listaVentas = new ArrayList<>();
        Ventas ve1 =new Ventas("Eugenio", d4, v3);
        Ventas ve2 =new Ventas("Valentino", d4, v2);
        Ventas ve3 =new Ventas("Lorena", d2, v1);
        Ventas ve4 =new Ventas("Sofia", d5, v1);
        Ventas ve5 =new Ventas("Jimena", d1, v2);
        Ventas ve6 =new Ventas("Nidia", d4, v3);
        Ventas ve7 =new Ventas("Nicolas", d3, v1);
        
        listaVentas.add(ve1);
        listaVentas.add(ve2);
        listaVentas.add(ve3);
        listaVentas.add(ve4);
        listaVentas.add(ve5);
        listaVentas.add(ve6);
        listaVentas.add(ve7);
        
        Scanner leer = new Scanner(System.in); 
        System.out.println("Dime el nombre del vendedor");
        String nombreVendedor = leer.next(); 
        
        boolean encontrado = false;
        
        for (int i=0; i<vendedores.size();i++) {
        	if (vendedores.get(i).getNombre().equals(nombreVendedor)) {	
        		System.out.println(vendedores.get(i).toString());
        		encontrado = true;
        	}
        }        		
        
        if (!encontrado) {
        	System.out.println("No se encontro vendedor"); //Esto es para mostrar en el caso que no encuentre vendedor en el for
        }
        
        System.out.println("TOTAL DE VENTAS");
        System.out.println(listaVentas.size());
        
        
        HashMap<String, Integer> mayorDestino = new HashMap<String, Integer>();
        mayorDestino.put("Buenos Aires", 0);
        mayorDestino.put("Córdoba", 0);
        mayorDestino.put("Miami", 0);
        mayorDestino.put("Madrid", 0);
        mayorDestino.put("Sídney", 0);
        
        
        for(int j = 0; j<listaVentas.size(); j++) {
        	String ciudad = listaVentas.get(j).getDestinoSeleccionado().getNombre();
        	mayorDestino.put(ciudad, mayorDestino.get(ciudad)+1);
        }
        
        //mayorDestino.forEach((key, value) -> System.out.println("[Key] : " + key + " [Value] : " + value));
        int mayor = 0;
        for(int j = 0; j<listaVentas.size(); j++) {
        	String ciudad = listaVentas.get(j).getDestinoSeleccionado().getNombre();
        	if(mayorDestino.get(ciudad) > mayor) {
        		mayor = mayorDestino.get(ciudad);
        	}
        }
        
    }
    /*
    A TENER EN CUENTA
    - REVISAR EL CODIGO SI NO HAY NINGUNA SITUACION DONDE NO CUMPLA CON LOS 4 PILARES
      DE LA P.O.O. (METODOS ABSTRACTOS, POLIMORFISMO, ENCAPSULAMIENTO, HERENCIA).
    - SI EXISTE ALGUN METODO QUE PUEDA SER OPTIMIZADO O CAMBIADO, HAGANLO.
    - SE PUEDE UTILIZAR UNA CLASE ABSTRACTA EN ESTE CODIGO? EXPLICA PORQUE
    
    	Si,
    
    - SE UTILIZA EL POLIMORFIMO? JUSTIFICALO.
    
    	Si, 
    
    - PARA COMPLETAR EL CODIGO DEBEMOS
        A) REALIZAR AL MENOS 7 VENTAS. (SE RECOMIENDA EL USO DE ACOPLAMIENTO)
        B) UNA VEZ REALIZADA LAS VENTAS, SE DEBE GENERAR UN ALGORITMO DE BUSQUEDA PARA VENDEDORES.
        C) SE DEBE MOSTRAR POR PANTALLA EL TOTAL DE VENTAS Y CUAL ES EL DESTINO MAS VENDIDO.

    
    +
    
    */
    
    

}
