import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static ArrayList<String> bucketize (String sentence, int bucketSize){
        Scanner sc = new Scanner(sentence);
        ArrayList<String> buckets= new ArrayList<>();
        StringBuilder temp = new StringBuilder();
        int i = 0;
        while(sc.hasNext()){
            String curr = sc.next();
            // System.out.println(curr + " " + curr.length() ) ;
            // System.out.println(temp + " " + temp.length());
            if(temp.length() + curr.length() + 1 <= bucketSize){
                if( temp.length() == 0 ){
                    temp.append(curr);
                }
                else{
                    temp.append(" " + curr);
                }

            }
            else{ 
                buckets.add(temp.toString());
                temp = new StringBuilder();
                temp.append(curr);
            }
            // System.out.println(i + " :" +  buckets.toString());
            // i++;
            // System.out.println("-------");
        }
        buckets.add(temp.toString());
        return buckets;
    }
    public static void main(String[] args) throws Exception {
        String [] testSet = { "she sells sea shells by the sea",
            "the mouse jumped over the cheese",
            "fairy dust coated the air",
            "a b c d e"
        };

        int [] testSetBucketSize = { 10,
            7,
            20,
            2   
        };

        for (int i = 0; i < testSet.length; i++) {
            System.out.println( bucketize(testSet[i], testSetBucketSize[i]) );
        }


    

    }
}
