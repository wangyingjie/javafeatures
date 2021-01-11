package java14.com.atguigu.feature;

import org.junit.jupiter.api.Test;

/**
 *  switch��������
 *
 * @author shkstart Email:shkstart@126.com
 * @create ���� 12:10
 */
public class Feature04 {
    //jdk12֮ǰ���÷�
    @Test
    public void test1() {

        Week day = Week.FRIDAY;
        switch (day) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
                System.out.println(1);
                break;
            case THURSDAY:
                System.out.println(2);
                break;
            case FRIDAY:
            case SATURDAY:
                System.out.println(3);
                break;
            case SUNDAY:
                System.out.println(4);
                break;
            default:
                throw new IllegalStateException("What day is today?" + day);
        }

    }

    //jdk12�����ԣ�����switch���ʽ
    @Test
    public void test2(){

        Week day = Week.FRIDAY;
        switch (day){
            case MONDAY,TUESDAY,WEDNESDAY -> System.out.println(1);
            case THURSDAY -> System.out.println(2);
            case FRIDAY,SATURDAY -> System.out.println(3);
            case SUNDAY -> System.out.println(4);
            default -> throw new IllegalStateException("What day is today?" + day);
        }

        //ʹ�ñ�������switch���ʽ��ֵ
        int num = switch (day) {
            case MONDAY, TUESDAY, WEDNESDAY -> 1;
            case THURSDAY -> 2;
            case FRIDAY, SATURDAY -> 3;
            case SUNDAY -> 4;
            default -> throw new IllegalStateException("What day is today?" + day);
        };

        System.out.println(num);

    }

    //jdk13�����ԣ�������yield�ؼ��֣����ڷ���ָ�������ݣ�����switch�ṹ
    @Test
    public void test3(){
        String x = "3";
        int num = switch (x){
            case "1" -> 1;
            case "2" -> 2;
            case "3" -> 3;
            default -> {
                System.out.println("default...");
                yield 4;
            }
        };

        System.out.println(x);
    }

    @Test
    public void test4(){
        String x = "3";
        int num = switch (x){
            case "1":yield 1;
            case "2":yield 2;
            case "3":yield 3;
            default: yield 4;
        };
        System.out.println(num);
    }


}

enum Week {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
}