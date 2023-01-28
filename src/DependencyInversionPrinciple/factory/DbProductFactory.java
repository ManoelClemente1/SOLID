package DependencyInversionPrinciple.factory;

import DependencyInversionPrinciple.model.DB;
import DependencyInversionPrinciple.model.IDbProduct;
import DependencyInversionPrinciple.model.MongoDBProduct;
import DependencyInversionPrinciple.model.MySQLProduct;

public class DbProductFactory {

    public static IDbProduct create(DB type){
        if(type.equals(DB.MYSQL)) {
            return new MySQLProduct();
        } else {
            return new MongoDBProduct();
        }
    }
}
