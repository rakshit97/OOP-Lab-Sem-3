import java.util.*;

class repeat
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

		for(int i=0;i<s.length();i++)
		{
			char key = s.charAt(i);
			for(int j=i+1;j<s.length();j++)
			{
				if(key==s.charAt(j))
				{
					char[] str = s.toCharArray();
					for(int k=j;k<s.length()-1;k++)
					{
						str[k]=str[k+1];
					}
					s= new String(str);
					s = s.substring(0, s.length()-1);
					j--;
				}
			}
		}
		System.out.println("Final word is: "+s);
	}
}