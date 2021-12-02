package Composite;

public class Main {
    public static void main(String[] args) {
        //学校
        OrganizationComponent university = new University("摆烂大学", "躺平摸鱼");

        //学院
        OrganizationComponent Computer = new College("计算机学院", "秃头");
        OrganizationComponent Physics = new College("物理学院", "学不会");
        university.add(Computer);
        university.add(Physics);

        //专业
        OrganizationComponent compSci = new Department("计算机科学与技术", "大佬");
        OrganizationComponent softwareEng = new Department("软件工程", "牛马工程！");
        Computer.add(compSci);
        Computer.add(softwareEng);

        Physics.add(new Department("物理学","难学"));
        Physics.add(new Department("量子力学", "逆天"));

        university.print();
    }
}
