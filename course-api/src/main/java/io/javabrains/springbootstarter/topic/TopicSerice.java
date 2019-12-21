package io.javabrains.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicSerice {
	
	private List<Topic> topics=	 Arrays.asList(
					new Topic("1","C#","C# Description"),
					new Topic("2","C++","C++ Description")
					);
	
	public List<Topic> getAllTopics(){
		return topics;
	}

}
