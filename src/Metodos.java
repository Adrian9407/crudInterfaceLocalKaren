import java.util.List;

public interface Metodos {
	
	public void guardar(Celulares celular);
	
	public List<Celulares> listar();
	
	public Celulares buscar(int indice);
	
	public Celulares buscarModelo(String modelo);
	
	public void buscarMarca(String marca);
	
	public Celulares dineroInvertido();
	
	public void editar(int indice, Celulares celular);
	
	public void eliminar(int indice);
	
	public void eliminarModelo(String modelo);

}
