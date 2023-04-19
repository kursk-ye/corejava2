package Bridge.Demo1.v3;

/**
 * 管理所有的山寨产品，我也不知道我有那些产品山寨，甚至有很多都不知我生产的，我拿过来贴一个牌子就开始赚钱。
 */
public class ShanZhaiCorp extends Corp {

    //产什么产品，不知道，等被调用的才知道
    public ShanZhaiCorp(Product product){
        super(product);
    }

    //狂赚钱
    public void makeMoney(){
        super.makeMoney();
        System.out.println("我赚钱呀...");
    }
}