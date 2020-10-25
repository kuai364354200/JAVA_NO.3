# JAVA_NO.3
java第三次实验

一、实验目的：
（1）初步了解分析系统需求，从学生选课角度了解系统中的实体及其关系，学会定义类中的属性以及方法；
（2）掌握面向对象的类设计方法（属性、方法）；
（3）掌握类的继承用法，通过构造方法实例化对象；
（4）学会使用super()，用于实例化子类；
（5）掌握使用Object根类的toString（）方法,应用在相关对象的信息输出中。

二、业务要求：
            说明：学校有“人员”，分为“教师”和“学生”，教师教授“课程”，学生选择“课程”。从简化系统考虑，每名教师仅教授一门课程，每门课程的授课教师也仅有一位，每名学生选仅选一门课程。
            对象：
            人员（编号、姓名、性别）
            教师（编号、姓名、性别、所授课程）
            学生（编号、姓名、性别、所选课程）
            课程（编号、课程名称、上课地点、时间、授课教师）

三、实验要求：
            1.编写上述实体类以及测试主类（注意类之间继承关系的适用）
            2.在测试主类中，实例化多个类实体，模拟学生选课操作、打印课程信息（信息包括：编号、课程名称、上课地点、时间、授课教师 等）；模拟学生退课操作，再打印课程信息。
            3.编写实验报告。
            
四、核心代码：
这部分代码是与选课退课部分相关的代码，用scanner打开输入窗口，让用户输入123来选择课程，然后利用if先判断是否选到课，用while判断是否能退课（没选的课不能退），用break结束循环。最后         多用了一个if和else判断是否有输入错误，结束了之后把scanner关掉。
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
            Student o = new Student(2019310200, "王畅", 'M',a);
            System.out.println(o);

            System.out.println("输入1或者2选择继续选退课或者退出");
            int z = in.nextInt();
            while (z == 1) {
                System.out.println("继续选课");
                break;

            }
            if (z == 2) {
                flag = 0;
                System.out.println("退出");
            }
            else {
            	flag = 0;
            	System.out.println("输入错误！系统将自动退出！");
            }
         in.close();
        }
五、程序截图

    
