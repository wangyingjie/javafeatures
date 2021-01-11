// package java13Test.src.com.atguigu.java;
//
// import org.junit.jupiter.api.Test;
//
// /**
//  * java 13�����ԣ�TextBlock ��Ԥ����
//  *
//  * @author shkstart
//  * @create 2019 ���� 3:00
//  */
// public class TextBlockTest {
//
//     @Test
//     public void test1() {
//         String html = "<html>\n" +
//                 "  <body>\n" +
//                 "      <p>Hello, �й��</p>\n" +
//                 "  </body>\n" +
//                 "</html>";
//         System.out.println(html);
//
//         System.out.println();
//
//         String html1 = """
//                 <html>
//                   <body>
//                       <p>Hello, �й��</p>
//                   </body>
//                 </html>
//                 """;
//         System.out.println(html1);
//     }
//
//     @Test
//     public void test2() {
//         String sql = "select employee_id,last_name,salary,department_id\n" +
//                 "from employees\n" +
//                 "where department_id in (40,50,60)\n" +
//                 "order by department_id asc";
//
//         System.out.println(sql);
//         String sql1 = """
//                 select employee_id,last_name,salary,department_id
//                 from employees
//                 where department_id in (40,50,60)
//                 order by department_id asc
//                 """;
//         System.out.println(sql1);
//     }
//
//     //����TextBlock�Ļ���ʹ��
//     @Test
//     public void test3() {
//         //�Կ�ʼ�ָ���������ֹ����ĵ�һ���ַ���ʼ
//         //�Խ����ָ����ĵ�һ��˫����֮ǰ�����һ���ַ�����
//         String text1 = """
//                 abc""";
//         String text2 = "abc";
//         System.out.println(text1 == text2);//text1��text2��ָ�����ַ�����������Ψһ�����abc������
//
//         String text3 = """
//                 abc
//                 """;
//         System.out.println(text1.length());//3
//         System.out.println(text3.length());//4
//     }
//
//     //���ַ����ı�ʾ
//     @Test
//     public void test4() {
//         String text1 = "";
//         System.out.println(text1.length());
//
//         String text2 = """
//                 """;
//         System.out.println(text2.length());
//     }
//
//     //�����д��
//     @Test
//     public void text5() {
// //        String a = """""";   // ��ʼ�ָ�����û������ֹ��
// //        String b = """ """;  // ��ʼ�ָ�����û������ֹ��
// //        String c = """
// //           ";        // û�н����ָ���
// //String d = """
// //        abc \ def
// //        """;      // ����δת��ķ�б�ߣ�����������ת�崦��
// //
// //        String e = "abc \ def";
//     }
//
//     //�������ڱ���ʱ��ɾ������Щ����Ŀո�
//     @Test
//     public void test6() {
//         String text1 = """
//                 abc
//                 """;
//         System.out.println(text1.length());//4
//     }
//
//     // ת���ַ�
//     @Test
//     public void test7() {
//         String html = """
//                 <html>
//                     <body>\n
//                         <p>Hello, world</p>\n
//                     </body>\n
//                 </html>\n
//                 """;
//         System.out.println(html);
//     }
//
//     //���ı���������ʹ��"�ǺϷ���
//     @Test
//     public void test8() {
//         String story = """
//                     "When I use a word," Humpty Dumpty said,
//                     in rather a scornful tone, "it means just what I
//                     choose it to mean - neither more nor less."
//                     "The question is," said Alice, "whether you
//                     can make words mean so many different things."
//                     "The question is," said Humpty Dumpty,
//                     "which is to be master - that's all."
//                 """;
//         System.out.println(story);
//
//         String code =
//                 """
//                         String text = \"""
//                             A text block inside a text block
//                         \""";
//                         """;
//         System.out.println(code);
//     }
//
//     //�ı�������
//     @Test
//     public void test9() {
//         String type = "String";
//         String code = """
//                 public void print(""" + type + """
//                  o) {
//                     System.out.println(Objects.toString(o));
//                 }
//                 """;
//         System.out.println(code);
//
//         //�Ľ����ɶ��Ը���  ---��ʽ1
//         String code1 = """
//                 public void print($type o) {
//                     System.out.println(Objects.toString(o));
//                 }
//                 """.replace("$type", type);
//         System.out.println(code1);
//
//         //��ʽ2
//         String code2 = String.format("""
//                 public void print(%s o) {
//                     System.out.println(Objects.toString(o));
//                 }
//                 """, type);
//         System.out.println(code2);
//
//         //��ʽ3
//         String code3 = """
//                 public void print(%s object) {
//                     System.out.println(Objects.toString(object));
//                 }
//                 """.formatted(type);
//         System.out.println(code3);
//     }
// }
