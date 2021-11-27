import java.io.IOException;
import java.util.Scanner;

interface customer {
    public void purchase();

    public void summary();
}

class member implements customer {
    String name;
    double sales;
    int count;
    double tierDiscount;

    public member(String n) {
        name = n;
    }

    public member() {

    }

    public void purchase() {
        System.out.println("\t");
        System.out.println("enter total retail price:");
        Scanner obj = new Scanner(System.in);
        float price = obj.nextInt();
        System.out.println(price);
        double discount = price * (0.06);
        System.out.println("discount:");
        System.out.println(discount);
        tierDiscount += discount;
        double discountprice = price - discount;
        System.out.println("your discounted price is:");
        System.out.println(discountprice);
        sales = sales + discountprice;
        count++;
    }

    public void summary() {

        System.out.println("\t\t\tTier: Member Sales summary");
        System.out.println("total sales:");
        System.out.println(count);
        System.out.println("total amount received");
        System.out.println(sales);
        System.out.println("total discount given");
        System.out.println(tierDiscount);

    }
}

class bronzemember implements customer {
    String name;
    double sales;
    int count;
    double tierDiscount;

    public bronzemember(String n) {
        name = n;
    }

    public bronzemember() {

    }

    public void purchase() {
        System.out.println("enter total retail price:");
        Scanner obj = new Scanner(System.in);
        float price = obj.nextInt();
        System.out.println(price);
        double discount = price * (0.10);
        System.out.println("discount:");
        System.out.println(discount);
        tierDiscount += discount;
        double discountprice = price - discount;
        System.out.println("your discounted price is:");
        System.out.println(discountprice);
        sales = sales + discountprice;
        count++;

    }

    public void summary() {
        System.out.println("\t\t\tTier: Bronze Member Sales Summary");
        System.out.println("total sales:");
        System.out.println(count);
        System.out.println("total amount received");
        System.out.println(sales);
        System.out.println("total discount given");
        System.out.println(tierDiscount);

    }
}

class silvermember implements customer {
    String name;
    double sales;
    int count;
    double tierDiscount;

    public silvermember(String n) {
        name = n;
    }

    public silvermember() {

    }

    public void purchase() {
        System.out.println("enter total retail price:");
        Scanner obj = new Scanner(System.in);
        float price = obj.nextInt();
        System.out.println(price);
        double discount = price * (0.135);
        System.out.println("discount:");
        System.out.println(discount);
        tierDiscount += discount;
        double discountprice = price - discount;
        System.out.println("your discounted price is:");
        System.out.println(discountprice);
        sales = sales + discountprice;
        count++;

    }

    public void summary() {
        System.out.println("\t\t\tTier:Silver Member Sales Summary");
        System.out.println("total sales:");
        System.out.println(count);
        System.out.println("total amount received");
        System.out.println(sales);
        System.out.println("total discount given");
        System.out.println(tierDiscount);

    }
}

class goldmember implements customer {
    String name;
    double sales;
    int count;
    double tierDiscount;

    public goldmember(String n) {
        name = n;
    }

    public goldmember() {

    }

    public void purchase() {
        System.out.println("enter total retail price:");
        Scanner obj = new Scanner(System.in);
        float price = obj.nextInt();
        System.out.println(price);
        double discount = price * (0.19);
        System.out.println("discount:");
        System.out.println(discount);
        tierDiscount += discount;
        double discountprice = price - discount;
        System.out.println("your discounted price is:");
        System.out.println(discountprice);
        sales = sales + discountprice;
        count++;

    }

    @Override
    public void summary() {
        System.out.println("\t\t\tTier: Gold Member Sales summary");
        System.out.println("total sales:");
        System.out.println(count);
        System.out.println("total amount received");
        System.out.println(sales);
        System.out.println("total discount given");
        System.out.println(tierDiscount);

    }
}

class platinummember implements customer {
    String name;
    double sales;
    int count;
    double tierDiscount;

    public platinummember(String n) {
        name = n;

    }

    public platinummember() {

    }

    public void purchase() {
        System.out.println("enter total retail price:");
        Scanner obj = new Scanner(System.in);
        float price = obj.nextInt();
        System.out.println(price);
        double discount = price * (0.25);
        System.out.println("discount:");
        System.out.println(discount);
        tierDiscount += discount;
        double discountprice = price - discount;
        System.out.println("your discounted price is:");
        System.out.println(discountprice);
        sales = sales + discountprice;
        count++;

    }

    @Override
    public void summary() {
        System.out.println("\t\t\tTier: Platinum Member Sales Summary");
        System.out.println("total sales:");
        System.out.println(count);
        System.out.println("total amount received");
        System.out.println(sales);
        System.out.println("total discount given");
        System.out.println(tierDiscount);

    }
}

class Menu {

    static String n;
    static int membership;
    member m1 = new member();
    bronzemember bm = new bronzemember();
    silvermember sm = new silvermember();
    goldmember gm = new goldmember();
    platinummember pm = new platinummember();

    public static void createmember() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name");
        n = sc.next();
        System.out.println(n);
        System.out.println(
                "choose membership:\n1.member\n2.Bronze Member\n3.Silver Member\n4.Gold Member\n5.Platinum Member");
        membership = sc.nextInt();

    }

    public void makepurchase() {
        switch (membership) {
        case 1:

            m1.purchase();
            break;

        case 2:

            bm.purchase();
            break;
        case 3:

            sm.purchase();
            break;
        case 4:

            gm.purchase();
            break;
        case 5:

            pm.purchase();
            break;
        }

    }

    public void totalsales() {
        System.out.println("\t\t\tTOTAL amount received in all tiers");
        int count = m1.count + bm.count + sm.count + gm.count + pm.count;
        double total = m1.sales + bm.sales + sm.sales + gm.sales + pm.sales;
        System.out.println("total amount received:" + total);
        System.out.println("total sales processed:" + count);

    }

    public void summary() {
        m1.summary();
        bm.summary();
        sm.summary();
        gm.summary();
        pm.summary();
        totalsales();

    }

    public void menu() throws IOException {
        int choice;
        Scanner sc = new Scanner(System.in);
        System.out.println("\t\t\tMenu");
        System.out.println("Choose any one option:");
        System.out.println("1. Create a member");
        System.out.println("2.Make a purchase");
        System.out.println("3.Display a summary");
        System.out.println("4.Exit the system");
        choice = sc.nextInt();
        System.out.println("\n");
        switch (choice) {
        case 1:
            System.out.println("create member function");
            createmember();

            menu();
            break;
        case 2:
            System.out.println("make a purchase function");
            makepurchase();

            menu();
            break;
        case 3:
            System.out.println("Display a summary function");
            summary();

            menu();
            break;
        case 4:
            System.exit(0);
        default:
            System.out.println("wrong choice!");// for clearing screen

            menu();

        }

    }
}

class Application {
    public static void main(String[] args) throws IOException {
        Menu m = new Menu();
        m.menu();
    }

}