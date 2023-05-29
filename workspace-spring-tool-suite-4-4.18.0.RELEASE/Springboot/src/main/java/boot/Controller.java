package boot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
 
	@Autowired
	private Bservice topics;
	
	@RequestMapping("/hi")
	public List<Topic> Say()
	{
		return topics.returnAll();
	}
	
	
	@PostMapping("/hi")
	public void addList(@RequestBody Topic topic)
	{
		topics.addTopic(topic);
	}
	
	@DeleteMapping("/hi/{name}")
	public void deleteList(@PathVariable String name)
	{
		topics.del(name);
	}
	
	@PutMapping("/hi/{name}")
	public void update(@PathVariable String name ,@RequestBody Topic topic)
	{
	topics.upd(name, topic);
	}
}
