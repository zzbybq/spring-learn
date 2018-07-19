package vip.driftydream.proxy.jdk;

import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;

/**
 * Created by Administrator on 2018/7/18.
 */
public class JdkProxyTest {
    
    public static void main(String[] args) throws Exception {
        ProductService productService = new ProductServiceImpl();
        ProductService proxy = (ProductService) new JdkInvocationHandler().getInstance(productService);
        proxy.addProduct("iphone");

        byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy0", new Class[]{productService.getClass()});
        FileOutputStream fileOutputStream = new FileOutputStream("$Proxy0.class");
        fileOutputStream.write(bytes);
        fileOutputStream.close();
    }
}
