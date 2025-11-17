package DSA;

public class Anagrams 
{
	 
		boolean isAnagram(String s, String t) {
		    if (s.length() != t.length()) return false;

		    int[] freq = new int[26];
		    for (char c : s.toCharArray()) freq[c - 'a']++;
		    for (char c : t.toCharArray()) if (--freq[c - 'a'] < 0) return false;

		    return true;
	}

		
		public static void main(String[] args) 
		{
			Anagrams an=new Anagrams();
			
			System.out.println(an.isAnagram("aashish","akshay"));
			
			String a1="aashish";
			String a2="akshay";
			
			if(an.isAnagram(a1, a2))
			{
				System.out.println("Is Anagram");
			}
			else {
				System.out.println("Not Anagram");
			}
			
		}
}
