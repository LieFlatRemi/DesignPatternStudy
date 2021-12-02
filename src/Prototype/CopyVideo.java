package Prototype;


import java.util.Date;

//实现Video克隆
public class CopyVideo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Date date = new Date();
        Video proto = new Video("设计模式原型模式",date);

        //从proto克隆
        Video copy = (Video) proto.clone();

        System.out.println(proto);
        System.out.println(copy);
        System.out.println(proto.hashCode());
        System.out.println(copy.hashCode());

        //验证：clone为浅克隆
        date.setTime(999999);
        System.out.println(proto);
        System.out.println(copy);       //发现proto和copy的date值全部改变，说明两个对象的date指向同一个date对象

        //解决：修改clone方法，参见deepcopy包
    }
}
