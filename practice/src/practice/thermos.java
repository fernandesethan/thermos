package practice;

public class thermos {
	private double availablevolume;
	private String brand;
	private String liquid;
	
	public thermos(String brand,String liquid) {
		this.availablevolume=1.0;
		this.brand=brand;
		this.liquid=liquid;
	}
	
	public void addliquid(double volume) {
		if(this.availablevolume>=volume) {
			this.availablevolume  =volume;
			System.out.println("added"+volume+"liters of"+this.liquid +"into the thermos");
		}else {
			System.out.println("thermos does not have enough space for this volume of liquid");
		}
	}
	public void pouroutliquid(double volume) {
		if (this.availablevolume+volume<=1.0) {
			this.availablevolume+= volume;
			System.out.println("poured out"+ volume+"liters of"+this.liquid+"from the thermos");
		}else {
			System.out.println("thermos does not have enough liquid to pour out");
		}
	}
	public void displayDeatails() {
		System.out.println("thermos deatails");
		System.out.println("brand"+this.brand);
		System.out.println("liquid"+ this.liquid);
		System.out.println("available volume"+this.availablevolume+"liters");
	}
	public static void main(String[] args) {
	  thermos myTHermos=new thermos("godrej", "orange juice");
	  myTHermos.displayDeatails();
	  myTHermos.addliquid(0.5);
	  myTHermos.addliquid(0.7);
	  myTHermos.displayDeatails();
	  myTHermos.pouroutliquid(0.3);
	  myTHermos.displayDeatails();
	}
	

}
