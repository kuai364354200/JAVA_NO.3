package ʵ����;

public class Student extends Person  {
    public Student(int number, String name, char sex,Course a){
        super(number,name,sex);
        this.a = a;
    }
    public String toString(){
        return  "\n" + "Student(ѧ����Ϣ):  ������" + name
                + "    ѧ�ţ�" + number + "   �Ա�" + sex + "\n" + "��ѡ�γ���Ϣ:   " + a;
    }

}
