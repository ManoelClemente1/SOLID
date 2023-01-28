package DependencyInversionPrinciple.model;

public class MySQLProduct implements IDbProduct {

    @Override
    public String getProductById(String productId){
        return "Mysql: Exibindo dados do produto " + productId;
    }
}
