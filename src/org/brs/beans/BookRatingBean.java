package org.brs.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "bookRatingBean")
@SessionScoped
public class BookRatingBean {

	private String reviewHeading;
	private String numberOfStars;
	private String comments;
	private String pros;
	private String cons;
	private String bestFor;
	private String bottomline;
	
	public String getReviewHeading() {
		return reviewHeading;
	}

	public void setReviewHeading(String reviewHeading) {
		this.reviewHeading = reviewHeading;
	}

	public String getNumberOfStars() {
		return numberOfStars;
	}

	public void setNumberOfStars(String numberOfStars) {
		this.numberOfStars = numberOfStars;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getPros() {
		return pros;
	}

	public void setPros(String pros) {
		this.pros = pros;
	}

	public String getCons() {
		return cons;
	}

	public void setCons(String cons) {
		this.cons = cons;
	}

	public String getBestFor() {
		return bestFor;
	}

	public void setBestFor(String bestFor) {
		this.bestFor = bestFor;
	}

	public String getBottomline() {
		return bottomline;
	}

	public void setBottomline(String bottomline) {
		this.bottomline = bottomline;
	}

	public String loguot() {

		return "loginPage.xhtml?faces-redirect=true";

	}

	public void clearValues() {
		
	}

}