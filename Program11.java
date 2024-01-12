//Java Program to Find Factorial
class Program11{
int num =7;
void findfactorial(){
int fact =1;
while(num>0){
 fact =num*(num-1);
num--;
findfactorial();

}

System.out.println("factorial of number is   "+ fact);
}






public static void main(String[] args){
 Program11 obj = new  Program11();
obj.findfactorial();

}

}