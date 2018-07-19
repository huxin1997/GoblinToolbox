package com.hx.toolbox.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "category", schema = "tools", catalog = "")
public class CategoryEntity {
    private int typeId;
    private String name;
    private Integer typeParent;

    @Id
    @Column(name = "type_id")
    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "type_parent")
    public Integer getTypeParent() {
        return typeParent;
    }

    public void setTypeParent(Integer typeParent) {
        this.typeParent = typeParent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CategoryEntity that = (CategoryEntity) o;
        return typeId == that.typeId &&
                Objects.equals(name, that.name) &&
                Objects.equals(typeParent, that.typeParent);
    }

    @Override
    public int hashCode() {

        return Objects.hash(typeId, name, typeParent);
    }
}
