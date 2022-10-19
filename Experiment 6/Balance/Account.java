package Balance;

public class Account {
    String name;
    int current;
    void Display_Balance(String name,int cuurent){

        this.name=name;
        this.current=current;
        System.out.println("your name is ="+name);
        int tax_cut=current -5*current;
        System.out.println("balance is ="+tax_cut);

    }
}