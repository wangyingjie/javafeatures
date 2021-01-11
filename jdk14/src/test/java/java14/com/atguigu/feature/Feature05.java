package java14.com.atguigu.feature;


import org.junit.jupiter.api.Test;

/**
 * �ı���(text blocks)��ʹ��
 *
 * @author shkstart Email:shkstart@126.com
 * @create ���� 7:13
 */
public class Feature05 {


    // @Test
    // public void test1(){
    //     String text1 = "The Sound of silence\n" +
    //             "Hello darkness, my old friend\n" +
    //             "I've come to talk with you again\n" +
    //             "Because a vision softly creeping\n" +
    //             "Left its seeds while I was sleeping\n" +
    //             "And the vision that was planted in my brain\n" +
    //             "Still remains\n" +
    //             "Within the sound of silence";
    //
    //     System.out.println(text1);
    //
    //     //jdk13�е������ԣ�
    //     String text2 = """
    //             The Sound of silence
    //             Hello darkness, my old friend
    //             I've come to talk with you again
    //             Because a vision softly creeping
    //             Left its seeds while I was sleeping
    //             And the vision that was planted in my brain
    //             Still remains
    //             Within the sound of silence
    //             """;
    //     System.out.println();
    //     System.out.println(text2);
    //
    //     System.out.println(text1.length());
    //     System.out.println(text2.length());
    // }

    //html
    @Test
    public void test2(){
        String html1 = "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>java14������</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "    <p>hello,atguigu</p>\n" +
                "</body>\n" +
                "</html>";
        //jdk13�е������ԣ�
        // String html2 = """
        //         <html lang="en">
        //         <head>
        //             <meta charset="UTF-8">
        //             <title>java14������</title>
        //         </head>
        //         <body>
        //             <p>hello,atguigu</p>
        //         </body>
        //         </html>
        //         """;
    }

    //json
    @Test
    public void test3() {
        //jdk13֮ǰ��д��
        String myJson = "{\n" +
                "    \"name\":\"Song Hongkang\",\n" +
                "     \"address\":\"www.atguigu.com\",\n" +
                "    \"email\":\"shkstart@126.com\"\n" +
                "}";
        System.out.println(myJson);

        // //jdk13��������
        // String myJson1 = """
        //         {
        //             "name":"Song Hongkang",
        //              "address":"www.atguigu.com",
        //             "email":"shkstart@126.com"
        //         }""";
        // System.out.println(myJson1);
    }

    //sql
    @Test
    public void test4(){
        String sql = "SELECT id,NAME,email\n" +
                "FROM customers\n" +
                "WHERE id > 4\n" +
                "ORDER BY email DESC";

        // //jdk13�����ԣ�
        // String sql1 = """
        //         SELECT id,NAME,email
        //         FROM customers
        //         WHERE id > 4
        //         ORDER BY email DESC
        //         """;



    }
    //jdk14������
    // @Test
    // public void test5(){
    //     String sql1 = """
    //             SELECT id,NAME,email
    //             FROM customers
    //             WHERE id > 4
    //             ORDER BY email DESC
    //             """;
    //     System.out.println(sql1);
    //
    //     // \:ȡ�����в���
    //     // \s:��ʾһ���ո�
    //     String sql2 = """
    //             SELECT id,NAME,email \
    //             FROM customers\s\
    //             WHERE id > 4 \
    //             ORDER BY email DESC
    //             """;
    //     System.out.println(sql2);
    // }
}
