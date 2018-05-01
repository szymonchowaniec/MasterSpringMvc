package pl.szymonchowanic.MasterSpringMvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import pl.szymonchowanic.MasterSpringMvc.config.PictureUploadProperties;

@SpringBootApplication
@EnableConfigurationProperties({PictureUploadProperties.class})
public class MasterSpringMvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(MasterSpringMvcApplication.class, args);
	}
}
