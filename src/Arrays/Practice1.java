package Arrays;
//Capitalize first letter of each word and rest all letters in smaller case.
//        names = ["Vineet", "RAVI", "sumit", "aMIT"]
//
//        output : ["Vineet", "Ravi", "Sumit", "Amit"]


import javax.xml.stream.events.Characters;

public class Practice1 {
    public static void main(String[] args) {

    String[] words={"Vineet","RAVI","sumit","aMIT"};
    captialFirstletter(words);

    }

    private static void captialFirstletter(String[] words) {
//        String[] word=words
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<words.length;i++)
        {

              sb.append(Character.toUpperCase(words[i].charAt(0)));

              sb.append(words[i].substring(1).toLowerCase()).append(" ");

        }
        System.out.println(sb.toString().trim());
    }
}
//       Make pairs of 2 from the list of numbers such that none of pair should be repeated even in inverse order.
//numArray = [0, 1, 2, 2, 1, 0]
//
//Output :
//0, 1
//0, 2
//0, 0
//1, 1
//1, 2
//2, 2