package assign3;

public class Batch {
private String id;
private String domain;
private String code;


public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getDomain() {
	return domain;
}
public void setDomain(String domain) {
	this.domain = domain;
}
public String getCode() {
	return code;
}
public void setCode(String code) {
	this.code = code;
}

public String toString() {
	
	return getId()+getDomain()+getCode();
}

}
