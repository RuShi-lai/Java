package WesterFriendChickenRestaurant;
import java.time.LocalDate;

public class Juice extends Drinks{
    public long qualityDay=2;
    public Juice() {
    }

    public Juice(String name, double cost, LocalDate produceDate,int num) {
        super(name, cost, produceDate,num);
        this.qualityDay=2;
    }

    @Override
    public String toString() {
        return "Juice{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                ", produceDate=" + produceDate +
                ", qualityDay=" + qualityDay +
                ", num=" + num +
                '}';
    }
}

