package com.sparrow.protocol;

public class SimpleItemDTO {
    private Long id;
    private String title;
    private String url;
    private String more;
    private String author;
    private Long authorId;
    private String formatDate;
    private String summary;
    private String coverImage;
    private Integer like;
    private Integer disLike;

    public SimpleItemDTO() {
    }

    public SimpleItemDTO(Long id, String title, String url, String more, String author, String formatDate, String summary, String coverImage,Integer like,Integer disLike) {
        this.id = id;
        this.title = title;
        this.url = url;
        this.more = more;
        this.author = author;
        this.formatDate = formatDate;
        this.summary = summary;
        this.coverImage = coverImage;
        this.like=like;
        this.disLike=disLike;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMore() {
        return more;
    }

    public void setMore(String more) {
        this.more = more;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getFormatDate() {
        return formatDate;
    }

    public void setFormatDate(String formatDate) {
        this.formatDate = formatDate;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getCoverImage() {
        return coverImage;
    }

    public void setCoverImage(String coverImage) {
        this.coverImage = coverImage;
    }

    public Integer getLike() {
        return like;
    }

    public void setLike(Integer like) {
        this.like = like;
    }

    public Integer getDisLike() {
        return disLike;
    }

    public void setDisLike(Integer disLike) {
        this.disLike = disLike;
    }

    public Long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Long authorId) {
        this.authorId = authorId;
    }
}
