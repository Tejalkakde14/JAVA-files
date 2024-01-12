//Java Program to Find GCD
class Program14{

int calculateGcd(){


int n1 =60;
int n2= 30;
while(n2!=0){

int rem =n1% n2;
n1=n2;
n2 =rem;




}
System.out.println(n1);
return n1;

}
void calculateLcm(){
 
int n1 =60;
int n2= 30;
int lcm = Math.abs( n1 * n2)/calculateGcd();
System.out.println(lcm +"  lcm of numbers");
}

public static void main(String[] args){
Program14 obj = new Program14();
obj.calculateGcd();
obj.calculateLcm();

}
}