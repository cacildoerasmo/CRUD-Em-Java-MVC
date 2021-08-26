
package Model;

public class EstudanteModel {
    
    private String nome;
    private int idade;
    private String curso;
    private String morada;
    
    
    public EstudanteModel() {
    	
    }
    public EstudanteModel(String nome,int idade,String curso, String morada) {
		this.nome = nome;
		this.idade = idade;
		this.curso = curso;
		this.morada = morada;
	}
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    public void setMorada(String morada) {
    	this.morada = morada;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getCurso() { 
        return curso;
        
    }
    public String getMorada() {
    	return morada;
    }
    public String toString() {
    	return "Dados do estudante: "+"Nome: "+"\n"+nome+"Idade: "+"\n"+idade+"Curso: "+"\n"+curso+"Morada: "+"\n"+morada;
    }

}