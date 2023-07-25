package bank;
class Account{
    public String name;
    protected String email;
    private String password;
    public String getPassword(){
        setPassword(randomPass);
        return this.password;
    }
    private void setPassword(String password){
        this.password = password;

    }
}

public class Bank{
    public static void main(String[] args){
        
        Account account1 =new Account();
        account1.name = "apna colleges";
        System.out.println(account1.name );
        account1.email = "apna@gmail.com";
        account1.setPassword("abcd");
        String s=account1.getPassword();
        System.out.println(s);
    }
    

}