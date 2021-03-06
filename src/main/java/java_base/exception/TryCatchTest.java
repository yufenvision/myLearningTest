package java_base.exception;
/**
* @author 作者 dyf:
* @version 创建时间：2019年1月24日 下午10:53:21
* 类说明
*/
public class TryCatchTest {
	
	boolean testEx() throws Exception{
	    boolean ret = true;
	    try{
	        ret =testEx1();
	    }catch (Exception e){
	        System.out.println("testEx,catch java_base.exception");
	        ret =false;
	        throw e;
	    }finally{
	        System.out.println("testEx,finally; return value=" + ret);
	        return ret;
	    }
	}
	boolean testEx1() throws Exception{
	    boolean ret = true;
	    try{
	        ret =testEx2();
	        if(!ret){
	            return false;
	        }
	        System.out.println("testEx1,at the end of try");
	        return ret;
	    }catch (Exception e){
	        System.out.println("testEx1,catch java_base.exception");
	        ret =false;
	        throw e;
	    }finally{
	        System.out.println("testEx1,finally; return value=" + ret);
	        return ret;
	    }
	}
	boolean testEx2() throws Exception{
	    boolean ret = true;
	    try{
	        int b =12;
	        int c;
	        for(int i = 2; i >= -2; i--){
	            c= b / i;
	            System.out.println("i="+ i);
	        }
	        return true;
	    }catch (Exception e){
	        System.out.println("testEx2,catch java_base.exception");
	        ret =false;
	        throw e;
	    }finally{
	        System.out.println("testEx2,finally; return value=" + ret);
	        return ret;
	    }
	}
	
	public static void main(String[] args){
		TryCatchTest testException1 =new TryCatchTest();
	    try{
	        testException1.testEx();
	    }catch (Exception e){
	        e.printStackTrace();
	    }
	    
	    /*
	     * i=2
	     * i=1
	     * testEx2,catch java_base.exception
	     * testEx2,finally; return value=false
	     * testEx1,finally; return value=false
	     * testEx,finally; return value=false
	     */
	    /*
	     * i=2
	     * i=1
	     * System.out.println("testEx2,catch java_base.exception");
	     * e
	     * System.out.println("testEx2,finally; return value=" + ret);
	     * System.out.println("testEx1,catch java_base.exception");
	     * e
	     * System.out.println("testEx1,finally; return value=" + ret);
	     * System.out.println("testEx,catch java_base.exception");
	     * throw e;
	     * System.out.println("testEx1,finally; return value=" + ret);
	     * false
	     */
	    
	    
	}
		
		
}
