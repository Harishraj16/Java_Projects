public class Customer{
    String CustomerName;
    int AccountNum;
    int AccountBalance;
    int AadharID;

    public Customer(String name,int Num,int balance,int ID){
        CustomerName = name;
        AccountBalance = balance;
        AccountNum = Num;
        AadharID = ID; 
    }

    void Update_name(String newName){
        CustomerName = newName;
    }

    void View_Balance(){
        System.out.println("Balance: "+AccountBalance);
    }

    void addBalance(int cost){
        AccountBalance += cost;
        View_Balance();
    }

    void WithDrawl(int cost){
        AccountBalance -= cost;
        View_Balance();
    }
}