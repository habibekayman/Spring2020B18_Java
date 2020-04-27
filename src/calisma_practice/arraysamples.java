package calisma_practice;

public class arraysamples {
    public static void main(String[] args) {

        String[] emails = {"cybertek@yahoo.com",
                            "cybertek@gmail.com",
                            "cybertek@hotmail.com",
                            "cybertek@outlook.com",
                            "hasankayman@gmail.com",
                            "habibekayman@gmail.com",
                "cybertek@hotmail.com",
                "cybertek@outlook.com",
                "hasankayman@gmail.com",
                "habibekayman@gmail.com",
                "cybertek@hotmail.com",
                "cybertek@outlook.com",
                "hasankayman@gmail.com",
                "habibekayman@gmail.com",
                "cybertek@hotmail.com",
                "cybertek@outlook.com",
                "hasankayman@gmail.com",
                "habibekayman@gmail.com",
                "cybertek@hotmail.com",
                "cybertek@outlook.com",
                "hasankayman@gmail.com",
                "habibekayman@gmail.com",
                "cybertek@hotmail.com",
                "habibekayman@gmail.com",
                "cybertek@outlook.com",
                "hasankayman@gmail.com",
        };

        for (int i = 0; i <emails.length ; i++) {
            String emailaddress = emails[i];
            //if (emailaddress.charAt(3) == 'i') {
            if(emailaddress.substring(3,4)=="i"){
                System.out.println(emailaddress);
            }
        }
    }
}