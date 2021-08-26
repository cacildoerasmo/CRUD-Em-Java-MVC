package View;

import Controller.EstudanteController;
import Controller.Ler;

public class EstudanteView {

	public static void main(String[]args) {
		
   
    EstudanteController teste = new  EstudanteController();
    
    boolean ad = true;
    
    while(ad){
     
          System.out.println("============ Bem Vindo ============");
          System.out.println("[1]-Cadastrar Estudante");
          System.out.println("[2]-Listar Estudantes");
          System.out.println("[3]-Pesquisar");
          System.out.println("[4]-Atualizar");
          System.out.println("[5]-Remover");
          System.out.println("[6]-Sair");
          System.out.println("Escolhe uma opção: ");
          int n = Ler.umInt();
          
          switch(n) {
          
          case 1:
        	  teste.cadastrar();
        	  break;
        	 
          case 2:
        	  teste.listar();
        	  break;
        
          case 3:
        	  teste.pesquisar();
        	  break;
        	
          case 4:
        	  teste.atualizar();
        	  break;
        	  
          case 5:
        	  teste.remover();
        	  break;
        	  
          case 6:
        	  teste.sair();
        	  break;
        	  
        	  default:
        		  System.err.println("Tente novamente!");
          }
		
	}
	
	}
}
