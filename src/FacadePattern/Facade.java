package FacadePattern;

public class Facade {
    private Television television;
    private Fan fan;
    private AirConditioner ac;
    private Light[] lights;

    public Facade() {
        television = new Television();
        fan = new Fan();
        ac = new AirConditioner();
        String[] positions = new String[]{"东", "南", "西", "北"};
        lights = new Light[4];
        for (int i = 0; i < 4; i++) {
            lights[i] = new Light(positions[i]);
        }
    }

    public void on(){
        System.out.println("电源总开关开启");
        television.on();
        fan.on();
        ac.on();
        for(Light light : lights){
            light.on();
        }
    }

    public void off(){
        System.out.println("电源总开关关闭");
        television.off();
        fan.off();
        ac.off();
        for(Light light : lights){
            light.off();
        }
    }
}
