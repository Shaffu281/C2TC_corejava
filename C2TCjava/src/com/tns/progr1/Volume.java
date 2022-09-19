package com.tns.progr1;

public class Volume {

	 int volu(int r)
	 {
		int vol=r*r*r;
		return vol;
	 }
	 int volu(int l, int b, int h) 
	 {
		 int vol=l*b*h;
		 return vol; 
	 }
	 double volu(double r)
	 {
		 double vol=(4/3)*3.14*r*r*r;
		 return vol;
		 
	 }
	public static void main(String[] args) {
 Volume obj=new Volume();
 System.out.println("The Volume of Cube is" +obj.volu(5));
 System.out.println("The Volume of Cuboid is" +obj.volu(5,6,1));
 System.out.println("The Volume of Sphere is" +obj.volu(5));

	}

}
