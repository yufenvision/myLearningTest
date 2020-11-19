package java_io.basic_io_use;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;

/**
 * @Author: dyf
 * @Date: 2019/6/20 15:29
 * @Description:
 */
public class FormattedMemoryInput {
    public static void main(String[] args) throws IOException{
        try {
            DataInputStream in = new DataInputStream(
                    new ByteArrayInputStream(
                            BufferedInputFile.read("E:/passVehicle.proto").getBytes()
                    )
            );
            while(true) {
                System.out.print((char) (in.readByte()));
            }
        }catch (EOFException e) {
            System.err.println("End of stream");
        }
    }
}
