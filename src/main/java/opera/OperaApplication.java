package opera;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class OperaApplication {

	private static  final Logger log = LoggerFactory.getLogger(OperaApplication.class);


	public static void main(String[] args) {



		SpringApplication.run(OperaApplication.class, args);

	}


	@Bean
	public CommandLineRunner demo(FuncionarioRepositorio repo){

		return (args) -> {

		    repo.save(new Funcionario("Daniel","Rodrigues"));
			log.info("## OK, Log Funcionando ##!");

		};

	}
}
