package boot;

import java.util.*;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class Bservice {

 private List<Topic> topics = new ArrayList<>(Arrays.asList(
		 
		 new Topic("A",12,"Mumbai"),
		 new Topic("B",13,"Bangalore"),
		 new Topic("C",14,"Hydrabad")
		  ));

 public List<Topic> returnAll()
 {
	 return topics;
 }
 
 public void addTopic(Topic topic) {
	
	 topics.add(topic);
}

public void del(String name) {
	
	topics.removeIf(t-> t.getName().equals(name));
	
}

public void upd(String name,Topic topic)
{
	for(int i=0;i<topics.size();i++)
	{
		Topic t = topics.get(i);
		if(t.getName().equals(name))
		{
			topics.set(i, topic);
			return;
		}
	}
}
}
