//Java Program to Check Whether a character is Vowel or Consonant.
class Program6{

public void Vowelconsonant(){
char ch ='i';
if(ch=='a' || ch =='e' || ch =='i' || ch =='o'|| ch =='u')
{
System.out.println("character is vowel");
}
else
System.out.println("character is consonant");

}

public static void main(String[] args){

Program6 obj = new Program6();
obj.Vowelconsonant();
}
}