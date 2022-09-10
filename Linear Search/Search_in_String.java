package Linear_Search;

public class Search_in_String {
    public static void main(String[] args) {
        String name = "Akash";
        char target = 'h';
        System.out.println(LinearSearchInString(name, target));
    }

//    Using loop (to get index number)

    static int LinearSearchInString(String str , char targetValue){

        if(str.length()==0){
            return -1;
        }
        for (int i = 0; i < str.length(); i++) {
            if(targetValue==str.charAt(i)){
                return i;
            }
        }
        return -1;
    }
}



//    Using loop (to get index number but return type as boolean)

//    static boolean LinearSearchInString(String str , char targetValue){
//
//        if(str.length()==0){
//            return false;
//        }
//        for (int i = 0; i < str.length(); i++) {
//            if(targetValue==str.charAt(i)){
//                return true;
//            }
//        }
//        return true;
//    }
//}






// Using for each loop ( we use return type as boolean if we use return type as int we will get ASCII value if element found in String )


//    static boolean LinearSearchInString(String str , char targetValue){
//
//        if(str.length()==0){
//            return false;
//        }

        // ( here "str.toCharArray()" will convert Sting into character Array (i.e) --->  ['A','k','a','s','h']  and then compare target element with each element in character Array )

//        for (char element :str.toCharArray()) {
//            if(element==targetValue){
//                return true;
//            }
//        }
//        return false;
//    }
//}


