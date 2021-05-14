# RevisaoJAVA
Revisao
import java.util.Date;

public class Idade {

	
		 
	    int id;
	    String nome;
	    String altura;
	    Date nascimento;

	    public ClienteBean(String nome) {
	        this.nome = nome;
	        this.altura = altura;
	    }

	    public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public Date getNascimento() {
	        return nascimento;
	    }

	    public void setNascimento(Date nascimento) {
	        this.nascimento = nascimento;
	    }
	    
	    
	}
