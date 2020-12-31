package map;

import com.sun.deploy.util.StringUtils;
import map.bean.Car;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Y.Z.Y
 * @date 2020/8/28 9:01
 * @description None.
 */
public class MapTools {

    public static void main(String[] args) throws IllegalAccessException {
        Car car = new Car();
        car.setId("00000");
        car.setColor("black");
        car.setModel("bmw x5");
        car.setVolume("3.0L");
        car.setYear(2018);

        System.out.println(objectToMap(car));
    }

    private static Map<String, Object> objectToMap(Object obj) throws IllegalAccessException {
        Map<String, Object> map = new HashMap<String,Object>();
        Class<?> clazz = obj.getClass();
        for (Field field : clazz.getDeclaredFields()) {
            field.setAccessible(true);
            String fieldName = field.getName();
            Object value = StringUtils.nvl(field.get(obj));
            map.put(fieldName, value);
        }
        return map;
    }
}
