package us.codecraft.tinyioc;

/**
 * 用于bean的属性注入
 *
 * @author Sky
 * @Date 2021-03-26 16:45.
 */
public class PropertyValue {
    private final String name;
    private final Object value;

    public PropertyValue(String name, Object value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public Object getValue() {
        return value;
    }
}
