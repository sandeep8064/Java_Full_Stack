package boot3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

@GetMapping("/")
public String show()
{
	return "<h1> Welcome to Page</h1>";
}
	

@GetMapping("/user")
public String showUser()
{
	return "<h1> Welcome to Page User</h1>";
}


@GetMapping("/admin")
public String showAdmin()
{
	return "<h1> Welcome to Page Admin</h1>";
}



}
