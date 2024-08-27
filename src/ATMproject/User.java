package src.ATMproject;

public class User {
    private String userName;
    private Integer userID;
    private String passWord;
    private Double balance;

    public User() {
    }

    public User(String userName, Integer userID, String passWord, Double balance) {
        this.userName = userName;
        this.userID = userID;
        this.passWord = passWord;
        this.balance = balance;
    }

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

    public Boolean checkPassword(String input) {
        return this.passWord.equals(input);
    }

    public Boolean equals(User thatUser) {
        return this.userName.equals(thatUser.getUserName());
    }

    public void printInfo() {
        System.out.println("User: " + this.userName + "(" + this.userID + ")" + "\nBalance: " + this.balance);
    }
}
