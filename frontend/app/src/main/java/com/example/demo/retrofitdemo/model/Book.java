package com.example.demo.retrofitdemo.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Codemaker on 12/06/2021.
 */

public class Book {

    @SerializedName("isbn")
    private String isbn;
    @SerializedName("title")
    private String title;
    @SerializedName("subtitle")
    private String subtitle;
    @SerializedName("author")
    private String author;
    @SerializedName("published")
    private String published;
    @SerializedName("publisher")
    private String publisher;
    @SerializedName("pages")
    private Integer pages;
    @SerializedName("description")
    private String description;
    @SerializedName("website")
    private String website;
    @SerializedName("thumbnail")
    private String thumbnail;

    public Book() {
    }

    public Book(String isbn, String title, String subtitle, String author, String published, String publisher, Integer pages, String description, String website, String thumbnail) {
        this.isbn = isbn;
        this.title = title;
        this.subtitle = subtitle;
        this.author = author;
        this.published = published;
        this.publisher = publisher;
        this.pages = pages;
        this.description = description;
        this.website = website;
        this.thumbnail = thumbnail;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublished() {
        return published;
    }

    public void setPublished(String published) {
        this.published = published;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }
}
