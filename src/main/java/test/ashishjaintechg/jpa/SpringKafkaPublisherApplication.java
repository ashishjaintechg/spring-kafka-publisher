package test.ashishjaintechg.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import test.ashishjaintechg.jpa.dto.User;

@SpringBootApplication
@RestController
public class SpringKafkaPublisherApplication {

//	@Autowired
//	KafkaTemplate<String, User> userTemplate;
	
	@Autowired
	KafkaTemplate<String, String> template;
	
	@GetMapping("/publish/{name}")
	public String publishMessage(@PathVariable String name) {
		template.send("test","hi" +name);
		return "Data published";
	}
	
//	@GetMapping("/publishJson")
//	public String publishJsonMessage() {
//		User user = new User("Hi","ashish") ;
//		userTemplate.send("test",user);
//		return "Data published";
//	}
	public static void main(String[] args) {
		SpringApplication.run(SpringKafkaPublisherApplication.class, args);
	}

}
