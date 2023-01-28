package UdemySolid.DependencyInversionPrinciple.payment;

import UdemySolid.DependencyInversionPrinciple.factory.DbProductFactory;
import UdemySolid.DependencyInversionPrinciple.model.DB;
import UdemySolid.DependencyInversionPrinciple.model.IDbProduct;

public class Payment {

    public void pay(String productId){
//        MySQLProduct dbProduct = new MySQLProduct();

        IDbProduct dbProduct = DbProductFactory.create(DB.MONGODB);

        String product = dbProduct.getProductById(productId);
        System.out.println(product);
    }
}
