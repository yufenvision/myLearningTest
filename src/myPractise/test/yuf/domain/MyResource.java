package myPractise.test.yuf.domain;

public class MyResource {
	private Long id;
	private String name;
	private String url;
	private String controller;
	
	public MyResource() {
		super();
	}
	
	public MyResource(Long id, String name, String url, String controller) {
		super();
		this.id = id;
		this.name = name;
		this.url = url;
		this.controller = controller;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getController() {
		return controller;
	}
	public void setController(String controller) {
		this.controller = controller;
	}
	@Override
	public String toString() {
		return "Resource [id=" + id + ", name=" + name + ", url=" + url + ", controller=" + controller + "]";
	}
	
}
