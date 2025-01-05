package U6T3;
public class ArrayAlgorithms {
  public static String longestString(String[] stringList) {
    String longestStr = stringList[0];
    for (String str: stringList) {
        if (str.length() >= longestStr.length()) {
            longestStr = str;
        }
    }
    return longestStr;
  }

  public static boolean containsPositive(int[] numList) {
    for (int i : numList) {
        if (i > 0) {
            return true;
        } 
    }
    return false;
  }

  public static String[] makeLowercase(String[] wordList) {
    String [] lowerCases = new String [wordList.length];
    for (int i = 0; i < wordList.length; i++) {
      lowerCases[i] = wordList[i].toLowerCase(); 
    }
    return lowerCases;
  }

  public static int endsInExclamations(String[] stringList) {
    int count = 0; 
    for (String str: stringList) {
      if ((str.substring(str.length() - 1)).equals("!")) {
        count++;
      }
    }
    return count;
  }

  public static void makeUppercase(String[] wordList) {
    for (int i = 0; i < wordList.length; i++) {
      wordList[i] = wordList[i].toUpperCase(); 
    }
  }

  public static int[] arrayMaximums(int[] intArr1, int[] intArr2) {
    int highArray [] = new int [intArr1.length]; 
    for (int i = 0; i < intArr1.length; i++) {
      if (intArr1[i] > intArr2[i]) {
        highArray[i] = intArr1[i];
      } else if (intArr2[i] > intArr1[i]) {
        highArray[i] = intArr2[i];
      } else {
        highArray[i] = intArr1[i];
      }
    }
    return highArray;
  }

  public static int countConsecutiveDoubles(int[] numList) {
    int count = 0;
    for (int i = 0; i < numList.length - 1; i++) {
      if (numList[i] == numList[i + 1]) {
        count++;
      }
    }
    return count;
  }
 
  public static int longestStreak(int[] nums) {
    int currentStreak = 1; 
    int longestStreak = 1; 
    for (int i = 1; i < nums.length; i++) {
      if (nums [i] == nums[i - 1]) {
        currentStreak++;
        if (currentStreak > longestStreak) {
          longestStreak = currentStreak;
        }
    } else {
      currentStreak = 1;
    }
  } 
  return longestStreak; 
}
}
