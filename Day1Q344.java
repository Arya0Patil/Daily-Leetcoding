// Write a function that reverses a string. The input string is given as an array of characters s.

// You must do this by modifying the input array in-place with O(1) extra memory.

 

// Example 1:

// Input: s = ["h","e","l","l","o"]
// Output: ["o","l","l","e","h"]

/**
 * Day1-Q344
 */


class Solution {
    public void reverseString(char[] s) {
        int i =0;
        int j =0;
        while(i<j){
            char temp = s[i];
            s[j]=s[i];
            s[i]= temp;
            i++;
            j--;
        }
    }}