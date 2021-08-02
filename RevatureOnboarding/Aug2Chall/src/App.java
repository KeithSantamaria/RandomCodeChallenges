import java.util.*;
public class App {

    /**
     * @author Keith Santamaria
     * @param a the first string for the function
     * @param b the second string for the function
     * @return returns the length of the longest substring given two strings.
     * returns the first longest substring if there are 2 or more substrings of equal length
     * returns -1 if there are no match or if any param is null
     */
    public static int getLongestCommonSubstringLength( String a, String b ){
        // null case
        if( a == null || b == null ) {
            return -1;
        }

        boolean match = false;
        String result = "";
        for( int i = 0; i < a.length(); i++ ){
            StringBuilder temp = new StringBuilder();
            for( int j = 0; j < b.length(); j++){
                if( a.charAt(i) == b.charAt(j) ){
                    match = true;
                    temp.append( a.charAt(i) );
                    i++;
                    if( i >= a.length() ){
                        break;
                    }
                }
                else{
                    if( match == true){
                        match = false;
                        if( temp.length() > result.length()){
                            result = temp.toString();
                        }
                        temp = new StringBuilder();
                    }
                }

                if( temp.length() > result.length()){
                    result = temp.toString();
                }
            }
        }

        System.out.println("LCS from " + a + " and " + b + " : " + result);
        return result.length();
    }
    
    /**
     * @author Keith Santamaria
     * @param array an array of ints that should have no repeated values
     * @return returns an array of length 2 that contains the smallest element in result[0] and
     *  the largest element in result[1]
     * 
     */
    public static int[] findSmallestAndLargestElementInArray( int[] array ){
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for ( int i : array ){
            if( i < min) {
                min = i;
            }
            if( i > max ) {
                max = i;
            }
        }

        int [] result = { min, max };
        return result;
    }
    
/*
    Logic problem:

    Question: if PROCESSOR is D4F3C5C1E1S1S1E3C6 what is QUADRANT?

    Answer: So essentially the code is just the numerical value of the letter 
    multiplied by the corresponding number. Lets look at processor for example

    A = 1 B = 2 C = 3 D = 4 E = 5 F = 6 G = 7 H = 8 I = 9 J = 10 K = 11 L = 12
    M = 13 N = 14 O = 15 P = 16 Q = 17 R = 18 S = 19 T = 20 U = 21 V = 22 W = 23 
    X = 24 Y = 25 Z = 26 

    P = D4 = 4 * 4 = 16 -> P
    R = F3 = 6 * 3 = 18 -> R
    O = C5 = 3 * 5 = 15 -> O
    C = C1 = 3 * 1 = 3 -> C
    E = E1 = 5 * 1 = 5 -> E
    S = S1 = 19 * 1 = 19 -> S
    S = S1 = 19 * 1 = 19 -> S
    O = E3 = 5 * 3 = 15 -> O
    R = C6 = 3 * 6 = 18 -> R

    The only real constraint I see is that only prime numbers are multiplied by 1 so to make the answer
    not trivial I will do the same

    QUADRANT = Q1 G3 A1 B2 C6 A1 G2 E4

    This is only one of many solutions however
*/

    public static void main( String[] args ) throws Exception {
        
        String a = "Minneapolis";
        String b = "Minnesota";
        int [] arrayEx1 = { 17, 10 , 11, 20 , 3 , 19 , 16 , 14 , 2 ,12 ,18 , 1, 15, 13, 7 ,4 ,9, 5, 6, 8};

        System.out.println( getLongestCommonSubstringLength(a, b) );
        System.out.println( Arrays.toString( findSmallestAndLargestElementInArray(arrayEx1) ) );
    }
}
