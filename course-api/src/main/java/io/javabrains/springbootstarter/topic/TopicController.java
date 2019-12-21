package io.javabrains.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@Autowired
	private TopicSerice topicService;
	
	@RequestMapping("/topics")
	//@RequestMapping(value="/topics",method=RequestMethod.GET)   <---Default Request mapping
	public List<Topic> getAllTopics() {		
		return topicService.getAllTopics();	
	}
	
	@RequestMapping("/topics/{ID}")
	public Topic getTopic(@PathVariable("ID") String id) {
		return topicService.getTopic(id);
		
	}
	
	@RequestMapping(value="/topics",method=RequestMethod.POST)
	public void addTopic(@RequestBody Topic topic) {
		topicService.postTopic(topic);
		
	}
	

}
