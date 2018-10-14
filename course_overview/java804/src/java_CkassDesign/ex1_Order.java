package java_CkassDesign;
class ShopItem
{
    public float price;
    public int quantly;
}
class ShoppingCart
{
    public ShopItem[] items;
}
public class ex1_Order
{

    public float calculateTotal(ShoppingCart cart, float salesTax)
    {
        float total = 0;

        for (ShopItem item : cart.items) {
            total += item.price * item.quantly;
        }

        total += total * salesTax;
        return total;
    }
}
/*

This is an example of___

A)strong encapsulation
B)tighht coupling
C)polymorphism
D)inheritance
E)abstraction





*/