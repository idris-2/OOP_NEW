package Task_1;
import Interfaces.NationalService;

public class MilitaryService implements NationalService{
    private int daysLeft;

    public MilitaryService(int days){
        this.daysLeft = days;
    }

    @Override
    public int getDaysLeft() {
        return daysLeft;
    }

    public void setDaysLeft(int daysLeft) {
        this.daysLeft = daysLeft;
    }

    public void work() {
        if(this.daysLeft > 0) {
            this.daysLeft--;
        }
    }
}
