package gitHubLab;
import java.util.ArrayList;
import java.util.HashSet;

public class UniqueWords
{
   /**
		counts the number of unique strings in a list
		@param list ArrayList of strings to be examined
		@return number of unique strings in the list
		It does this by placing all the values in a HashSet
		HashSet does not allow for duplicate values, so a value can only
		be added once to the HashSet. Thus the HashSet has only 1 of each string
		in the ArrayList, no duplicates. The size of this Hashset is returned.
   */
   public static int countUnique(ArrayList<String> list)
   {
	  int count = list.size();
	  
	  HashSet <String> uniqueSet = new HashSet<String>();
	  for (int i = 0; i < list.size(); i++) {
		  uniqueSet.add(list.get(i));
	  }
	  count = uniqueSet.size();
	  return count;
   }

   public static void main(String[] args)
   {
      ArrayList <String> words = new ArrayList<>();
      words.add("apple");
	  words.add("orange");
	  words.add("blackboard");
	  words.add("apple");
	  words.add("orange");
	  words.add("sun");
	  words.add("moon");
	  
	 
	  
   
	  int unique = countUnique(words);
      System.out.println(words + " has " + unique + " unique words");
   }
}
