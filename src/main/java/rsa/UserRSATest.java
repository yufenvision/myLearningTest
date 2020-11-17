package rsa;

import com.google.gson.Gson;
import org.junit.Test;
import rsa.aes.AESTest;

/**
 * @Description:
 * @Author: dyf
 * @Date: 2020/11/17 14:50
 */
public class UserRSATest {

    static Gson gson = new Gson();

    @Test
    public void getAESEncrypt() throws Exception {
        String srcStr = "[{\"cjsj\":1603851231,\"dwid\":\"001\",\"inout\":\"in\",\"ywlsh\":\"f712b5f86712a982c19c427c698c2ac3\",\"xqid\":\"510411400000-003\"},{\"cjsj\":1603851291,\"dwid\":\"002\",\"inout\":\"out\",\"ywlsh\":\"f712b5f86712a982c19c427c698c2ac3\",\"xqid\":\"510411400000-003\"},{\"cjsj\":1603851351,\"dwid\":\"001\",\"inout\":\"in\",\"ywlsh\":\"f712b5f86712a982c19c427c698c2ac3\",\"xqid\":\"510411400000-003\"},{\"cjsj\":1603851411,\"dwid\":\"002\",\"inout\":\"out\",\"ywlsh\":\"f712b5f86712a982c19c427c698c2ac3\",\"xqid\":\"510411400000-003\"},{\"cjsj\":1603851471,\"dwid\":\"001\",\"inout\":\"in\",\"ywlsh\":\"f712b5f86712a982c19c427c698c2ac3\",\"xqid\":\"510411400000-003\"},{\"cjsj\":1603851531,\"dwid\":\"002\",\"inout\":\"out\",\"ywlsh\":\"f712b5f86712a982c19c427c698c2ac3\",\"xqid\":\"510411400000-003\"},{\"cjsj\":1603851591,\"dwid\":\"001\",\"inout\":\"in\",\"ywlsh\":\"f712b5f86712a982c19c427c698c2ac3\",\"xqid\":\"510411400000-003\"},{\"cjsj\":1603851651,\"dwid\":\"002\",\"inout\":\"out\",\"ywlsh\":\"f712b5f86712a982c19c427c698c2ac3\",\"xqid\":\"510411400000-003\"},{\"cjsj\":1603851711,\"dwid\":\"001\",\"inout\":\"in\",\"ywlsh\":\"f712b5f86712a982c19c427c698c2ac3\",\"xqid\":\"510411400000-003\"},{\"cjsj\":1603851771,\"dwid\":\"002\",\"inout\":\"out\",\"ywlsh\":\"f712b5f86712a982c19c427c698c2ac3\",\"xqid\":\"510411400000-003\"},{\"cjsj\":1603851831,\"dwid\":\"001\",\"inout\":\"in\",\"ywlsh\":\"f712b5f86712a982c19c427c698c2ac3\",\"xqid\":\"510411400000-003\"},{\"cjsj\":1603851891,\"dwid\":\"002\",\"inout\":\"out\",\"ywlsh\":\"f712b5f86712a982c19c427c698c2ac3\",\"xqid\":\"510411400000-003\"},{\"cjsj\":1603851951,\"dwid\":\"001\",\"inout\":\"in\",\"ywlsh\":\"f712b5f86712a982c19c427c698c2ac3\",\"xqid\":\"510411400000-003\"},{\"cjsj\":1603852011,\"dwid\":\"002\",\"inout\":\"out\",\"ywlsh\":\"f712b5f86712a982c19c427c698c2ac3\",\"xqid\":\"510411400000-003\"},{\"cjsj\":1603852071,\"dwid\":\"001\",\"inout\":\"in\",\"ywlsh\":\"f712b5f86712a982c19c427c698c2ac3\",\"xqid\":\"510411400000-003\"},{\"cjsj\":1603852131,\"dwid\":\"002\",\"inout\":\"out\",\"ywlsh\":\"f712b5f86712a982c19c427c698c2ac3\",\"xqid\":\"510411400000-003\"},{\"cjsj\":1603852191,\"dwid\":\"001\",\"inout\":\"in\",\"ywlsh\":\"f712b5f86712a982c19c427c698c2ac3\",\"xqid\":\"510411400000-003\"},{\"cjsj\":1603852251,\"dwid\":\"002\",\"inout\":\"out\",\"ywlsh\":\"f712b5f86712a982c19c427c698c2ac3\",\"xqid\":\"510411400000-003\"},{\"cjsj\":1603852311,\"dwid\":\"001\",\"inout\":\"in\",\"ywlsh\":\"f712b5f86712a982c19c427c698c2ac3\",\"xqid\":\"510411400000-003\"},{\"cjsj\":1603852371,\"dwid\":\"002\",\"inout\":\"out\",\"ywlsh\":\"f712b5f86712a982c19c427c698c2ac3\",\"xqid\":\"510411400000-003\"},{\"cjsj\":1603852431,\"dwid\":\"001\",\"inout\":\"in\",\"ywlsh\":\"f712b5f86712a982c19c427c698c2ac3\",\"xqid\":\"510411400000-003\"},{\"cjsj\":1603852491,\"dwid\":\"002\",\"inout\":\"out\",\"ywlsh\":\"f712b5f86712a982c19c427c698c2ac3\",\"xqid\":\"510411400000-003\"},{\"cjsj\":1603852551,\"dwid\":\"001\",\"inout\":\"in\",\"ywlsh\":\"f712b5f86712a982c19c427c698c2ac3\",\"xqid\":\"510411400000-003\"},{\"cjsj\":1603852611,\"dwid\":\"002\",\"inout\":\"out\",\"ywlsh\":\"f712b5f86712a982c19c427c698c2ac3\",\"xqid\":\"510411400000-003\"},{\"cjsj\":1603852671,\"dwid\":\"001\",\"inout\":\"in\",\"ywlsh\":\"f712b5f86712a982c19c427c698c2ac3\",\"xqid\":\"510411400000-003\"},{\"cjsj\":1603852731,\"dwid\":\"002\",\"inout\":\"out\",\"ywlsh\":\"f712b5f86712a982c19c427c698c2ac3\",\"xqid\":\"510411400000-003\"},{\"cjsj\":1603852791,\"dwid\":\"001\",\"inout\":\"in\",\"ywlsh\":\"f712b5f86712a982c19c427c698c2ac3\",\"xqid\":\"510411400000-003\"},{\"cjsj\":1603852851,\"dwid\":\"002\",\"inout\":\"out\",\"ywlsh\":\"f712b5f86712a982c19c427c698c2ac3\",\"xqid\":\"510411400000-003\"},{\"cjsj\":1603852911,\"dwid\":\"001\",\"inout\":\"in\",\"ywlsh\":\"f712b5f86712a982c19c427c698c2ac3\",\"xqid\":\"510411400000-003\"},{\"cjsj\":1603852971,\"dwid\":\"002\",\"inout\":\"out\",\"ywlsh\":\"f712b5f86712a982c19c427c698c2ac3\",\"xqid\":\"510411400000-003\"},{\"cjsj\":1603853031,\"dwid\":\"001\",\"inout\":\"in\",\"ywlsh\":\"f712b5f86712a982c19c427c698c2ac3\",\"xqid\":\"510411400000-003\"},{\"cjsj\":1603853091,\"dwid\":\"002\",\"inout\":\"out\",\"ywlsh\":\"f712b5f86712a982c19c427c698c2ac3\",\"xqid\":\"510411400000-003\"},{\"cjsj\":1603853151,\"dwid\":\"001\",\"inout\":\"in\",\"ywlsh\":\"f712b5f86712a982c19c427c698c2ac3\",\"xqid\":\"510411400000-003\"},{\"cjsj\":1603853211,\"dwid\":\"002\",\"inout\":\"out\",\"ywlsh\":\"f712b5f86712a982c19c427c698c2ac3\",\"xqid\":\"510411400000-003\"},{\"cjsj\":1603853271,\"dwid\":\"001\",\"inout\":\"in\",\"ywlsh\":\"f712b5f86712a982c19c427c698c2ac3\",\"xqid\":\"510411400000-003\"},{\"cjsj\":1603853331,\"dwid\":\"002\",\"inout\":\"out\",\"ywlsh\":\"f712b5f86712a982c19c427c698c2ac3\",\"xqid\":\"510411400000-003\"},{\"cjsj\":1603853391,\"dwid\":\"001\",\"inout\":\"in\",\"ywlsh\":\"f712b5f86712a982c19c427c698c2ac3\",\"xqid\":\"510411400000-003\"},{\"cjsj\":1603853451,\"dwid\":\"002\",\"inout\":\"out\",\"ywlsh\":\"f712b5f86712a982c19c427c698c2ac3\",\"xqid\":\"510411400000-003\"},{\"cjsj\":1603853511,\"dwid\":\"001\",\"inout\":\"in\",\"ywlsh\":\"f712b5f86712a982c19c427c698c2ac3\",\"xqid\":\"510411400000-003\"},{\"cjsj\":1603853571,\"dwid\":\"002\",\"inout\":\"out\",\"ywlsh\":\"f712b5f86712a982c19c427c698c2ac3\",\"xqid\":\"510411400000-003\"}]";
        System.out.println(gson.toJson(srcStr));
        String key = "1234567890123456";
        String result1 = AESTest.encrypt(srcStr, key);
        System.out.println(gson.toJson(result1));

        String result2 = AESTest.decrypt(result1, key);
        System.out.println(gson.toJson(result2));
    }


