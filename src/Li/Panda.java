package Li;

import Li.Animal;

/**
 * @author l.
 * @date 2021/9/29.
 * @time 7:34.
 */
public class Panda extends Animal implements Valuable, Protectable {
    @Override // 重写
    public void eat() {
        super.eat();
        System.out.println("熊猫吃主子");
    }

    @Override
    public void cang() {
        System.out.println("藏起来");
    }

    @Override
    public void getMoney() {
        System.out.println("很值钱");
    }
}
