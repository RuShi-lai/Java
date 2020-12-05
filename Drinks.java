package WesterFriendChickenRestaurant;
import java.time.LocalDate;


public abstract class Drinks {
    //    成员变量
    protected String name;
    protected double cost;
    protected LocalDate produceDate;
    protected long qualityDay;
    //    无参构造
    public Drinks() {
    }
   public int num;

    public Drinks(String name, double cost, LocalDate produceDate,int num) {

        this.name = name;
        this.cost = cost;
        this.produceDate = produceDate;
        this.num=num;
    }
    //  抽象的toString方法
    public abstract String toString();
    public boolean isOutOfDate(){
        LocalDate now = LocalDate.now();
        LocalDate OutofDate = this.produceDate.plusDays(this.qualityDay);
        return OutofDate.isAfter(now);
    }

}
