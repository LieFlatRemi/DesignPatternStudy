package Builder;

public class Worker implements builder {
    private Product product;

    public Worker(){
        this.product = new Builder.Product();
    }

    @Override
    public void Step01() {
        product.setBuildA("地基");
        System.out.println(product.getBuildA());
    }

    @Override
    public void Step02() {
        product.setBuildA("钢筋");
        System.out.println(product.getBuildB());
    }

    @Override
    public void Step03() {
        product.setBuildA("水泥");
        System.out.println(product.getBuildC());
    }

    @Override
    public void Step04() {
        product.setBuildA("粉刷");
        System.out.println(product.getBuildD());
    }

    @Override
    public Product getProduct() {
        return product;
    }
}
