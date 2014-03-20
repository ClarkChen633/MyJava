import java.util.*;

public class ForInDemo {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> wordset = new HashSet<String>();

		for (String word : args) {
			System.out.println(word + " ");
			wordset.add(word);
		}
		System.out.println();

		for (String word : wordset)
			System.out.println(word + " ");

	}

}
