//Java Program to Display Fibonacci Series
class Program13{


void displayfibonacci(){
int num1 = 0;
int num2 = 1;
System.out.println(num1);
System.out.println(num2);
int num =10;
for(int i=1;i<num;i++)
{
 int sum = num1 +num2;
System.out.print(sum);
num1 = num2;
num2 = sum;


}



}
public static void main(String[] args){

Program13 obj = new Program13();
obj.displayfibonacci();




}


}