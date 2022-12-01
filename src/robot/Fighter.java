package robot;
import java.util.Random;

public class Fighter extends Robot{

	public Fighter(String s) {
		super(s);
	}
	public void show() {
		System.out.println("Fighter "+name);
	}
	public void fire(Fighter f) {
		Random r=new Random();
		if(r.nextBoolean()==true) {
			f.live-=2;
			System.out.println("Fighter "+f.name+" a été touché par le Fighter "+name);
		}
		else {
			System.out.println("Fighter "+name+" a raté le fighter "+f.name);
			
		}
	}
	public void isDead() {
		if(live>0) {
			System.out.println("Fighter "+name+" still alive: "+live);
		}
		else {
			System.out.println("Fighter "+name+" dead");
		}
	}
	public String toString(String s) {
		return s;
	}

}
