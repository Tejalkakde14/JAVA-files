//Java Program to Find All Roots of a Quadratic Equation
import java.lang.Math;
class Program8{

public void findroots(){

//b+/-(sq b*b-4 *a*c)/2*a   ax2+bx+c =0

double r1,r2;
int a= 1;
int c= 4;
int b=4;
r1= (b + Math.sqrt(b*b-4 *a*c))/(2*a);
r2= (b - Math.sqrt(b*b-4 *a*c))/(2*a);

System.out.println("Roots are"+ r1+"  "+r2);





}



public static void main(String[] args){
Program8 obj = new Program8();
obj.findroots();


}
}