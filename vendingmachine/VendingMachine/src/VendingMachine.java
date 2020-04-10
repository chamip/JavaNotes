public class VendingMachine {
    int price = 80;
    int balance = f();
    int total;

    VendingMachine(){   //构造函数
        total =0;
    }

    VendingMachine(int price){  //重载
        this();
        this.price = price;
    }

    int f(){
        return 10;
    }

    void setPrice(int price){
        this.price = price;
    }
    void showPrompt(){
        System.out.println("Welcome");
    }
    void insertMoney(int amount){
        balance = balance + amount;
    }
    void showBalance(){
        System.out.println(balance);
    }
    void getFood(){
        if(balance >= price){
            System.out.println("Here you are.");
            balance = balance - price;
            total = total + price;
        }
    }
    public static void main(String[] args){
        VendingMachine vm = new VendingMachine(100);
        vm.showPrompt();
        vm.showBalance();
        vm.insertMoney(100);
        vm.getFood();
        vm.showBalance();
        System.out.println("-------------------------");
        vm.setPrice(120);
        vm.insertMoney(100);
        vm.getFood();
        vm.showBalance();
        System.out.println("-------------------------");
        VendingMachine vm1 = new VendingMachine();
        vm1.insertMoney(200);
        vm.showBalance();
        vm1.showBalance();
    }
}
