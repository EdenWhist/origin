package robot;

public class Arena {
	public void fight(Robot a,Robot b){
		while(a.Live()>0 && b.Live()>0){
			if(a.Live() >0) {a.fire(b);a.isDead();}
			
			if(b.Live() >0) {b.fire(a);b.isDead();}
		}
		if(b.Live() >0) {
			System.out.println("Robot "+a.name+" is dead");
			System.out.println("Robot "+b.Name()+" win");
		}
		else{
			System.out.println("Robot "+b.name+" is dead");
			System.out.println("Robot "+a.Name()+ "  Won");
		}	}
	public void fight(Fighter a,Fighter b){
		while(a.Live()>0 && b.Live()>0){
			if(a.Live() >0) {a.fire(b);a.isDead();}
			
			if(b.Live() >0) {b.fire(a);b.isDead();}
		}
		if(b.Live() >0) {
			System.out.println("Fighter "+a.name+" is dead");
			System.out.println("Fighter "+b.Name()+" win");
		}
		else{
			System.out.println("Fighter "+b.name+" is dead");
			System.out.println("Fighter "+a.Name()+ "  Won");
		}
	}
	public String toString(String s) {
		return s;
	}
}
