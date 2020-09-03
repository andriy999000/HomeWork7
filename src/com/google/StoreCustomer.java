package com.google;

public class StoreCustomer {
    private static final String nameClass = "StoreCustomer";
    private static final String nameSupermarket = "Атб";
    private String name;
    private int age;
    private float growth;







    public void setStr(int key ,String value) {


        switch (key){
            case 1:
                this.name = value;
                break;

            default:
                System.out.println("Error");

        }
    }

    public void setInt(int key ,int value) {


        switch (key){
            case 1:
                this.age = value;
                break;

            default:
                System.out.println("Error");

        }
    }


    public void setFloat(int key ,float value) {


        switch (key){
            case 1:
                this.growth = value;
                break;

            default:
                System.out.println("Error");

        }
    }



    public int getInt(int key){

        switch (key){
            case 1:
                return this.age;




            default:
                return -1;
        }

    }

    public float getFloat(int key){

        switch (key){
            case 1:
                return this.growth;

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
                System.out.print("age = ");
                System.out.println(this.age);
                break;


            case 3:
                System.out.print("growth = ");
                System.out.println(this.growth);
                break;

            default:
                System.out.println("Error(Info): this key does not exist");

        }


    }
}
