import java.util.*;
class Solution{
	
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			String input=sc.next();
            
            boolean isBalanced = true;
            Stack<Character> parenStack = new Stack<>();
            HashMap<Character, Character> parenPairs = new HashMap<>();
            parenPairs.put(')', '(');
            parenPairs.put('}', '{');
            parenPairs.put(']', '[');
            
            for (char c : input.toCharArray()) {
                if (c == '(' || c == '{' || c == '[') {
                    parenStack.push(c); //add opening paren to start
                }
                else {
                    if (parenStack.isEmpty() || parenPairs.get(c) != parenStack.pop()) {
                        isBalanced = false;
                        break;
                    }
                }   
            }
            if (!parenStack.isEmpty()) {
                isBalanced = false;
            }
            System.out.println(isBalanced);
		}
		
	}
}



