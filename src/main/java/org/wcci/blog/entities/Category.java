package org.wcci.blog.entities;

import javax.persistence.*;
import java.util.Collection;
import javax.persistence.OneToMany;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import java.util.Objects;

@Entity
public class Category {

    @Id
    @GeneratedValue
    private long id;
    private String categoryName;

    @OneToMany(mappedBy = "category")
    private Collection<Post> posts;

    protected Category(){}

    public Category(String categoryName) {
       this.categoryName = categoryName;

    }

    public String getCategoryName(){return categoryName;}
    public Collection<Post> getPosts(){ return posts;}
    public long getId(){ return id;  }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Category category = (Category) o;
        return Objects.equals(id, category.id) &&
                Objects.equals(categoryName, category.categoryName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, categoryName);
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", categoryName='" + categoryName + '\'' +
                '}';
    }
}