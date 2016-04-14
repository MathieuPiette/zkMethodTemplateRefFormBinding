package zk.method.template.ref.form.binding;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubBean {
    private Map<String,SubSubBean> subSubBeans;
    private List<String> strings;

    public SubBean() {
        strings = new ArrayList<String>() {
            private static final long serialVersionUID = 1L;

            {
                add("One");
                add("Two");
                add("Three");
                add("Four");
                add("Five");
                add("Six");
                add("Seven");
                add("Eight");
                add("Nine");
                add("Ten");
            }
        };
        subSubBeans = new HashMap<String,SubSubBean>();
    }

    public SubSubBean getSubSubBean(String key) {
        SubSubBean subSubBean = subSubBeans.get(key);
        if (subSubBean == null) {
            subSubBean = new SubSubBean();
            subSubBeans.put(key, subSubBean);
        }
        return subSubBean;
    }

    public Map<String,SubSubBean> getSubSubBeans() {
        return subSubBeans;
    }

    public void setSubSubBeans(Map<String,SubSubBean> subSubBeans) {
        this.subSubBeans = subSubBeans;
    }

    public List<String> getStrings() {
        return strings;
    }

    public void setStrings(List<String> strings) {
        this.strings = strings;
    }
}
