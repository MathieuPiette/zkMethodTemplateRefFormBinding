package zk.method.template.ref.form.binding;

import java.util.ArrayList;
import java.util.List;

import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.Init;
import org.zkoss.bind.annotation.NotifyChange;

public class MyViewModel {

    private List<MainBean> beans;
    private MainBean selectedBean;

    @Init
    public void init() {
        beans = new ArrayList<MainBean>() {
            private static final long serialVersionUID = 1L;

            {
                add(new MainBean("Bean 1"));
                add(new MainBean("Bean 2"));
                add(new MainBean("Bean 3"));
            }
        };
        setSelectedBean(beans.get(0));
    }

    public List<MainBean> getBeans() {
        return beans;
    }

    public MainBean getSelectedBean() {
        return selectedBean;
    }

    public void setSelectedBean(MainBean selectedBean) {
        this.selectedBean = selectedBean;
    }

    @Command
    public void save() {

    }

    @Command
    @NotifyChange("beans")
    public void add() {
        String name = "Bean " + (beans.size() + 1);
        beans.add(new MainBean(name));
    }
}
