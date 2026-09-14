import java.util.*;
public class Strings {
    public static void main(String[] args) {
        //String Declaration
        String name = "Harshit";
        System.out.println(name);
        //User input
//            Scanner sc = new Scanner(System.in);
//            String naam = sc.nextLine();
//            System.out.println("hello " + naam);\
        //concat
            String lastName = "Dutta";
            String fullName = name + lastName;
            System.out.println(fullName);

            //charAt
        for(int i = 0;i<fullName.length();i++){
            System.out.println(fullName.charAt(i));
        }
    }
}
