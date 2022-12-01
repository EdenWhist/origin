package robot;

public class Test {

	public static void main(String[] args) {
	/*	Robot D2R2=new Robot("D2R2");
		Robot Data=new Robot("Data");*/
		Arena r=new Arena();
		//r.fight(Data, D2R2);
		Fighter f1=new Fighter("Ryu");
		Fighter f2=new Fighter("Ken");
		r.fight(f1, f2);

	}

}
