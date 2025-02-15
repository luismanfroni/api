package br.org.restaurantepopular.entity;

import java.util.Objects;

public class Category {

    private String id;
    private String name;
    private String description;

    public Category(String id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public static class CategoryBuilder {

        private String id;
        private String name;
        private String description;

        public CategoryBuilder() {
        }

        public CategoryBuilder id(final String id) {
            this.id = id;
            return this;
        }

        public CategoryBuilder name(final String name) {
            this.name = name;
            return this;
        }

        public CategoryBuilder description(final String description) {
            this.description = description;
            return this;
        }

        public Category build() {
            return new Category(id, name, description);
        }
    }

    @Override
    public String toString() {
        return "Category{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Category category = (Category) o;
        return Objects.equals(getId(), category.getId()) &&
                Objects.equals(getName(), category.getName()) &&
                Objects.equals(getDescription(), category.getDescription());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getDescription());
    }
}
