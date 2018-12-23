package com.paloit.examples.camel.custom.feedly.api;

public class Feed {

    private String feedId;
    private String website;
    private String title;
    private long subscribers;
	
	public String getFeedId() {
		return feedId;
	}

	public void setFeedId(String feedId) {
		this.feedId = feedId;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public long getSubscribers() {
		return subscribers;
	}

	public void setSubscribers(long subscribers) {
		this.subscribers = subscribers;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Feed [feedId=");
		builder.append(feedId);
		builder.append(", website=");
		builder.append(website);
		builder.append(", title=");
		builder.append(title);
		builder.append(", subscribers=");
		builder.append(subscribers);
		builder.append("]");
		return builder.toString();
	}

	
}