package com.google;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Book book_1 = new Book();
        PostOffice office_1 = new PostOffice();
        StoreCustomer buyer_1 = new StoreCustomer();

                                //Задание 1


        //Инициализация полей объектов
//        book_1.name = "Курс Java";
//        book_1.pages = 300;
//
//        office_1.address = "проспект Соборный";
//        office_1.country = "Украина";
//        office_1.town = "Запорожье";
//
//        buyer_1.age = 20;
//        buyer_1.growth = 1.80F;
//        buyer_1.name = "Алексей";
//
//
//
//        Вывод информацыи об обьекте
//        System.out.println("Имя класса : " + book_1.nameClass);
//        System.out.println("name = " + book_1.name);
//        System.out.println("pages = " + book_1.pages);
//        System.out.println();
//
//
//
//        System.out.println("Имя класса : " + office_1.nameClass);
//        System.out.println("address = " + office_1.address);
//        System.out.println("country = " + office_1.country);
//        System.out.println("town = " + office_1.town);
//        System.out.println();
//
//
//        System.out.println("Имя класса : " + book_1.nameClass);
//        System.out.println("age = " + buyer_1.age);
//        System.out.println("growth = " + buyer_1.growth);
//        System.out.println("name = " + buyer_1.name);
//        System.out.println();

                   //Работает(  можно не проверять:))))  )



                                                    //Задание2


        book_1.setInt(1,300);
        book_1.setStr(1,"Курс Java");

        book_1.Info(1);
        book_1.Info(2);

        System.out.println();


        


        office_1.setStr(1,"проспект Соборный");
        office_1.setStr(2,"Украина");
        office_1.setStr(3,"Запорожье");

        office_1.Info(1);
        office_1.Info(2);
        office_1.Info(3);

        System.out.println();





        buyer_1.setStr(1,"Алексей");
        buyer_1.setInt(1,22);
        buyer_1.setFloat(1,1.80f);

        buyer_1.Info(1);
        buyer_1.Info(2);
        buyer_1.Info(3);

        System.out.println("\n\nfinish");






    }
}
