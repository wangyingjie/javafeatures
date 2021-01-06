package java9.interfaces;

/**
 * @author wangyingjie5
 * @date 2021/1/6 14:46
 */
public interface Weapon {

    /**
     * default method can invoke private method
     */
    default void killAbility() {
        gun();
        knife();
        sword();
    }

    void sword();

    void gun();

    /**
     * 接口支持私有方法
     */
    private void knife() {
        System.out.println();
    }


}
