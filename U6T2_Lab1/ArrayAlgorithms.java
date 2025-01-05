package U6T2_Lab1;
public class ArrayAlgorithms {
    
    private ArrayAlgorithms() {}

    /** Returns the average of all values in numList as a double.
   *
   *  PRECONDITION: numList.length > 0
   */

  public static double average(int[] numList) {
    double sum = 0; 
    int length = numList.length;
    for (int i = 0; i < numList.length; i++) {
        sum  += numList[i]; 
    }
    return sum/length;
  }
  
  /** Returns the value in numList that represents the minimum
   * value in numList.
   *
   *  PRECONDITION: numList.length > 0
   */
  public static int minimum(int[] numList) {
    int least = numList[0]; 
    for (int i = 1; i < numList.length; i++) {
      int currentNum = numList[i];
      if (currentNum < least) {
        least = currentNum;
      }
    }
    return least;
  }

   /** Returns the number of Strings in strList that contain the target.
   *
   *  PRECONDITION: strList.length > 0
   */
  public static int howManyContain(String[] strList, String target) {
    int count = 0; 
    for (int i = 0; i < strList.length; i++) {
      if (strList[i].indexOf(target) != -1) {
        count++;
      }
    }
    return count;
  }

  public static String[] stringToArray(String myStr) {
    String[] str = new String[myStr.length()];
    for (int i = 0; i < myStr.length(); i++) {
        str[i] = myStr.substring(i, i + 1);
    }
    return str;
}

public static void introduceAdults(Person[] people) {
  for (int i = 0; i < people.length; i++) {
      if (people[i].getAge() >= 18) {
          people[i].introduce();
      }
  }
}

public static void reversePrint(String[] wordList) {
  for (int i = wordList.length - 1; i >= 0; i--) {
      for (int x = wordList[i].length() - 1; x >= 0; x--) {
          System.out.print(wordList[i].charAt(x));
      }
      System.out.println("");
  }
}

  /** Returns a new array containing all elements from arr1 combined with 
   *  all elements from arr2; arr1's elements should be followed by
   *  arr2's elements
   *
   *  PRECONDITION: arr1.length > 0, arr2.length > 0
   */
  public static int[] combine(int[] arr1, int[] arr2) {
    int combinedLength = arr1.length + arr2.length;
    int[] output = new int [combinedLength]; 
    for (int i = 0; i < arr1.length; i++) {
      output[i] = arr1[i];
    }
    for (int i = arr1.length; i < combinedLength; i++) {
      output[i] = arr2[i - arr1.length];
    }
    return output;
  }

  /** Changes the first and last element of nums to be num
   *
   *  THIS METHOD MUTATES (MODIFIES) ORIGINAL ARRAY
   *  PRECONDITION: nums.length > 0
   */
  public static void bookEnd(int[] nums, int num) {
    nums[0] = num; 
    nums[nums.length - 1] = num;
}

/** Multiplies each number in numList by multiplier.
   *
   *  THIS METHOD MUTATES (MODIFIES) ORIGINAL ARRAY
   *  PRECONDITION: numList.length > 0
   */
  public static void multiplyBy(int[] numList, int multiplier) {
     for (int i = 0; i < numList.length; i++) {
        numList[i] = numList[i] * multiplier;
     }
  }

   /** Returns an array of ints where each element is the product
   *  of the corresponding element in numList and multiplier.
   *
   *  THIS METHOD DOES NOT MUTATE (MODIFY) ORIGINAL ARRAY
   *  PRECONDITION: numList.length > 0
   */
  public static int[] multiplyByNoModify(int[] numList, int multiplier) {
    int[] multipliedArray = new int[numList.length]; 
    for (int i = 0; i < numList.length; i++) {
      multipliedArray[i] = numList[i] * multiplier;
    }
    return multipliedArray;
  }

  /** Adds a "!" to the end of each String in wordList.  However, if a
   *  a string already ends in an exclamation point, do NOT add another.
   *
   *  THIS METHOD MUTATES (MODIFIES) ORIGINAL ARRAY
   *  PRECONDITION: wordList.length > 0
   */
  public static void addExclamation(String[] wordList) {
    for (int i = 0; i < wordList.length; i++) {
        String word = wordList[i]; 
        String lastCharacter = word.substring(word.length() - 1);
        if ((lastCharacter.equals("!")) == false) {
            wordList[i] = wordList[i] + "!"; 
        }
    }
  }

  /** Returns an array of booleans where each element reflects whether
   *  the corresponding element in tempList is at or below the freezing
   *  temperature of 32 (true) or not (false).
   *
   *  THIS METHOD DOES NOT MUTATE (MODIFY) ORIGINAL ARRAY
   *  PRECONDITION: tempList.length > 0
   */
  public static boolean[] isFreezing(int[] tempList) {
    boolean[] freezing = new boolean[tempList.length]; 
    for (int i = 0; i < freezing.length; i++) {
        if (tempList[i] <= 32) {
            freezing[i] = true; 
        } else {
            freezing[i] = false;
        }
    }
    return freezing;
  }

   /** Shifts all elements in numList to the LEFT one index
   *
   *  The first element in the array should wrap around
   *  to the back of the array.  For example, given the array
   *  {5, 1, 3, 4, 7, 6}, this method modifies the array
   *  to {1, 3, 4, 7, 6, 5} (all elements shifted left one
   *  with the last element wrapping around to the back)
   *
   *  THIS METHOD MUTATES (MODIFIES) ORIGINAL ARRAY
   *  PRECONDITION: numList.length > 0
   */
  public static void shiftLeft(int[] numList) {
    int firstNum = numList[0]; 
    for (int i = 1; i < numList.length; i++) {
        numList[i - 1] = numList[i]; 
    }
    numList[numList.length - 1] = firstNum;
 }

 /** Shifts all elements in numList to the RIGHT one index.
   *
   *  The last element in the array should wrap around
   *  to the front of the array.  For example, given the array
   *  {5, 1, 3, 4, 7, 6}, this method modifies the array
   *  to {6, 5, 1, 3, 4, 7} (all elements shifted right one
   *  with the last element wrapping around to the front)
   *
   *  THIS METHOD MUTATES (MODIFIES) ORIGINAL ARRAY
   *  PRECONDITION: numList.length > 0
   */
  public static void shiftRight(int[] numList) {
     int lastNum = numList[numList.length - 1]; 
     for (int i = numList.length - 1; i >= 1; i--) {
        numList[i] = numList[i - 1]; 
     }
     numList[0] = lastNum; 
  }

  /** Reverses all elements in an array.
   *
   *  For example, given the array {5, 1, 3, 4, 7, 6}, this method
   *  modifies the array to {6, 7, 4, 3, 1, 5}.
   *  Should work with all array lengths (both odd and even).
   *
   *  THIS METHOD MUTATES (MODIFIES) ORIGINAL ARRAY
   *  PRECONDITION: numList.length > 0
   */
  public static void reverse(int[] numList) {
    int[] copy = new int[numList.length]; 
    for (int i = 0; i < numList.length; i++) {
      copy[i] = numList[i];
    }
    for (int i = 0; i < numList.length; i++) {
      int index = numList.length - i - 1; 
      numList[index] = copy[i]; 
    }
  }

  public static void reverse2(int[] numList) {
    for (int i = 0; i < numList.length / 2 ; i++) {
      int temp = numList[i]; 
      int index = numList.length - i - 1;
      numList[i] = numList[index]; 
      numList[index] = temp; 
    }
  }
}
