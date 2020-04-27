package day02_Variables;

public class EscapeSequences {

    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println("\tHello");
        System.out.println("\t\t\t\t\t\tHello");
        // \t means a pragraph space
        System.out.println("Cybertek School");
        System.out.println("Cybertek\n School");
        System.out.println("\n\nMy \nName \nIs \nMuhtar");
             //\n meansnew line, starts with new line
        //print: My favorite TV show is "Game of Throes"
        System.out.println("My favorite TV show is \"Game of Throes\"");


        System.out.println("\\");
        // \\ prints single slash on console

        System.out.println("/");


        System.out.println("My favorite book is \'Java\' ");  // \' prints the '
        System.out.println("My favorite book is 'Java' "); // prints '


    }
}
