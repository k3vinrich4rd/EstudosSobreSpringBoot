package vendas.vendas;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

////Classe criadas para efetuarConfigurações
//@Configuration
//@Profile("development") //  indicando que está configuração só está disponível para esse profile

@Development
public class MyConfiguration {

    //Para verificar que a aplicação está sendo rodada
    @Bean
    public CommandLineRunner executar(){ // Roda assim que a aplicação subir
        return args -> {
            System.out.println("RODANDO A CONFIGURAÇÃO DE DESENVOLVIMENTO");
        };
    }





/*   Usando um bean para retornar na tela
     Bean — objeto configurado
     @Bean(name = "applicationName")
     public String applicationName(){
        return "Sistema de Vendas";
*/    }