    @Test
    public void getPublicEncrypt() throws Exception {
        String srcStr = "1234567890123456";
        String publicKeyGongAn = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCdogzvuupy8MKJEhgQV0/7q4bIbzf+t2tnWRwb+2np+73rs255ysguBhK7fDETtBjV1Y23Pnz4xPVfaFYV636WM/zXZeJuQHxqaSbxo74GYlJ8MtI9jjEnD0HwmHZuexQozNxIkwbGBUKkfiTFGkEFnXcj4P71K14oj/zUQ/VpJQIDAQAB";
//        String publicKey = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA1ByRVqdLkMFE0a4XMQ2zNq1DH1nlBQIPsEoLWONjsrMnNs9GEIK2d3YUxwbspActXwIa8KJnsdmkVDDpbIMC8wrx/s3owI4RGxb7QoreL5Orfa+HEv7ENSNynw3dzayrwn7wiOWJ2e48JNMdBH1NuZKOewBPgm7xeRr1W/dG5dn46ekA7EvEbTqjsFWvZGyegvAxU84Y7OVlEaTzg/M0xhZVsplFAq9l7F3Zb0JjoUx7Wg66mXOiEiOebo+n7uZuquq0J+5ZNanBXrjgcORliB8WgwDDN4mRP0y2GPcfGFQpnQMh9PJ0qDim/12Dhm9IqW6EaymeupgVeulOkHDvGwIDAQAB";
        String publicKey2 = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA1ByRVqdLkMFE0a4XMQ2zNq1DH1nlBQIPsEoLWONjsrMnNs9GEIK2d3YUxwbspActXwIa8KJnsdmkVDDpbIMC8wrx/s3owI4RGxb7QoreL5Orfa+HEv7ENSNynw3dzayrwn7wiOWJ2e48JNMdBH1NuZKOewBPgm7xeRr1W/dG5dn46ekA7EvEbTqjsFWvZGyegvAxU84Y7OVlEaTzg/M0xhZVsplFAq9l7F3Zb0JjoUx7Wg66mXOiEiOebo+n7uZuquq0J+5ZNanBXrjgcORliB8WgwDDN4mRP0y2GPcfGFQpnQMh9PJ0qDim/12Dhm9IqW6EaymeupgVeulOkHDvGwIDAQAB";
        String privateKey2 = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQDUHJFWp0uQwUTRrhcxDbM2rUMfWeUFAg+wSgtY42Oysyc2z0YQgrZ3dhTHBuykBy1fAhrwomex2aRUMOlsgwLzCvH+zejAjhEbFvtCit4vk6t9r4cS/sQ1I3KfDd3NrKvCfvCI5YnZ7jwk0x0EfU25ko57AE+CbvF5GvVb90bl2fjp6QDsS8RtOqOwVa9kbJ6C8DFTzhjs5WURpPOD8zTGFlWymUUCr2XsXdlvQmOhTHtaDrqZc6ISI55uj6fu5m6q6rQn7lk1qcFeuOBw5GWIHxaDAMM3iZE/TLYY9x8YVCmdAyH08nSoOKb/XYOGb0ipboRrKZ66mBV66U6QcO8bAgMBAAECggEBANG6wZad6qDiCQsPCU1uj3KT1RfNyh6ukBau0BN/G1hZvn96aXvv0z3B2v+EgD4b/qe/rCWdX8zCN7MrfdLWo/bvLqLUtLyYfJ99lMmSB+mhKOMoyPVmRVmJiE9u5Y71mgvBelLSLAD5iCydNkb3IwBHwmwqvXNqAYfOuSbLFSY1F9gFIoUxW1EjOaoZBbqRaXF9ESTK/Dlb93lGj56WchMNkRkv8BjsGx//gw39cUdt5lvnFXWIBOpyd7EUGzqmsSU4rc5XUUk5Lbt9FRSgOPF9UG7T7DUf7NKdFUOGAY0Ufmk07QTSsMfJGxivQt4UQm0xFEUEim54yXRdwIMaaukCgYEA+p1Y6FpFjx94HuPaTTrdFUwsaEAvcqR798g85NoFikT9vYjyIMFkCRyh+7KIl7BXtfE0LvJn6a9K1c/bD24aDo7GOxFL+cx/h8gu7OuwqtGLqkvSP+EslzCHyIKSgi2ga/I5IWxGFVJrdByAzZt7EGafSX0D8Dk2UFFcpobPklcCgYEA2KtpcAnTSptt+UKHn3oCXudjYKXvm7SzJBgFOwcnQjIeMxrAUkOHk6UPtmpTuZ135BQax7bfr4Lmbaf+d0iqSnQNCsnvCOM1KARsoMLihf6ArHZ/8x081NFPkcMl1pxCev6qe9Dg+L/KnplTOJ7fqLk/xpkMi+P8p+117ehg9t0CgYEA+DiGicR3ZtWldPr7CklGFkUXKr6AAE2YF4g1f/nNSPEiXOrZ3sWNHlVEvvZKwetARI29wM4JS/R566Hu9652knqpLnHoTWdV3RfSGokqt1XKvoZQnUKalrjTlC53jAZDAQetvEPwekfi8+MTVBIuZsUt+WygTPttp0meubWGvAsCgYB1rRNE4HE7UhN2j2WtfcyP0sgsk7MBNDEfZ1Rf7NCrqSCxzNOrWjXmQH26KyFx7E5TN4Ab+/ydDFEuOVGBY5vpeAIlW+tRPmV+aHi/D1mMQN+Ny4ZOehCx3USD/CMu3gtVVb8uJBIrx666WLfURqVes84phLJFv/tXESc9oToYmQKBgBi53n5i/3ti/QNaBXV3iGXwxFWUje5aUONiUmkuR8cr9bV8+XhyIVW2+0Y+kIZVYQgv+b4VSxkLyaCgck01z9GrGcJdKDssKmZuuDmAIg3d8HVdxCFj1k6BhmY6cHOXQQCEPTD8dhvVyBAGq66l8x7/bP5HpclXf3m0VK2T13k9";

        String enResult = RSAUtilBase64.encrypt(srcStr, publicKeyGongAn);
        System.out.println(enResult);

        String enResult2 = RSAUtilBase64.encrypt(srcStr, publicKey2);
        System.out.println(enResult2);
        String deResult = RSAUtilBase64.decrypt(enResult2, privateKey2);
        System.out.println(deResult);
    }

}
