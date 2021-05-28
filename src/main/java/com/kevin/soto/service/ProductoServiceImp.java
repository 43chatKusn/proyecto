package com.kevin.soto.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.List;

 

import org.springframework.stereotype.Service;

import com.kevin.soto.model.Producto;

 
@Service
public class ProductoServiceImp implements IntProductoService {
	
	private List<Producto> lista;
	
	public ProductoServiceImp () {
		lista = new LinkedList<Producto>(); 
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		//objetos de tipo producto
		Producto p1 = new Producto();
		p1.setId(1);
		p1.setNombre("Martillo");
		p1.setDescripcion("Descripción del producto");
		p1.setExistencias(5);
		p1.setPrecio(650.0);
		//p1.setFechaProduccion(LocalDate.now());
		p1.setFechaProduccion(LocalDate.parse("12-06-2020", formato));
		p1.setImagen("imagenes1.jpg");
		//********************************************
		Producto p2 = new Producto();
		p2.setId(2);
		p2.setNombre("Desarmador");
		p2.setDescripcion("Descripción del producto");
		p2.setExistencias(10);
		p2.setPrecio(150.0);
		//p2.setFechaProduccion(LocalDate.now());
		p2.setFechaProduccion(LocalDate.parse("25-08-2020", formato));
		p2.setImagen("imagenes2.jpg");
		//********************************************
		Producto p3 = new Producto();
		p3.setId(3);
		p3.setNombre("Carretilla");
		p3.setDescripcion("Descripción del producto");
		p3.setExistencias(3);
		p3.setPrecio(1150.0);
		//p2.setFechaProduccion(LocalDate.now());
		p3.setFechaProduccion(LocalDate.parse("12-12-2021", formato));
		p3.setImagen("imagenes3.jpg");
		//************************************************
		Producto p4 = new Producto();
		p4.setId(4);
		p4.setNombre("Carretilla");
		p4.setDescripcion("Descripción del producto");
		p4.setExistencias(3);
		p4.setPrecio(1950.0);
		//p2.setFechaProduccion(LocalDate.now());
		p4.setFechaProduccion(LocalDate.parse("26-09-2021", formato));
		p4.setImagen("imagenes3.jpg");
		//**********************************************
		Producto p5 = new Producto();
		p5.setId(5);
		p5.setNombre("Carretilla");
		p5.setDescripcion("Descripción del producto");
		p5.setExistencias(3);
		p5.setPrecio(1850.0);
		//p2.setFechaProduccion(LocalDate.now());
		p5.setFechaProduccion(LocalDate.parse("24-08-2021", formato));
		p5.setImagen("imagenes3.jpg");
		
		lista.add(p1);
		lista.add(p2);
		lista.add(p3);
		lista.add(p4);
		lista.add(p5);
    }
    @Override
    public List<Producto> obtenerTodos() {
        // TODO Auto-generated method stub
        return lista;
    }

 

    @Override
    public void guardar(Producto producto) {
        // TODO Auto-generated method stub
        
    }

 

    @Override
    public void eliminar(Integer idProducto) {
        // TODO Auto-generated method stub
        
    }

 

    @Override
    public Producto buscarPorId(Integer idProducto) {
        // TODO Auto-generated method stub
        return null;
    }
    
}