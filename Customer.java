package Outfit;

public class Customer implements CusInt {
    private String dressTyp;
    private String colour;
    private int piece;
public OutfitInt[] of=new OutfitInt[2];
public Customer(String dt,String col,int pie)
{
    this.setColour(col);
    this.setDressTyp(dt);
    this.setPiece(pie);
}
public Customer(){}

    public String getDressTyp() {
        return dressTyp;
    }

    public void setDressTyp(String dressTyp) {
        this.dressTyp = dressTyp;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getPiece() {
        return piece;
    }

    public void setPiece(int piece) {
        this.piece = piece;
    }

    public OutfitInt[] getOf() {
        return of;
    }

    public void setOf(OutfitInt[] of) {
        this.of = of;
    }
}
