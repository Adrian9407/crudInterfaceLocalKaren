 
import java.time.LocalDate;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		 long imei;
         String marca;
         String modelo;
         float precio;
         LocalDate fechaLanz;
         
         Celulares celular= null;
         
         Scanner lectura = null;
         
         int menuPric, subMenu, indice;
         
         //Instancia de clase
         
         LogicaMetodos imp = new LogicaMetodos();
         
         do {
        	 
        	 System.out.println("MENU PRINCIPAL");
        	 System.out.println("1---ALTA");
        	 System.out.println("2---MOSTRAR");
        	 System.out.println("3---BUSCAR");
        	 System.out.println("4---EDITAR");
        	 System.out.println("5---ELIMINAR");
        	 System.out.println("6---CONTAR");
        	 System.out.println("7---BUSCAR POR MODELO");
        	 System.out.println("8---BUSCAR POR MARCA");
        	 System.out.println("9---CUANTO DINERO HAY INVERTIDO");
        	 System.out.println("10---ELIMINAR POR MODELO");
        	 System.out.println("11---SALIR");
        	 
        	 
        	 
        	 lectura = new Scanner(System.in);
        	 menuPric = lectura.nextInt();
        	 
        	 switch (menuPric) {
			case 1:
				try {
					
					System.out.println("Ingrese el imei");
					lectura = new Scanner(System.in);
					imei = lectura.nextLong();
					
					System.out.println("Ingrese la marca");
					lectura = new Scanner(System.in);
					marca = lectura.nextLine();
					
					System.out.println("Ingrese el modelo");
					lectura = new Scanner(System.in);
					modelo = lectura.nextLine();
					
					System.out.println("Ingrese el precio");
					lectura = new Scanner(System.in);
					precio = lectura.nextFloat();
					
					
					
					System.out.println("Ingrese la fecha (2024-08-22)");
					lectura = new Scanner(System.in);
					String fecha = lectura.nextLine();
					
					//Casteo
					fechaLanz = LocalDate.parse(fecha);
					
					//Crear el objeto 
					
					celular = new Celulares(imei, marca, modelo, precio, fechaLanz);
					
					//guardar
					imp.guardar(celular);
					System.out.println("Se guardo con exito");
					
				} catch (Exception e) {
					
					System.out.println("Error al guardar " + e.getMessage());
				}
				break;

				
            case 2:
				System.out.println(imp.listar());
				break;
				
				
             case 3:
				imp.mosIndiceMarca();
				
				System.out.println("\nIngrese el indice a buscar");
				lectura = new Scanner(System.in);
				indice = lectura.nextInt();
				
				//Buscar
				celular = imp.buscar(indice);
				System.out.println("Se encontro " + celular);
				break;	
				
				
             case 4:
            	 imp.mosIndiceMarca();
 				
 				System.out.println("\nIngrese el indice a buscar");
 				lectura = new Scanner(System.in);
 				indice = lectura.nextInt();
 				
 				//Buscar
 				celular = imp.buscar(indice);
 				System.out.println("Se encontro " + celular);
 				
 				//SUB MENU
 				do {
 					
 					System.out.println("SUBMENU PARA EDITAR");
 					System.out.println("1----Marca");
 					System.out.println("2----Precio");
 					System.out.println("3----Regresar");
 					
 					lectura = new Scanner(System.in);
 					subMenu = lectura.nextInt();
 					
 					switch (subMenu) {
					case 1:
						System.out.println("\nIngrese la nueva marca");
						lectura = new Scanner(System.in);
						marca = lectura.nextLine();
						
						//Actualizacion
						celular.setMarca(marca);
						imp.editar(indice, celular);
						System.out.println("Se edito");
						break;
						
                    case 2:
                    	System.out.println("\nIngrese el nuevo precio");
						lectura = new Scanner(System.in);
						precio = lectura.nextFloat();
						
						//Actualizacion
						celular.setPrecio(precio);
						imp.editar(indice, celular);
						System.out.println("Se edito");
						break;	

                    case 3:
						
						break;	
					
					}
 					
 				}while(subMenu < 3);
 				
 				break;	
 				
 				
             case 5:
 				imp.mosIndiceMarca();
 				
 				System.out.println("\nIngrese el indice a eliminar");
 				lectura = new Scanner(System.in);
 				indice = lectura.nextInt();
 				
 				//Eliminar
 				imp.eliminar(indice);
 				System.out.println("Se elimino");
 				break;	
 				
 				
             case 6:
 				imp.contarReg();
 				break;	
 				
 				
             case 7:
 				System.out.println("Ingrese el modelo a buscar");
 				lectura = new Scanner(System.in);
 				modelo = lectura.nextLine();
 				
 				imp.buscarModelo(modelo);
 				
 				break;	
 				
             case 8:
  				System.out.println("Ingrese la marca a buscar");
  				lectura = new Scanner(System.in);
  				marca = lectura.nextLine();
  				
  				imp.buscarMarca(marca);
  				break;
  				
             case 9:
   				imp.dineroInvertido();
   				
   				break;		
   				
             case 10:
            	System.out.println("\nIngrese el modelo a eliminar");
  				lectura = new Scanner(System.in);
  				modelo = lectura.nextLine();
  				
  				//Eliminar
  				imp.eliminarModelo(modelo);
  				System.out.println("Se elimino");
    				
    				break;	
    				
             case 11:
 				
 				
 				break;		
        	 }
			
		} while (menuPric < 11);

	}

	}
