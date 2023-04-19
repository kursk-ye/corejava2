package Bridge.Demo1.v3;

/**
 * 我集团公司生产的衣服
 */
public class Clothes extends Product {
    public void beProducted() {
        System.out.println("生产出的衣服是这个样子的...");
    }

    public void beSelled() {
        System.out.println("生产出的衣服卖出去了...");
    }
}