package tdd.args2;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: dyf
 * @Date: 2019/8/17 10:39
 * @Description:
 */
public class Args2 {
    private Schema schema;
    private Command command;

    public Args2(String schemas, String command) {
        this.schema = new Schema(schemas);
        this.command = new Command(command);
    }

    public Object parse(String name) {
        return schema.getValue(name, command.getValue(name));
    }
}
