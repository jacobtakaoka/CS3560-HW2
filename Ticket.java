public class Ticket implements SaleableItem{

    public Ticket(){
        //no-arg constructor
    }
    @Override
    public void sellCopy() {
        System.out.println("Selling a Ticket");
    }
}
