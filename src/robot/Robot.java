package robot;

public class Robot {
	protected String name;
	protected int live=10;

	public Robot(String n) {
		
		this.name=n;
		
	}
	public void show() {
		System.out.println("Robot "+name);
	}
	public int Live() {
		return live;
	}
	public String Name() {
		return name;
	}
	public void fire(Robot b) {
		if (b.live==0) {
			System.exit(-1);
		}
			b.live-=2;
			System.out.println("Robot "+b.name+" a été touché par le robot "+name);
	}
	
	public void isDead() {
		if(live>0) {
			System.out.println("Robot "+name+" still alive");
		}
		else {
			System.out.println("Robot "+name+" dead");
		}
	}
	public String toString(String s) {
		return s;
	}

}
