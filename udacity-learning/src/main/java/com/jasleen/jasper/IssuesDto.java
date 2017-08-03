package com.jasleen.jasper;

public class IssuesDto {
	
	private long id;
	
	private String department;
	
	private String issueName;
	
	private String issueCategory;
	
	private String issue;
	
	private String description;

	public IssuesDto(long id, String department, String issueName, String issueCategory, String issue,
			String description) {
		super();
		this.id = id;
		this.department = department;
		this.issueName = issueName;
		this.issueCategory = issueCategory;
		this.issue = issue;
		this.description = description;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getIssueName() {
		return issueName;
	}

	public void setIssueName(String issueName) {
		this.issueName = issueName;
	}

	public String getIssueCategory() {
		return issueCategory;
	}

	public void setIssueCategory(String issueCategory) {
		this.issueCategory = issueCategory;
	}

	public String getIssue() {
		return issue;
	}

	public void setIssue(String issue) {
		this.issue = issue;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	 public Object clone() throws CloneNotSupportedException {
	  return super.clone();
	 }	
}
