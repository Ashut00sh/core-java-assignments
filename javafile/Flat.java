import java.util.*;

class OneBHK {
    private double roomarea;
    private double hallarea;
    protected double price;

    OneBHK() {
        roomarea = 700;
        hallarea = 200;
        price = 2100000;
    }

    OneBHK(double roomarea, double hallarea, double price) {
        this.roomarea = roomarea;
        this.hallarea = hallarea;
        this.price = price;
    }

    void show() {
        System.out.println("roomarea=" + roomarea + "hallarea= " + hallarea + "price=" + price);
    }
}

class TwoBHK extends OneBHK {
    private double room2Area;

    TwoBHK() {

        room2Area = 300;
    }

    TwoBHK(double roomarea, double hallarea, double price, double room2Area) {
        super(roomarea, hallarea, price);
        this.room2Area = room2Area;

    }

    void show() {
        super.show();
        System.out.println("room2Area=" + room2Area);
    }

}

class FlatDemo {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        System.out.println("how many records you want to store");
        int l = e.nextInt();
        TwoBHK arr[] = new TwoBHK[l];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter roomarea");
            double roomarea = e.nextDouble();
            System.out.println("Enter hallarea");
            double hallarea = e.nextDouble();
            System.out.println("Enter price");
            double price = e.nextDouble();
            System.out.println("Enter room2area");
            double room2Area = e.nextDouble();
            TwoBHK bk = new TwoBHK(roomarea, hallarea, price, room2Area);
            arr[i] = bk;
            // bk.show();

        }
        e.close();
        double sum = 0;
        // System.out.println("total price of three flats="+sum)
        for (TwoBHK abc : arr) {

            sum = sum + abc.price;
            abc.show();

        }
        System.out.println("Total price of all" + l + " flats=" + sum);
    }
}
