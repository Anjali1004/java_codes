import java.util.*;
public class change_case {
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str =scan.nextLine();
        System.out.println("1. All upper case\n");
        System.out.println("2. All lower case\n");
        System.out.println("3. Capitalize (capitalize the first letter of each word)\n");
        System.out.println("4. Sentence case (capitalize the first letter of the first word in a sentence)\n");
        System.out.println("5. Invert: lower to upper and upper to lower\n  ");
        System.out.println("Choose 1 to 5: \n");
        int num = scan.nextInt();
        int len = str.length();
        switch(num) {
            case 1:System.out.println(str.toUpperCase());
              break;
            case 2:System.out.println(str.toLowerCase());
              break;
            case 3:
                    for (int i = 0; i < len; i++) {
                        Character ch = (Character)str.charAt(i-1);
                        if(i==0 || ch.equals(' '))
                            str[i] = Character.toUpperCase(i);
                    }
                    System.out.println(str);
              break;
            case 4:
                    for (int i = 0; i < len; i++) {
                        Character ch = (Character)str.charAt(i-1);
                        if(i==0 || ch.equals("."))
                            str[i] = Character.toUpperCase(i);
                    }
                    System.out.println(str);
              break;
            case 5:
                for (int i = 0; i < len; i++) {
                    if (Character.isLowerCase(i)) 
                        str[i] = Character.toUpperCase(i);
                    else
                        str[i] = Character.toLowerCase(i);
                }
                System.out.println(str);
              break;
            
            default:System.out.println("Invalid Entry");
          }
     }
}
