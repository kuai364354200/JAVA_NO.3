package 实验三;
import java.util.Scanner;

public class test {
	public static void main(String[] args) {
        int flag = 1;
        Course s = null;
        Scanner in = new Scanner(System.in);
        while (flag == 1) {
            Course a = s;      //对a进行初始化赋值
            Student w = new Student(201913131, "张三", 'M',a);
            System.out.println("学生信息");
            System.out.println(w);
            Teacher b= new Teacher(1, "游xu", 'M', "高等数学");
            Teacher c = new Teacher(2, "微微", 'M', "离散数学");
            Teacher d = new Teacher(3, "周一鸣", 'W', "模拟电路");
            System.out.println("教师信息");
            System.out.println(b);
            System.out.println(c);
            System.out.println(d);
            Course e = new Course("高等数学", 7, "101", 10, 2);
            Course f = new Course("离散数学", 8, "102", 123, 3);
            Course g = new Course("模拟电路", 9, "103", 9999, 4);
            System.out.println("课程信息");
            System.out.println(e);
            System.out.println(f);
            System.out.println(g);
            System.out.println("请输入1,2,3进行选课: ");
            int x = in.nextInt();// Scanner 类来获取用户的输入
            if (x == 1) {
                a = e;
                System.out.println("已选课: " + e);
                System.out.println(b);
            } else if (x == 2) {
                a = f;
                System.out.println("已选课: " + f);
                System.out.println(c);
            } else if (x == 3) {
                a = g;
                System.out.println("已选课: " + g);
                System.out.println(d);
            } else {
                System.out.println("未查到课程");
            }
            Student n = new Student(201913131, "奥里给", 'M',a);
            System.out.println(n);

            System.out.println("请输入1,2,3进行选课: ");
            int y = in.nextInt();
            while (x == 1)      //确保只能退已选课程
                if (y == 1) {
                    a = null;
                    System.out.println("已退课: " + e);
                    System.out.println(b);
                    break;
                } else {
                    System.out.println("未查到已选该课程，无法退课");
                    s = e;
                    break;
                }

            while (x == 2)
                if (y == 2) {
                    a = null;
                    System.out.println("已退课: " + f);
                    System.out.println(c);
                    break;
                } else {
                    System.out.println("未查到已选该课程，无法退课");
                    s = f;
                    break;
                }

            while (x == 3)
                if (y == 3) {
                    a = null;
                    System.out.println("已退课: " + g);
                    System.out.println(d);
                    break;
                } else {
                    System.out.println("未查到已选该课程，无法退课");
                    s = g;
                    break;
                }
            Student o = new Student(201913131, "奥里给", 'M',a);
            System.out.println(o);

            System.out.println("输入1或者2选择继续选退课或者退出");
            int z = in.nextInt();
            int abc = 1;
            while (abc == 1) {
                if(z == 1){
                    System.out.println("继续选课");
                    break;
                }
                if (z == 2) {
                    flag = 0;
                    System.out.println("退出");
                    break;
                }
                else {
                    flag = 0;
                    System.out.println("输入错误！系统将自动退出！");
                    break;
                }


            }
        }
        in.close();
    }
}
