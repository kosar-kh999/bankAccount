package ntitty;

public class Current extends Account {


    public AccType current(){
        if (getBalance() < 100000){
            System.out.println("this is not enough");
        }
        else{
            return AccType.CURRENT;
        }

    }

}
