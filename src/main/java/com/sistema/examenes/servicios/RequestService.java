
package com.sistema.examenes.servicios;


import java.util.Set;
import com.sistema.examenes.modelo.Request;


public interface RequestService {
	
	
	public Request agregarRequest(Request request);
	
	public Request actualizarRequest(Request request);
	
	public Request actualizarRequestId(Long requestId);
	
	public Set<Request> obtenerRequests();
	
	public Request obtenerRequest(Long requestId);
	
	public void eliminarRequest(Long requestId);

}
