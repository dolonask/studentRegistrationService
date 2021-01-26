package kg.megacom;


import kg.megacom.models.*;

public class Main {

    public static void main(String[] args) {


        Admin admin = new Admin();

        System.out.println(admin);

        try {
            Object admin1 = admin.clone();

            System.out.println(admin1);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}
