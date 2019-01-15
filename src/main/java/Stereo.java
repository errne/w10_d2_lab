import java.util.ArrayList;

public class Stereo {
    private String name;
    private ArrayList<Component> components;

    public Stereo(String name, ArrayList<Component> components) {
        this.name = name;
        this.components = components;
    }

    public ArrayList<Component> getComponents() {
        return components;
    }

    public Component getComponentByType(Class aclass) {
        for (Component component : components){
            if (component.getClass() == aclass) {
                return component;
            }
        }
        return null;
    }

    public Component getRadio() {
        return getComponentByType(Radio.class);
    }

    public Component getCD() {
        for (Component component : components){
            if (component.getClass() == Radio.class) {
                return component;
            }
        }
        return null;
    }
}
