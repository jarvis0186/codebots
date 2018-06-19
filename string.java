import java.util.*;
public class string
{
	public static void main(String []args){
		Scanner s1=new Scanner(System.in);//read the user input
		String randomString=s1.nextLine();//store the input in a String
		String[] words=randomString.split("\\s");//split the words according to strings with white space as a delimitter
		int j=words.length;//takes the length of string array
		words[j-1]=words[j-1].substring(0,1).toUpperCase()+words[j-1].substring(1);//last word first letter capitalize
		words[0]=words[0].substring(0,1).toLowerCase()+words[0].substring(1);//first word first letter decap
		for(j=j-1; j>=0;j--){
			System.out.print(words[j]+" ");//prints the words in reverse order
		}
	System.out.println();
	}
}
