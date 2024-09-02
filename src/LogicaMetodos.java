import java.util.ArrayList;
import java.util.List;

public class LogicaMetodos implements Metodos {
	
	List<Celulares> listaCels = new ArrayList<Celulares>();

	@Override
	public void guardar(Celulares celular) {
		listaCels.add(celular);
		
	}

	@Override
	public List<Celulares> listar() {
		
		return listaCels;
	}

	@Override
	public Celulares buscar(int indice) {
		
		return listaCels.get(indice);
	}

	@Override
	public void editar(int indice, Celulares celular) {
		listaCels.set(indice, celular);
		
	}

	@Override
	public void eliminar(int indice) {
		listaCels.remove(indice);
		
	}
	
	//Declarar metodos y ponerles la logica 
	public void contarReg() {
		System.out.println("Registros en la lista" + listar().size());
	}
	
	public void mosIndiceMarca() {
		System.out.println("Registros en la lista por indice y marca");
		for(int i = 0; i < listaCels.size(); i ++) {
			System.out.printf("\n[%d]" + listaCels.get(i).getMarca(),i);
		}
	}

	@Override
	public Celulares buscarModelo(String modelo) {
		boolean cel = false;
		
		for(Celulares celular:listaCels) {
			if(celular.getModelo().equals(modelo)) {
				System.out.println(celular);
				cel = true;
				break;
			}
		}
		if(cel == false) {
		System.out.println("No se tiene ese registro");
		
		
	}
		return null;

	}

	@Override
	public void buscarMarca(String marca) {
		
		boolean bandera = false;
		for(Celulares celular:listaCels) {
			if(celular.getMarca().equals(marca)) {
				System.out.println(celular);
				bandera = true;
				break;
			}
			
			if(bandera == false) {
				System.out.println("No se tiene registro");
			}
		}
	}

	

	@Override
	public void eliminarModelo(String modelo) {
		
		
		for(Celulares celular:listaCels) {
			if(celular.getModelo().equals(modelo)) {
				listaCels.remove(celular);
				
				break;
			}
			
			
		}
	}

	@Override
	public Celulares dineroInvertido() {
		float total = 0;
		for(Celulares tot:listaCels ) {
			total += tot.getPrecio();
		}
		System.out.println("El dinero invertido es " +total);
		return null;
	}

	

	

}
