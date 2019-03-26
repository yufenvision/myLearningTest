package myTest.anytest;

public enum EnumTest {
	MYSQL("mysql"),
    MARIADB("mariadb"),
    ORACLE("oracle"),
    DB2("db2"),
    H2("h2"),
    HSQL("hsql"),
    SQLITE("sqlite"),
    SQL_SERVER("sql_server"),
    POSTGRE_SQL("postgre_sql"),
    OTHER("other db");
	
	private final String value;
	
	EnumTest(String value){
		this.value = value;
	}
	
	public String toString(){
		return value;
	}
}
