import java.util.Scanner;
import java.util.jar.Attributes.Name;
public class Moviestats {
public static void main (String []args){
Scanner scan=new Scanner(System.in);
Movies one=new Movies("Star Wars", "Action"," 5 out of 5");
Movies two=new Movies("Up","Comedy", "5 out of 5");
Movies three=new Movies("Scooby Doo", "Comedy", "5 out of 5");
Movies four = new Movies ("Frost"," Children","5 out of 5");
Movies five= new Movies ("Pirates of The Carribean","Action"," 5 out of 5 ");

Movies [] List={ one, two, three, four, five};

System.out.println(" Please enter a movie");
String User= scan.nextLine();
for( int i=0; i< List.length; i++){
	if (List [i].Movie.equals(User)){
		System.out.println(List[i].Movie);
		System.out.println(List[i].Genre);
		System.out.println(List[i].Rating);
	}else {
		System.out.println(" Not Found");
	}
}






}
}
