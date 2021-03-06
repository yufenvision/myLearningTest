package designmode.behavioral_mode.template_method;

/**
 * @Description:
 * @Author: dyf
 * @Date: 2021/1/19 13:10
 * Spring 中 jdbcTemplate、hibernateTemplate 等以 Template 结尾的对数据库操作的类，它们就使用到了模板模式。
 * 一般情况下，我们都是使用继承的方式来实现模板模式，但是 Spring 并没有使用这种方式，而是使用Callback 模式与模板方法模式配合，既达到了代码复用的效果，同时增加了灵活性。
 *
 */
public class TemplateImpl extends Template {
    @Override
    protected void PrimitiveOperation2() {
        //当前类实现
        System.out.println("TemplateImpl实现类PrimitiveOperation2方法实现");
    }

    @Override
    protected void PrimitiveOperation3() {
        //当前类实现
        System.out.println("TemplateImpl实现类PrimitiveOperation3方法实现");
    }

    public static void main(String[] args) {
        Template template = new TemplateImpl();
        template.TemplateMethod();
    }
}
