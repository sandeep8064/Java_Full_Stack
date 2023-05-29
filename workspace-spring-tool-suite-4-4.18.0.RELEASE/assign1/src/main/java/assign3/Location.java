package assign3;

import java.util.List;

public class Location {
	
	private String locationcode;
	private String  locationname;
	private List<Batch> list;
	
	
	public String getLocationcode() {
		return locationcode;
	}
	public void setLocationcode(String locationcode) {
		this.locationcode = locationcode;
	}
	public String getLocationname() {
		return locationname;
	}
	public void setLocationname(String locationname) {
		this.locationname = locationname;
	}
	public List<Batch> getList() {
		return list;
	}
	public void setList(List<Batch> list) {
		this.list = list;
	}
	
	
	public void displayinfo() {
		
		System.out.println("Location is "+getLocationname());
		System.out.println("Batches in that location are ");
		for(Batch l:list)
		{
		System.out.println(l);
		}
		
	}
	

}
