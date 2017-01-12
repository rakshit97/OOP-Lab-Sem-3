import java.util.*;

class count
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int count_vowels=0, count_words=0, count_lines=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u')
				count_vowels++;
			if(s.charAt(i)==' ')
				count_words++;
			if(s.charAt(i)=='.')
				count_lines++;
		}
		count_words++;
		System.out.println("No. of characters = "+s.length());
		System.out.println("No. of vowels = "+count_vowels);
		System.out.println("No. of words = "+count_words);
		System.out.println("No. of lines = "+count_lines);
	}
}