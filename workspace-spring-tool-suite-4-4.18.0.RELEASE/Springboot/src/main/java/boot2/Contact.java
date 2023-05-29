package boot2;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Contact {
	
ConcurrentMap<String,Swagger> contacts = new ConcurrentHashMap<>();

@GetMapping("/{id}")
public  Swagger getCon(@PathVariable String id) {
	
	return contacts.get(id);
}

@GetMapping("/")
public List<Swagger> getAll()
{
	return new ArrayList<Swagger>(contacts.values());
}

@PostMapping("/")
public Swagger addCon(@RequestBody Swagger contact)
{
	contacts.put(contact.getId(),contact);
	return contact;
}



}
