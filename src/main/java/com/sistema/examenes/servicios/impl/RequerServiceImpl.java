
package com.sistema.examenes.servicios.impl;


import java.util.LinkedHashSet;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sistema.examenes.modelo.Request;
import com.sistema.examenes.repositorios.RequestRepository;
import com.sistema.examenes.servicios.RequestService;


@Service
public class RequerServiceImpl implements RequestService{
	
	/* Inyección de la dependencia. */
	@Autowired
	private RequestRepository requestRepository;

	
	/* Guardar. */
	@Override
	public Request agregarRequest(Request request) {	
		return requestRepository.save(request);
	}
	

	/* Editar pasando el objeto. */
	@Override
	public Request actualizarRequest(Request request) {
		return requestRepository.save(request);
	}
	
	
	/* Editar pasando el Id. */
	@Override
	public Request actualizarRequestId(Long requestId) {
		Request request = requestRepository.findById(requestId).get();
		return requestRepository.save(request);	
	}

	
	/* Consultar el listado completo. */
	@Override
	public Set<Request> obtenerRequests() {
		return new LinkedHashSet<>(requestRepository.findAll());
	}

	
	/* Consultar un usuario por Id. */
	@Override
	public Request obtenerRequest(Long requestId) {
		return requestRepository.findById(requestId).get();
	}

	
	/* Eliminar un usuario por Id. */
	@Override
	public void eliminarRequest(Long requestId) {
		Request request = new Request();
		request.setRequestId(requestId);
		requestRepository.delete(request);	
	}

}
