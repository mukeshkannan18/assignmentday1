package week1.day1;

public class TwoWheeler {
	int noOfWheels=2;
	short noOfMirrors=2;
	long registerNumber=64476L;
	double runningKilometre=12345.67;
	boolean isPunctured= false;
	char firstLetter='p';
	String bikeName="pulsar";
	public static void main(String[] args) {
		TwoWheeler bike=new TwoWheeler();
		System.out.println(bike.noOfWheels);
		System.out.println(bike.noOfMirrors);
		System.out.println(bike.registerNumber);
		System.out.println(bike.runningKilometre);
		System.out.println(bike.isPunctured);
		System.out.println(bike.firstLetter);
		System.out.println("BikeName"+ bike.bikeName);
		
}}