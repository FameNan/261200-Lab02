import java.util.Scanner;

public class Book {
    String title;
    String author;
    double price;

    Book(){//default constructor
        this("Unknown","Unknown",0.0);
    }
    Book(String title,String author,double price){
        this.title=title;
        this.author=author;
        this.price=price;
    }
    Book(String title){ //Only know the name of book
        this(title,"Unknown",0.0);
    }
    public void displayDetails(){
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Price: "+price);
    }
    public void updatePrice(double newPrice){
        if(newPrice>0.0){
            this.price=newPrice;
        }
        while(price <= 0){
                System.out.println("Sorry for incorrect price, Please fill new price: ");
                Scanner input = new Scanner(System.in);
                price = input.nextDouble();
        }
        System.out.println("New Price: " + price);
    }
    public void applyDiscount(double discount){
        while(discount<0|| discount>100){
            System.out.println("Sorry this error discount, Please input new discount");
            Scanner input =new Scanner(System.in);
            discount=input.nextDouble();
        }
        if(discount>0&&discount<1){ //percentage discount
            this.price-=price*discount;
        }else if(discount>=1&& discount<100){// non percentage discount
            this.price-=price*(discount/100);//price-discount from price
        }

        System.out.println("Total Price: "+ price);
    }
}

