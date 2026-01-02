package Outfit;

public abstract class Outfit implements OutfitInt {
    private int price;
    private CusInt cus;


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public CusInt getCus() {
        return cus;
    }
    public void ret()
    {
        System.out.println("bill required");
    }
    public void setCus(CusInt cus) {
        this.cus = cus;
    }
    public void tp(){
        int tp=(this.getPrice()*cus.getPiece());
        System.out.println(tp);
    }
    public void tp(int rent){
        int tp=rent*cus.getPiece();

    }
}
