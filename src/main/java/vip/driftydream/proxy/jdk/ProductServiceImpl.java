package vip.driftydream.proxy.jdk;

/**
 * Created by Administrator on 2018/7/18.
 */
public class ProductServiceImpl implements ProductService {
    
    
    public void addProduct(String productName) {
        System.out.println("正在添加产品:" + productName);
    }
}
