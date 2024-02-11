package sring_configuration_using_java_code;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//Below line does the same thing as in annotation config file for scanning the whole package
@ComponentScan("sring_configuration_using_java_code")
public class ConfigFile {

}
