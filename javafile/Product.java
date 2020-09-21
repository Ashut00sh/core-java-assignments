
//39. Create class Product with three data members (pid, price, quantity) and
// parameterized constructor that takes values for all three data members.  
//Create a main method in different class (say ProductDemo) and perform following task:
//a. Accept information for five Product objects from user and store objects in an array
//b. Find pid of product with highest price. 
//c. Create a static method (with array of product’s object as argument) 
//in Product class to calculate and return total amount spent on all products.
// ( amount spent on single product = price of product * quantity of product )
import java.util.Scanner;

public class Product {
    int pid;
    double price;
    int quantity;

    Product(int pid, double price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }

    void show() {
        System.out.println("pid=" + pid + " price=" + price + " quantity=" + quantity);
    }

    static void Pidhighprice(Product arr[]) {
        int p = 0;
        double max = 0;
        // Product p = new Product();
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i].price) {
                max = arr[i].price;
                p = arr[i].pid;
            }
        }
        System.out.println("pid of highest prise=" + p);
    }

    static double TotalAmount(Product arr[]) {
        double total = 0;
        for (int i = 0; i < arr.length; i++) {
            total = total + (arr[i].price * arr[i].quantity);
        }
        return total;
    }
}

class ProductDemo {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        Product arr[] = new Product[2];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter pid");

            int pid = k.nextInt();
            ++pid;
            System.out.println("Enter price");
            double price = k.nextDouble();
            System.out.println("Enter quantity");
            int quantity = k.nextInt();
            Product p = new Product(pid, price, quantity);
            arr[i] = p;
        }
        Product.Pidhighprice(arr);

        double total = Product.TotalAmount(arr);
        System.out.println("Total amunt is==" + total);

        for (Product abc : arr) {
            abc.show();
        }
    }
}