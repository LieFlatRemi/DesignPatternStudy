package Prototype.DeepCopy;


import java.util.Date;

//实现Video克隆
public class DeepCopyVideo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Date date = new Date();
        Video proto = new Video("设计模式原型模式",date);

        //从proto克隆
        Video copy = (Video) proto.clone();

        System.out.println(proto);
        System.out.println(copy);
        System.out.println(proto.hashCode());
        System.out.println(copy.hashCode());

        //深克隆
        date.setTime(999999);
        System.out.println(proto);
        System.out.println(copy);


    }
}
