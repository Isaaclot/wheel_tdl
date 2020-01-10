/**
 * task1: IOC 容器有什么行为?
 * 用测试的形式，把最简单的IOC容器的行为表述出来
 *
 * @author liangqian@vvic.com
 * @since 2020/1/11 1:37 AM
 */
public class IocContainer {

    public IocContainer() {
        // TODO: 2020/1/11 容器初始化，加载创建对象

    }

    public void createBean() {
        // TODO: 2020/1/11 创建容器对象

    }

    public Object get_bean_by_name(String beanName) {
        // TODO: 2020/1/11 获取bean

        return new Object();
    }

    public boolean destroy_bean(String s) {
        // TODO: 2020/1/11 销毁bean
        return true;
    }
}
