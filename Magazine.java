public class Magazine implements SaleableItem{

    public Magazine(){
        //no-arg constructor
    }
    @Override
    public void sellCopy() {
        System.out.println("Selling a Magazine");
    }
}
