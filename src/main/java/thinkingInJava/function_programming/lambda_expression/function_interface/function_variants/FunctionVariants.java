package thinkingInJava.function_programming.lambda_expression.function_interface.function_variants;

import java.util.function.*;

/**
 * @Author: dyf
 * @Date: 2019/7/10 21:07
 * @Description:
 * 1. 如果只处理对象而非基本类型，名称为 Function，Consumer，Predicate 等。参数类型通过泛型添加。
 * 2. 如果是基本类型，则由名称的第一部分表示，如 LongConsumer，DoubleFunction，IntPredicate 等，但基本 Supplier 类型例外。
 * 3. 如果返回值为基本类型，则用 To 表示，如 ToLongFunction <T> 和 IntToLongFunction。
 * 4. 如果返回值类型与参数类型一致，则是一个运算符：单个参数使用 UnaryOperator，两个参数使用 BinaryOperator。
 * 5. 如果是 2 个参数且返回值为布尔值，则是一个谓词（Predicate）。
 * 6. 如果是两个参数类型不同，则名称中有一个 Bi。

 */
public class FunctionVariants {
    static Function<Foo, Bar> f1 = f -> new Bar(f);
    static IntFunction<IBaz> f2 = i -> new IBaz(i);
    static LongFunction<LBaz> f3 = l -> new LBaz(l);
    static DoubleFunction<DBaz> f4 = d -> new DBaz(d);
    static ToIntFunction<IBaz> f5 = ib -> ib.i;
    static ToLongFunction<LBaz> f6 = lb -> lb.l;
    static ToDoubleFunction<DBaz> f7 = db -> db.d;
    static IntToLongFunction f8 = i -> i;
    static IntToDoubleFunction f9 = i -> i;
    static LongToIntFunction f10 = l -> (int)l;
    static LongToDoubleFunction f11 = l -> l;
    static DoubleToIntFunction f12 = d -> (int)d;
    static DoubleToLongFunction f13 = d -> (long)d;

    public static void main(String[] args){
        Bar b = f1.apply(new Foo());
        IBaz ib = f2.apply(11);
        LBaz lb = f3.apply(11);
        DBaz db = f4.apply(11);
        int i = f5.applyAsInt(ib);
        long l = f6.applyAsLong(lb);
        double d = f7.applyAsDouble(db);
        l = f8.applyAsLong(12);
        d = f9.applyAsDouble(12);
        i = f10.applyAsInt(12);
        d = f11.applyAsDouble(12);
        i = f12.applyAsInt(13.0);
        l = f13.applyAsLong(13.0);
    }
}
