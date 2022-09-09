package PassengerApplication.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import PassengerApplication.Model.Passenger;

@RestController
public class PassengerController {
	
	ArrayList<Passenger> list=new ArrayList<Passenger>();
	public PassengerController() {
		list.add(new Passenger(1,"arjun",32,"male"));
		list.add(new Passenger(2,"harini",34,"female"));
		list.add(new Passenger(3,"manu",56,"female"));
		list.add(new Passenger(4,"tanu",38,"female"));
		list.add(new Passenger(5,"muskan",24,"female"));
		list.add(new Passenger(6,"latif",78,"male"));
		list.add(new Passenger(7,"cobra",96,"male"));
		list.add(new Passenger(8,"shiva",45,"male"));
		list.add(new Passenger(9,"siddu",67,"male"));
		list.add(new Passenger(10,"potel",92,"female"));
		
		for(Passenger p:list) 
			System.out.println(p.toString());
	}
		
	@RequestMapping("/")
	public String welcome() {
		return "Passenger Management";
	}
		
		
	@RequestMapping("/passengers")
	public List<Passenger> getPassenger(){
	return list;
	
	}

}

