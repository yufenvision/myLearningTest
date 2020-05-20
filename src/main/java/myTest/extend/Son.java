package myTest.extend;

public class Son extends Father{
	
	
	private String sonName;

	public String getSonName() {
		return sonName;
	}

	public void setSonName(String sonName) {
		this.sonName = sonName;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Son: {").append("[sonName=" + sonName + "]").append(super.toString());
		sb.append("}");
		return sb.toString();
	}
	
	
	
}
