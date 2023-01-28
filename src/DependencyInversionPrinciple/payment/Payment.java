package DependencyInversionPrinciple.payment;

import DependencyInversionPrinciple.factory.DbProductFactory;
import DependencyInversionPrinciple.model.DB;
import DependencyInversionPrinciple.model.IDbProduct;
import DependencyInversionPrinciple.model.MySQLProduct;

public class Payment {

    public void pay(String productId){
//        MySQLProduct dbProduct = new MySQLProduct();

        IDbProduct dbProduct = DbProductFactory.create(DB.MONGODB);

        String product = dbProduct.getProductById(productId);
        System.out.println(product);
    }
}
