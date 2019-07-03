package org.demo.mvch.model;

import javax.persistence.*;

@Entity
@Table(name="book_detail")
public class BookDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="book_detail_id")
    private Long book_detail_id;
    @Column(name="title")
    private String title;
    @Column(name="pages")
    private int pages;

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    @OneToOne(mappedBy = "bookDetail")
    private Book book;

    public BookDetail(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }

    public BookDetail() {
    }

    public Long getBook_detail_id() {
        return book_detail_id;
    }

    public void setBook_detail_id(Long book_detail_id) {
        this.book_detail_id = book_detail_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "BookDetail{" +
                "book_detail_id=" + book_detail_id +
                ", title='" + title + '\'' +
                ", pages=" + pages +
                '}';
    }
}
