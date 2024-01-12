class Program18{
public static void main(String args[]){
double a=10.0,  b=11.21,  c=22.0;
double s = (a+b+c)/2;
s = s*(s-a)*(s-b)*(s-c);
        System.out.println("Area of the triangle is " + Math.sqrt(s));


}
}