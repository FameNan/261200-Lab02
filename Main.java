import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Hello wellcome to my book shop:)");
        Book myBook=new Book("OOP","Nannapat",0.0);
        myBook.displayDetails();
        myBook.updatePrice(-180);
        myBook.applyDiscount(-80);
        System.out.println("Summarize before pay...");
        myBook.displayDetails();
        System.out.println("Thank You '-'");
    }
}