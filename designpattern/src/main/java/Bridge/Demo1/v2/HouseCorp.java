package Bridge.Demo1.v2;

/**
 * 房地产公司，按照翻译来说应该叫realty corp，这个是比较准确的翻译
 * 但是我问你房地产公司翻译成英文，你第一反应什么？对嘛还是house corp!
 */
public class HouseCorp extends Corp {

    //房地产公司就是盖房子
    @Override
    protected void produce() {
        System.out.println("房地产公司盖房子...");
    }

    @Override
    protected void sell() {
        System.out.println("房地产公司出售房子...");
    }

    //房地产公司很High了，赚钱，计算利润
    public void makeMoney() {
        super.makeMoney();
        System.out.println("房地产公司赚大钱了...");
    }

}
