package java14.com.atguigu.feature;

import java.util.ArrayList;

/**
 *  �����ռ����ĸ��£��� ����ParallelScavenge��SerialOld GC���
 *                  �� ɾ��CMS����������
 *                  �� ZGC ������macOS��Windows��ʹ��
 *  -XX:+UseParallelGC -XX:-UseParallelOldGC
 *
 *  -XX:-UseParallelOldGC
 *
 *   -XX:+UseConcMarkSweepGC
 *
 *   -XX:+UnlockExperimentalVMOptions -XX:+UseZGC
 *
 * @author shkstart Email:shkstart@126.com
 * @create 2020-04-01 ���� 4:02
 */
public class Feature06 {

    public static void main(String[] args) {
        ArrayList<byte[]>  list = new ArrayList<>();

        while(true){
            byte[] arr = new byte[100];
            list.add(arr);
        }
    }

}
