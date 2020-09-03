package com.google;

public class Book {
    private static final String nameClass = "Book";
    private static final String namelibraryThisBook = "С библиотеки Brain Academy";
    private int pages;
    private String name;
//    pirvate int a;
    public int get() {

        return pages;
    }

    public void setInt(int key ,int value) {
        switch (key){
            case 1: this.pages = value;
        }


        //        pages = pages;
    }


    public void setStr(int key ,String value) {


        switch (key){
            case 1:
                this.name = value;
                break;

        }
    }



    public int getInt(int key){
        switch (key){
            case 1:
                return this.pages;


            default:
                return -1;

        }
    }


    public String getStr(int key){
        switch (key){
            case 1:
                return this.name;



            default:
                return "Error";


        }
    }



    public void Info(int key){
        switch (key){
            case 1:
                System.out.print("name = ");
                System.out.println(this.name);
                break;


            case 2:
                System.out.print("pages = ");
                System.out.println(this.pages);
                break;


        }


    }
}
