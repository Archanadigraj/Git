package Abstraction;

import java.util.*;
 abstract class Shape{
	float area;
	Scanner sc=new Scanner(System.in);
	abstract void input();
	abstract void calArea();
	 void  disp() {
		 System.out.println("area is "+area);
	 }
}
 class Square extends Shape{
	 float l;
	 void input(){
		// Scanner sc=new Scanner(System.in);
		 System.out.println("enter the l");
		 l=sc.nextFloat();
		 
	 }
	 void  calArea()
	 {
		 area=l*l;
	 }
	 }
 class Rectangle extends Shape{
	 float l,b;
	 void input(){
		// Scanner sc=new Scanner(System.in);
		 System.out.println("enter the l");
		 l=sc.nextFloat();
		 System.out.println("enter the b");
		 b=sc.nextFloat();
		 
	 }
	 void  calArea()
	 {
		 area=l*b;
	 }
 }
 class Circle extends Shape{
	 float r;
	 void input(){
		 //Scanner sc=new Scanner(System.in);
		 System.out.println("enter the r");
		 r=sc.nextFloat();
		 
	 }
	 void  calArea()
	 {area=3.14f*r*r;
		 }
	 }
 class Geometry{
	 void allowshape(Shape ref) {
		 ref.input();
		 ref.calArea();
		 ref.disp();
	 }
 }
public class Shape1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square s=new Square();
		Rectangle r=new Rectangle();
		Circle c=new Circle();
		Geometry g=new Geometry();
		g.allowshape(s);
		g.allowshape(r);
		g.allowshape(c);

	}

}
//hi hello 
