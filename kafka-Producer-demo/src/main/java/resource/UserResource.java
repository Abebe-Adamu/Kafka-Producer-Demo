package resource;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.User;

@RestController
@RequestMapping("kafka")
public class UserResource {
	@Autowired
	private KafkaTemplate<String,User> KafkaTemplate;
	private static final String TOPIC="test";
@GetMapping("/publish/{menu}")
public String post(@PathVariable("menu") final String menu) {
	
	KafkaTemplate.send(TOPIC,new User(menu, "Fish",5.00));
	return"published successfuly";
}
}
