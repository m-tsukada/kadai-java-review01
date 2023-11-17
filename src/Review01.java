
public class Review01 {

    public static void main(String[] args) {
        int price = 1500;
        double tax_ratio = 0.1;
        int tax_amount = tax(price, tax_ratio);        
        int including_tax = price + tax_amount;
        System.out.println(price + "円の商品の税込価格は" + including_tax + "円（消費税は" + tax_amount + "円)です。");
    }
    public static int tax(int price, double tax_ratio) {
        int tax_amount  = (int)(price * tax_ratio);
        return tax_amount;
    }

}
