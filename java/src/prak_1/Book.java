package prak_1;

import java.util.Scanner;

public class Book {
    Scanner cout=new Scanner(System.in);
    public int pages;
    public String avtor;
    public String number;
    public Book(){
        System.out.println("введите параметры:кол-во страниц,автора и идентификационный номер(каждый элемент по enter)");
        pages=cout.nextInt();
        cout.nextLine();
        avtor=cout.nextLine();
        number=cout.nextLine();
        System.out.println(this);;
    }
    public String toString(){
        return "Автор: "+avtor+" кол-во страниц: "+pages+" идентификационный номер: "+number;
    }

}
