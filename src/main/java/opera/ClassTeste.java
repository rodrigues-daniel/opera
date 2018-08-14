package opera;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class ClassTeste {

    @Value("${nome}")
    private String nome;

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public String retorno(){

        return this.nome;
    }





}
