
package Controller;

import java.util.ArrayList;
import Model.EstudanteModel;

	public class EstudanteController {
	
		private static String nome;
		private static int idade;
		private static String curso;
		private static String morada;
     
			//static Scanner sc = new Scanner(System.in);
		//serve para indicar que os atributos pertencem a classe e nao aos objetos da classe, atributo-quando deve ser para todas as instancias da classe
     		static ArrayList <EstudanteModel> estudante = new ArrayList();
	
     public static void cadastrar() {
    	 
        System.out.println("====== CADASTRAR ESTUDANTE =====");
        
        System.out.println("Digite o Nome: ");
        nome = Ler.umaString();
   
        System.out.println("Digite a sua Idade: ");
        idade = Ler.umInt();
        //sc.nextLine();
   
        System.out.println("Digite o seu Curso: ");
        curso = Ler.umaString();
   
        System.out.println("Digite a sua Morada: ");
   		morada = Ler.umaString();
   
   		EstudanteModel u = new EstudanteModel();
   		u.setNome(nome);
   		u.setIdade(idade);
   		u.setCurso(curso);
   		u.setMorada(morada);
   
   		estudante.add(u);
     }
     
	public static void listar() {
		
        System.out.println("======= ESTUDANTES LISTADOS =======");
        
        for(int i = 0; i < estudante.size();i++){
        	
        EstudanteModel ut = estudante.get(i);
        
        System.out.println("Estudante: "+ i);
        System.out.println("Nome: "+estudante.get(i).getNome());
        System.out.println("\tIdade: "+estudante.get(i).getIdade());
        System.out.println("\tCurso: "+estudante.get(i).getCurso());
        System.out.println("\tMorada: "+estudante.get(i).getMorada());
        }
    }
	
        public static void pesquisar() {
        	
            boolean eq = false;
            
        System.out.println("====== PESQUISAR ESTUDANTE POR NOME =====");
        String nomes = Ler.umaString();
            
            for(int i = 0; i <estudante.size(); i++){
            	
                EstudanteModel ut = estudante.get(i);
                
            if(nomes.equals(ut.getNome())){
            	
        System.out.println("Estudante encontrado.");
        System.out.println("\tNome: "+ ut.getNome());
        System.out.println("\tIdade: "+ut.getIdade());
        System.out.println("\tCurso: "+ut.getCurso());
        System.out.println("\tMorada: "+ut.getMorada());
        
                eq = true;
                
                }
                	  
                
          
            }
        }
        public static void atualizar() {
        	
        System.out.println("======== ATUALIZAR ESTUDANTE ======");
        	
        	for(int i = 0; i < estudante.size(); i++) {
        
        		EstudanteModel ut = estudante.get(i);
        		
        System.out.println("[" + i + "]" + ut.getNome());
        	}
        	try {
        	   System.out.println("Digite a Posição: ");
               int in = Ler.umInt();
              // sc.nextLine();
               
               System.out.println("Digite o novo Nome: ");
               String novoNome = Ler.umaString();
               
               System.out.println("Digite a nova Idade: ");
               int novaIdade = Ler.umInt();
               //sc.nextLine();
               
               System.out.println("Digite o novo Curso: ");
               String novoCurso = Ler.umaString();
               
               System.out.println("Digite a nova Morada: ");
               String novaMorada = Ler.umaString();
               
               EstudanteModel u = estudante.get(in);
               u.setNome(novoNome);
               u.setIdade(novaIdade);
               u.setCurso(novoCurso);
               u.setMorada(novaMorada);
               
        	}catch(Exception e) {
        		System.err.println("Estudante não actualizado!");
        	}
        }
        
        public static void remover() {
        	
        System.out.println("====== REMOVER ESTUDANTE =====");
        	 
             for(int i = 0; i < estudante.size();i++){
            	 
                 EstudanteModel ut = estudante.get(i);
                 
        System.out.println("[" + i + "]"+ut.getNome());
        
        }
             try {
            	 
            
        System.out.println("Digite a posição do Estudante: ");
        int posicao = Ler.umInt();

        estudante.remove(posicao);
        
        System.out.println("Estudante Removido.");
         }catch(Exception e) {
        	 System.err.println("Estudante não encontrado!");
         }
        }
    
        public static void sair() {
        	
        	 System.exit(0);
        	 
        }
}
    