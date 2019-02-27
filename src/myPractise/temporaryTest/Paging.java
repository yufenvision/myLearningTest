package myPractise.temporaryTest;

import java.util.ArrayList;
import java.util.List;

public class Paging<T>{
	private Integer firstPage = 1;
	private Integer endPage;
	private Integer nextPage;
	private Integer prePage;
	private Integer totalPage;
	//以下三个需要从外部获取
	private Integer currentPage;
	private Integer pageSize;
	private Integer totalCount;

	
	
	public Paging(Integer currentPage, Integer pageSize, Integer totalCount) {
		this.currentPage = currentPage;
		this.pageSize = pageSize;
		this.totalCount = totalCount;
		
		this.totalPage = this.totalCount%this.pageSize>0 ? this.totalCount/this.pageSize+1:this.totalCount/this.pageSize;
		this.endPage = this.totalPage;
		this.prePage = this.currentPage-1<1?1:this.currentPage-1;
		this.nextPage = this.currentPage+1>this.totalPage?this.endPage:this.currentPage+1;
		
	}



	List<T> list = new ArrayList<>();
}
