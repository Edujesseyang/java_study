package src.ATMproject;

public class User {
    private String userName;
    private Integer userID;
    private String passWord;
    private Double balance;


     // constructors
    public User() {
    }

    public User(String userName, Integer userID, String passWord, Double balance) {
        this.userName = userName;
        this.userID = userID;
        this.passWord = passWord;
        this.balance = balance;
    }

    // getters
    public Double getBalance() {
        return balance;
    }

    public String getPassWord() {
        return passWord;
    }

    public Integer getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    // setters
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    // printer
    public void printInfo() {
        System.out.println("User: " + this.userName + "(ID: " + this.userID + ")" + "\nBalance: " + this.balance);
        System.out.print("password: ");
        for (int i = 0; i < this.passWord.length(); i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    // update balance
    public void deposit(double deposit) {
        this.balance += deposit;
    }

    public void withdraw(double withdraw) {
        this.balance -= withdraw;
    }
}
