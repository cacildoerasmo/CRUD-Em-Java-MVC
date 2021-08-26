package Controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ler {

	  public static String umaString (){
	        String s = "";
	        try{//bufferedreader-a classe buffere serve para leitura de uma inputstreamreader
	            BufferedReader in = new BufferedReader ( new InputStreamReader(System.in));//inputstreamreader-leitura de dados,system.in-para ler do console
	            s= in.readLine();
	        }
	        catch (IOException e){
	            System.out.println("Erro ao ler fluxo de entrada.");
	        }
	        return s;
	    }
	    public static int umInt(){
	        while(true){
	            try{
	                return Integer.valueOf(umaString().trim()).intValue();
	            }//eh um metodo usado para no retornar um inteiro,trim()-devolve a nova string sem espacos
	            catch(Exception e){
	                System.out.println("Não é um inteiro válido!");
	            }
	        }
	    }
}