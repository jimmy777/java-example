package annotation;

/**
 * @author Y.Z.Y
 * @date 2020/9/28 15:43
 * @description None.
 */
public class AnnotationTest {

    public static void main(String[] args) {

        try {
            Class<?> componentClass = Class.forName("annotation.UpperCaseComponent");
            if(componentClass.isAnnotationPresent(Component.class)) {
                Component component = componentClass.getAnnotation(Component.class);
                String identifier = component.identifier();

                System.out.println(String.format("Identifier for " + "annotation.UpperCaseComponent is ' %s '", identifier));
            } else {

                System.out.println("annotation.UpperCaseComponent is not annotated by annotation.Component.");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
