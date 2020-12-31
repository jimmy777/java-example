package annotation;

/**
 * @author Y.Z.Y
 * @date 2020/9/28 15:40
 * @description Component注解的实现类.
 */

@Component(identifier = "upper")
public class UpperCaseComponent {

    public String doWork(String input) {
        if(input != null){
            return input.toUpperCase();
        } else {
            return null;
        }

    }
}
