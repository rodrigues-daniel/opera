package opera;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String primeiroNome;
    private String sobreNome;

    protected Funcionario(){}

    public Funcionario(String primeiroNome, String sobreNome){
        this.primeiroNome = primeiroNome;
        this.sobreNome = sobreNome;

    }

    @Override
    public String toString() {
        return  String.format(
                "Funcionario[id=%d, primeiroNome='%s', sobreNome='%s']",
                id, primeiroNome, sobreNome);

    }
}
