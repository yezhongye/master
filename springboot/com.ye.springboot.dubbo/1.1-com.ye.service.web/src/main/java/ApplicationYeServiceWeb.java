import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by zjx on 2017/9/26 0026.
 */
@SpringBootApplication
@ComponentScan("com.ye.service.web")
public class ApplicationYeServiceWeb {

    public static void main(String[] args){

        SpringApplication.run(ApplicationYeServiceWeb.class,args);
    }
}
