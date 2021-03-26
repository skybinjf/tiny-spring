package us.codecraft.tinyioc;

import java.util.ArrayList;
import java.util.List;

/**
 * 包装一个对象所有的PropertyValue。<br/>
 * 为什么封装而不是直接用 List？因为可以封装一些操作
 *
 * @author Sky
 * @Date 2021-03-26 16:43.
 */
public class PropertyValues {

    private final List<PropertyValue> propertyValueList = new ArrayList<PropertyValue>(16);

    public PropertyValues(){}

    public void addPropertyValue(PropertyValue propertyValue) {
        //TODO: 这里可以对于重复propertyName进行判断，直接用list没法做到
        this.propertyValueList.add(propertyValue);
    }

    public List<PropertyValue> getPropertyValueList() {
        return this.propertyValueList;
    }
}
