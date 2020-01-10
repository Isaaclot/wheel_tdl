import org.junit.Before;
import org.junit.Test;

import java.util.Objects;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

/**
 * IOC容器说明
 * 1. 管理对象的生命周期： 容器初始化的时候，创建对象，管理对象的依赖关系，销毁对象
 *
 * @author liangqian@vvic.com
 * @since 2020/1/10 11:08 PM
 */
public class IocContainerTest {
    IocContainer iocContainer;

    @Before
    public void init(){
        iocContainer = new IocContainer();
    }

    @Test
    public void create_obj_test(){
        iocContainer.createBean();
    }

    @Test
    public void get_bean_by_name_test(){
        Object o = iocContainer.get_bean_by_name("");
        assertThat(Objects.nonNull(o), is(true));
    }

    @Test
    public void destroy_bean_test(){
        boolean b = iocContainer.destroy_bean("");
        assertTrue(b);
    }


}
