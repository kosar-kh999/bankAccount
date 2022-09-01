package ntitty;

public class ShorTime extends Account {

    public void shortTime(){
        if (getBalance() < 50000){
            System.out.println("it is not enough");
        }
        else System.out.println("this is your short time account");
    }
}
