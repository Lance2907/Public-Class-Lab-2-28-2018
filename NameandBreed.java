import java.util.Scanner;
public class NameandBreed {
public static void main (String[]args){
Dogs [] NameandBreed= new Dogs[3];
		// Creates an array of size 3
Scanner scan=new Scanner (System.in);
System.out.println("Enter three dog names and breeds");
for (int i=0;i<3;i++){
	String name=scan.nextLine();
	String breed =scan.nextLine();
	NameandBreed[i]=new Dogs(name,breed);

		}System.out.println(NameandBreed [1].name);
}
}