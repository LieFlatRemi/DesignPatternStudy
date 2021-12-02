package Prototype.DeepCopy;

import java.util.Date;

//实现一个接口
//重写一个方法
//深克隆：修改clone方法

public class Video implements Cloneable {
    private String name;
    private Date createTime;

    @Override
    public String toString() {
        return "Video{" +
                "name='" + name + '\'' +
                ", createTime=" + createTime +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Video() {
    }

    public Video(String name, Date createTime) {
        this.name = name;
        this.createTime = createTime;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object obj = super.clone();
        Video v  =(Video)obj;
        v.createTime = (Date) this.createTime.clone();  //将date属性也进行克隆
        return obj;
    }
}
