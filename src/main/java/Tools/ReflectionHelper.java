package Tools;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by drygoi on 03.06.17.
 */
public class ReflectionHelper {

    public static List<Method> getMethodsAnnotatedWith(final Class<?> type, final Class<? extends Annotation> annotation, String value) {
        final List<Method> methods = new ArrayList<Method>();
        Class<?> cl = type;
        while (cl != Object.class) {
            //проходитм вверх вплоть до Object класса, для захвата всех родительских методов.
            final List<Method> allMethods = new ArrayList<Method>(Arrays.asList(cl.getDeclaredMethods()));
            for (final Method method : allMethods) {
                if (method.isAnnotationPresent(annotation) && method.getAnnotation(ActionTitle.class).name().equals(value)) {

                    methods.add(method);
                }
            }
            //шаг вверх до родителя
            cl = cl.getSuperclass();
        }
        return methods;
    }

    public static List<Field> getFieldsAnnotatedWith(final Class<?> type, final Class<? extends Annotation> annotation, String value) {
        final List<Field> fields = new ArrayList<Field>();
        Class<?> cl = type;
        while (cl != Object.class) {
            //проходитм вверх вплоть до Object класса, для захвата всех родительских полей.
            final List<Field> allFields = new ArrayList<Field>(Arrays.asList(cl.getDeclaredFields()));
            for (final Field field : allFields) {
                if (field.isAnnotationPresent(annotation) && field.getAnnotation(ActionTitle.class).name().equals(value)) {

                    fields.add(field);
                }
            }
            //шаг вверх до родителя
            cl = cl.getSuperclass();
        }
        return fields;
    }
}
