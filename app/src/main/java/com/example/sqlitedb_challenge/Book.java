package com.example.sqlitedb_challenge;

public class Book {
    private String name;
    private String description;
    private String AuthorName;

    private String ImageUrl;

    public Book(String name, String description, String authorName, String imageUrl) {
        this.name = name;
        this.description = description;
        AuthorName = authorName;
        ImageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthorName() {
        return AuthorName;
    }

    public void setAuthorName(String authorName) {
        AuthorName = authorName;
    }

    public String getImageUrl() {
        return ImageUrl;
    }

    public void setImageUrl(String imageUrl) {
        ImageUrl = imageUrl;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", AuthorName='" + AuthorName + '\'' +
                ", ImageUrl='" + ImageUrl + '\'' +
                '}';
    }
}
