package Rest;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
@RestController
public class Main {
	
@RequestMapping(value = "/student", method = RequestMethod.GET, produces =MediaType.APPLICATION_JSON_VALUE)
 
public ArrayList<Std> getList()
{
	Std s1 = new Std();
	s1.setName("Itachi");
	Std s2 = new Std();
	s2.setName("Sasuke");
	Std s3 = new Std();
	s3.setName("Shisui");
	
	ArrayList<Std> list = new ArrayList<Std>();
	list.add(s3);
	list.add(s2);
	list.add(s1);
	
	return list;
}
	
	@RequestMapping(value = "/student/{name}",method = RequestMethod.PUT, consumes =MediaType.APPLICATION_XML_VALUE)
	public ResponseEntity<Boolean> updateStD(@PathVariable("name") String StdName,@RequestBody Std std)
	{
		System.out.println("Student Name:"+StdName);
		System.out.println("Student Name:"+std.getName()+"Age:"+std.getAge());
		
		return new ResponseEntity<Boolean>(true,HttpStatus.OK);
	}
	
	@RequestMapping(value = "/student",method = RequestMethod.POST, consumes =MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Boolean> PostStD(@RequestBody Std std)
	{
		System.out.println("Name:"+std.getName()+"Age:"+std.getAge());
		
		return new ResponseEntity<Boolean>(true,HttpStatus.CREATED);
		
	}
	
	@RequestMapping(value = "/student/{name}",method = RequestMethod.DELETE)
	public ResponseEntity<Boolean> deleteStD(@PathVariable("name") String StdName)
	{
		System.out.println("name:"+StdName);
		
		return new ResponseEntity<Boolean>(true,HttpStatus.OK);
	}
}
