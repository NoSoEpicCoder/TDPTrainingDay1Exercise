public class StringExercise {

    public static void main(String[] args){
        //9.2.1
        String s = "Amanda Chui";
        System.out.println(s.charAt(3)); //n
        System.out.println(s.substring(8)); //hui
        System.out.println(s.length()); //11
        System.out.println(s.indexOf('a')); //2
        System.out.println(s.charAt(0)); //A
        System.out.println(s.substring(1, 4)); //man
        System.out.println(s.substring(1)); //manda Chui
        System.out.println(s.indexOf('m', 4)); //-1
        System.out.println(s.charAt(4)); //d
        System.out.println(s.substring(4, 5)); //d

        //9.2.3
        String name = "Avi Laurie";
        System.out.println(name.toLowerCase().indexOf('a')); //0
        System.out.println(name.toUpperCase().charAt(5)); //A
        System.out.println(name.substring(3).indexOf('i')); //5
        System.out.println(name.substring(2).toUpperCase()); //I LAURIE
        System.out.println(name.toUpperCase().indexOf('A', 1)); //5
        System.out.println(name.substring(name.indexOf(' ')+1).length()); //6

        //Methods
        System.out.println(count('l', "hello world")); //l appears 3 times
        System.out.println(replace("bonjour", 'o', '0')); //will return b0nj0ur
        System.out.println(isHeteroPair("TERRY", "FOX")); //will return true that these two are a hetero pair
    }

    //9.2.4
    public static int count(char c, String s){
        int counter = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == c){
                counter++;
            }
        }
        return counter;
    }

    //9.2.5
    public static String replace(String s, char oldChar, char newChar){
        StringBuilder newString = new StringBuilder(s);
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == oldChar){
                newString.setCharAt(i, newChar);
            }
        }
        return newString.toString();
    }

    //9.2.7
    public static boolean isHeteroPair(String wordA, String wordB){
        boolean hetero = true;
        for(int i=0; i<wordA.length() && hetero; i++){
            for(int j=0; j<wordB.length() && hetero; j++){
                if(wordA.charAt(i) == wordB.charAt(j)){
                    hetero = false;
                }
            }
        }
        return hetero;
    }
}