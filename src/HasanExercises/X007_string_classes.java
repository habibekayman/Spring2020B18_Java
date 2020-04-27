package HasanExercises;
import java.util.*;
public class X007_string_classes {
    public static void main(String[] args) {
        /*String str = "Cybertek School is the best";
        String schoolName = str.substring(23,27);
        System.out.println(schoolName);*/

    /*    String fullname = "Habibe Kayman";
        //                 0123456789012
        System.out.println(fullname);
        String firstname = fullname.substring(0,6);
        String lastname = fullname.substring(7,13);
        System.out.println(firstname);
        System.out.println(lastname);
        String gmailaddress = lastname.concat(".").concat(firstname).concat("@gmail.com");
        System.out.println(gmailaddress);
        gmailaddress = gmailaddress.toUpperCase();
        System.out.println(gmailaddress);
        int firstK = gmailaddress.indexOf("K")+1;
        int num1 = gmailaddress.indexOf("MAIL")+1;
        System.out.println(firstK);
        System.out.println(num1);
        gmailaddress = gmailaddress.replace("GMAIL", "yahoo");
        System.out.println(gmailaddress);

       String fullname= "habibe kayman";
       //fullname= fullname.replace(target: "kayman", replacement:"java");
        fullname=fullname.replace("kayman","java");
        System.out.println(fullname);

       String fullname = "Hasan Kayman";
       String firstname = fullname.substring(0,fullname.indexOf(" ")); //bosluk butun isimlerde oldugu icin hepsine uyuyor
       String lastname = fullname.substring(fullname.indexOf(" ")+1);
        System.out.println(firstname);
        System.out.println(lastname);

    Scanner input = new Scanner(System.in);
        System.out.println("Enter your full name");
        String fullName = input.nextLine(); // kullanici giris yapmasi icin komut

        String firstname = fullName.substring(0,fullName.indexOf(" "));
        firstname = firstname.substring(0,1).toUpperCase() + firstname.substring(1).toLowerCase();
        String lastname = fullName.substring(fullName.indexOf(" ")+1);
        lastname = lastname.substring(0,1).toUpperCase() + lastname.substring(1).toLowerCase();
        System.out.println("Your first name is ".concat(firstname));
        System.out.println("Your last name is ".concat(lastname));
*/
//  HABIBE KAYMAN


        Scanner input = new Scanner(System.in);
        System.out.println("Enter your full name:");
        String fullname = input.nextLine();
        String firstname = fullname.substring(0,fullname.indexOf(" ")); //fullname.substring(baslangic, bitis) belli bir yere kadar
        String lastname = fullname.substring(fullname.indexOf(" ")+1); // fullname.substring(baslangic) sonuna kadar
        //String fninit = fullname.substring(0,1);
        String lninit = fullname.substring(fullname.indexOf(" ")+1,fullname.indexOf(" ")+2);
        String fninit = firstname.substring(0,1);
        //String lninit = lastname.substring(0,1);
        System.out.println(fninit.toUpperCase());
        System.out.println(lninit.toUpperCase());

    }




}
