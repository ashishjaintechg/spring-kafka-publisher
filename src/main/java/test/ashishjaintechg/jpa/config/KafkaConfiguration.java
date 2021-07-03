package test.ashishjaintechg.jpa.config;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.kafka.support.serializer.JsonSerializer;

import test.ashishjaintechg.jpa.dto.User;

@Configuration
public class KafkaConfiguration {

	@Bean
	public ProducerFactory<String, String> producerFactory() {
		Map <String,Object> configMap = new HashMap<>();
		configMap.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
		configMap.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
		configMap.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
		
		return new DefaultKafkaProducerFactory<String, String>(configMap);
	}
	
	@Bean
	public KafkaTemplate<String, String> kafkaTemplate() {
		return new KafkaTemplate<String, String>(producerFactory());
	}
	
	
//	@Bean
//	public ProducerFactory<String, User> producerUserFactory() {
//		Map <String,Object> configMap = new HashMap<>();
//		configMap.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
//		configMap.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
//		configMap.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class);
//		
//		return new DefaultKafkaProducerFactory<String, User>(configMap);
//	}
//	
//	@Bean
//	public KafkaTemplate<String, User> kafkaUserTemplate() {
//		return new KafkaTemplate<String, User>(producerUserFactory());
//	}
	
}
