package UdemySolid.DependencyInversionPrinciple.factory;

import UdemySolid.DependencyInversionPrinciple.model.DB;
import UdemySolid.DependencyInversionPrinciple.model.IDbProduct;
import UdemySolid.DependencyInversionPrinciple.model.MongoDBProduct;
import UdemySolid.DependencyInversionPrinciple.model.MySQLProduct;

public class DbProductFactory {

    public static IDbProduct create(DB type){
        if(type.equals(DB.MYSQL)) {
            return new MySQLProduct();
        } else {
            return new MongoDBProduct();
        }
    }
}
