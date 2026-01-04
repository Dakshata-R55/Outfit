package Outfit;
import java.util.Scanner;
import java.math.BigInteger;


public class Main {
public static void main(String[] args)
{
CusInt cus=new Customer();
CusInt cus1=new Customer();

Scanner sc=new Scanner(System.in);

System.out.println("what kind of dress type you want");
String dt=sc.nextLine();
System.out.println("Enter the dress colour");
String clr=sc.nextLine();
System.out.println("Enter the count of piece");
BigInteger pie=new BigInteger(sc.nextLine());

cus.setDressTyp(dt);
cus.setColour(clr);
cus.setPiece(pie.intValue());

    System.out.println("what kind of dress type you want");
    String dt1=sc.nextLine();
    System.out.println("Enter the dress colour");
    String clr1=sc.nextLine();
    System.out.println("Enter the count of piece");
    BigInteger pie1=new BigInteger(sc.nextLine());

cus1.setDressTyp(dt1);
cus1.setColour(clr1);
cus1.setPiece(pie1.intValue());

if(cus.getDressTyp().equals("western outfit")) {
    OutfitInt wo = new Western(500);
    wo.setCus(cus);
    OutfitInt[] of= cus.getOf();
    of[0] = wo;//used array merhod to pass address the address of outfit to user
    System.out.println(cus.getDressTyp());
    System.out.println("price");
    wo.tp();
    wo.ret();//override
}
    else if(cus.getDressTyp().equals("tradition outfit")) {
        OutfitInt to = new Tradition(700);
        to.setCus(cus);
        OutfitInt[] of = cus.getOf();
        of[1] = to;
        System.out.println(cus.getDressTyp());
        System.out.println("price");
        to.tp(250,4);//overload
    }
else{
    System.out.println("didn't find anything");}

    if(cus1.getDressTyp().equals("western outfit")) {
        OutfitInt wo = new Western(500);
        wo.setCus(cus1);
        OutfitInt[] of = cus1.getOf();
        of[0] = wo;
        System.out.println(cus1.getDressTyp());
        System.out.println("price" );
        wo.tp(350,5);//overload

    }

   else if(cus1.getDressTyp().equals("tradition outfit")) {
        OutfitInt to = new Tradition(700);
        to.setCus(cus1);
        OutfitInt[] of = cus1.getOf();
        of[1] = to;
        System.out.println(cus1.getDressTyp());
        System.out.println("price" );
        to.tp();
       to.ret();
}
    else{
        System.out.println("didn't find anything");
}
}
    }

