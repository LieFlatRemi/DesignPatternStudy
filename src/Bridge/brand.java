package Bridge;

//品牌
interface Brand{
    public void info();
}

class Lenovo implements Brand{
    @Override
    public void info() {
        System.out.println("联想品牌");
    }
}

class Dell implements Brand{
    @Override
    public void info() {
        System.out.println("戴尔品牌");
    }
}




