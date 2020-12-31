package map.bean;

/**
 * @author Y.Z.Y
 * @date 2020/8/28 9:01
 * @description None.
 */
public class Car {

    private String id;
    private String model;//型号
    private String color;//颜色
    private String volume;//排量
    private int year;//年份

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
