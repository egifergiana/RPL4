public class NO3B{
public static void main(String[] args){
for (int a = 5; a >= 1; a--){
for (int b = 1; b <= 5-a; b++)
System.out.print(" ");


for (int c = a; c >= 1; c--)
System.out.print(c);


for (int c = 2; c <= a; c++)
System.out.print(c);


System.out.println();
}
}
}