package Outfit;

public class Western extends Outfit {
    public Western(int price){
        this.setPrice(price);
    }
    public  Western(){}
    @Override
    public void ret()
    {
        System.out.println("western dress's can't returnable");
    }

}
