package java14.com.atguigu.feature;


import org.junit.jupiter.api.Test;

/**
 * 1. JEP 305��instanceof��ģʽƥ�䣨Ԥ����
 *
 * @author shkstart Email:shkstart@126.com
 * @create ���� 11:32
 */
public class Feature01 {
    @Test
    public void test1(){

        Object obj = new String("hello,Java14");
        obj = null;//��ʹ��null ƥ��instanceof ʱ�����ض���false.
        if(obj instanceof String){
            String str = (String) obj;
            System.out.println(str.contains("Java"));
        }else{
            System.out.println("��String����");
        }

        //����1��
        // if(obj instanceof String str){ //�����ԣ�ʡȥ��ǿ������ת���Ĺ���
        //     System.out.println(str.contains("Java"));
        // }else{
        //     System.out.println("��String����");
        // }
    }
}

// ����2
class InstanceOf{

    String str = "abc";

    public void test(Object obj){

        // if(obj instanceof String str){//��ʱ��str�������������if�ṹ�ڡ�
        //     System.out.println(str.toUpperCase());
        // }else{
        //     System.out.println(str.toLowerCase());
        // }

    }

}

//����3��
class Monitor{
    private String model;
    private double price;

//    public boolean equals(Object o){
//        if(o instanceof Monitor other){
//            if(model.equals(other.model) && price == other.price){
//                return true;
//            }
//        }
//        return false;
//    }


    // public boolean equals(Object o){
    //     return o instanceof Monitor other && model.equals(other.model) && price == other.price;
    // }

}