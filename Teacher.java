package ʵ����;

public class Teacher  extends Person{
    String lesson;
    public Teacher(int number, String name, char sex, String lesson){
        super(number,name,sex);
        this.lesson = lesson;
    }
    public String toString(){
        return   "Teacher(��ʦ��Ϣ):" +"  ��ţ�" + number
                + "    ������" + name + "   �Ա�" + sex + "     ���ڿγ̣�" + lesson;
    }
}
