package testing;

import modelo.dao.Autor;
import modelo.dao.Libro;

public class Principal {

	public static void main(String[] args) {
		
		//Creamos un objeto de Autor y otro de Libro
		Autor tolkien = new Autor("Tokien","J.R.R. Tolkien fue un escritor, filólogo y profesor británico","Ficción/Fantasia");
		Libro laComunidadDelAnillo = new Libro(11991199L,"La comunidad del anillo",25.90,400,tolkien);
		
		//Llamamos al metodo ToString de Libro
		System.out.println(laComunidadDelAnillo.toString());
		
		//Modificamos la biografía del autor tokien
		laComunidadDelAnillo.getAutor().setBiografia("J.R.R. Tolkien fue un escritor, filólogo y profesor británico,"
				+ " famoso por crear el universo de fantasía de la Tierra Media en obras como \"El Hobbit\" y \"El Señor de los Anillos\"");
		
		//Invocar el método ToString de 2 formas, mediante el objeto de Autor y mediante el objeto de Libro con referencia al autor
		System.out.println(tolkien.toString());
		System.out.println(laComunidadDelAnillo.getAutor().toString());
		
		//Modificamos la propiedad genero 
		tolkien.setGenero("Fantasia y criaturas medievales");
		
		System.out.println("Género: " + tolkien.getGenero());
		

	}

}
