package OfficeHours.Practice_06_22_2021;
 /*
    Shopping

Create an abstract class Shopping
    - Declare two abstract methods:
        buyItem(), returnItem()

Create a concrete class Target
    - Inherit Shopping and implement all abstract methods

Create an interface Shipping
    - Declare an abstract methods:
        payForShipping(boolean)

Create an abstract class OnlineShopping
    - Inherits Shopping and implements Shipping
    - Does not need to implement any abstract methods

Create a concrete class Amazon
    - Inherit OnlineShopping and implement all abstract methods

Create a concrete class Ebay
    - Inherit OnlineShopping and implement all abstract methods

Create an interface AllowUsersToSell
    - Declare an abstract method:
        uploadProduect()
     */

public abstract class Shopping {
   public abstract void buyItem();
   public abstract void returnItem();

}
