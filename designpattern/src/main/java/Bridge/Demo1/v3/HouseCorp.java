package Bridge.Demo1.v3;

/**
 * 房地产公司，按照翻译来说应该叫realty corp，这个是比较准确的翻译
 * 但是我问你房地产公司翻译成英文，你第一反应什么？对嘛还是house corp!
 */
public class HouseCorp extends Corp {
    //定义传递一个House产品进来
    public HouseCorp(House house) {
        super(house);
    }

    //房地产公司很High了，赚钱，计算利润
    public void makeMoney() {
        super.makeMoney();
        System.out.println("房地产公司赚大钱了...");
    }
}
