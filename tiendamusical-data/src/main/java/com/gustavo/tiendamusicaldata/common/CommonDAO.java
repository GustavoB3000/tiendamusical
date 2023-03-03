/**
 * 
 */
package com.gustavo.tiendamusicaldata.common;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Clase generica que representa los metodos del CRUD que se reutilizan en todas las entidades del proyecto.
 * @author Calistos
 * E - Significa la entidad a utilizar en el CRUD.
 * R - Significa el repositorio a utilizar de JPA para ejecutar el CRUD.
 */
public class CommonDAO <E, R extends PagingAndSortingRepository<E, Long>>{

	@Autowired
	protected R repository;
	
	/**
	 * Metodo que permite consultar una lsita de datos paginable de una entidad.
	 * @param desde {@link Integer} Indica apartir de que valor se obtendran los resultados.
	 * @param hasta {@link Integer} Indica el limite de resultados a obtener.
	 * @param orderBy {@link String} Indica mediante que campo se ordenan los registros.
	 * @return {@link List} Lista con los datos consultados paginados.
	 */
	public List<E> consultarListaPaginable(int desde, int hasta, String orderBy) {
		Pageable pageable = PageRequest.of(desde, hasta, Sort.by(orderBy));
		Page<E> page = this.repository.findAll(pageable);
		
		return page.getContent();
	}
	
	/**
	 * Metodo que permite persistir la informacion de cualquier entidad.
	 * @param e {@link Object} Objeto o entidad a persistir.
	 * @return {@link Object} Objeto recuperado despues de persistir el registro.
	 */
	public E guardar(E e) {
		return this.repository.save(e);
	}
	
	/**
	 * Metodo que permite actualizar la informacion de cualquier entidad.
	 * @param e {@link Object} Objeto o entidad a actualizar.
	 * @return {@link Object} Objeto recuperado despues de actualizar el registro.
	 */
	public E actualizar(E e) {
		return this.repository.save(e);
	}
	
	/**
	 * Metodo que permite eliminar la informacion de cualquier entidad.
	 * @param e {@link Object} Objeto o entidad a eliminar.
	 */
	public void eliminar(E e) {
		this.repository.delete(e);
	}
}
