package regex;

public class bounmatchclass {

	public static void main(String[] args) {
		
		String str = "abciiiiiabcffffabcmmmm";
		
		str = str.replaceAll("ffff", "eeee");
		
		System.out.println(str);
		
		String str1 = "Gowtham";
		
		str1 = str1.replaceAll(".","x");
		
		System.out.println(str1);
		
		System.out.println(str.replaceAll("^abc", "111"));
		
		System.out.println("");
		
		System.out.println(str.replaceAll("[abc]", "7"));
		
		System.out.println(str.replaceAll("mmmm$", "111"));
		
		/* ^, $ are boundary matchers */
		
		System.out.println(str.replaceAll("[c][iem]", "7"));
		
		System.out.println("");
		
		String name = "gowtham";
		System.out.println(name.replaceAll("[^Ggm]","*"));
		
		/* [] are character classes */
		
		String name1 = "GOWTHAM 12345678";
		
		System.out.println(name1.replaceAll("(?i)[a-g1-5]", "*"));
		
		System.out.println(name1.replaceAll("[\\d\\s]", "*"));
		
		System.out.println("");
		
		System.out.println(name1.replaceAll("\\D", "*"));
		
		System.out.println(name1.replaceAll("\\s", "X"));
		
		System.out.println(name1.replaceAll("\\S", "X"));
		
		System.out.println("");
		
		System.out.println(name1.replaceAll("\\w", "X"));
		
		System.out.println(name1.replaceAll("\\W", "X"));
		
		System.out.println(name1.replaceAll("\\b", "X"));
		
		
		

	}

}
