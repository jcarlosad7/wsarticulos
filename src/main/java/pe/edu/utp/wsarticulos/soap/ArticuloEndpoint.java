package pe.edu.utp.wsarticulos.soap;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import pe.edu.utp.articulos.ArticuloDetalle;
import pe.edu.utp.articulos.GetArticuloDetalleRequest;
import pe.edu.utp.articulos.GetArticuloDetalleResponse;

@Endpoint
public class ArticuloEndpoint {
	@PayloadRoot(namespace = "http://utp.edu.pe/articulos", localPart = "GetArticuloDetalleRequest")
	@ResponsePayload
	public GetArticuloDetalleResponse getArticulo (@RequestPayload GetArticuloDetalleRequest request) {
		GetArticuloDetalleResponse response=new GetArticuloDetalleResponse();
		ArticuloDetalle articulo=new ArticuloDetalle();
		articulo.setId(1);
		articulo.setNombre("Computadora Core I5 5050");
		articulo.setDescripcion("Computadora de escritorio");
		articulo.setPrecio(1540.00);
		response.setArticuloDetalle(articulo);
		return response;
	}
}
