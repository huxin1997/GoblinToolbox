package com.hx.toolbox.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.util.Objects;


@Entity
@ToString
@Table(name = "tool", schema = "tools", catalog = "")
public class ToolEntity {
    private int id;
    private String toolName;
    private String toolLink;
    private Integer toolType;
    private String seoKeywords;
    private String seoDescription;
    private String toolImg;


    private ToolCodeEntity toolCode;


    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "tool_name")
    public String getToolName() {
        return toolName;
    }

    public void setToolName(String toolName) {
        this.toolName = toolName;
    }

    @Basic
    @Column(name = "tool_link")
    public String getToolLink() {
        return toolLink;
    }

    public void setToolLink(String toolLink) {
        this.toolLink = toolLink;
    }

    @Basic
    @Column(name = "tool_type")
    public Integer getToolType() {
        return toolType;
    }

    public void setToolType(Integer toolType) {
        this.toolType = toolType;
    }

    @Basic
    @Column(name = "seo_keywords")
    public String getSeoKeywords() {
        return seoKeywords;
    }

    public void setSeoKeywords(String seoKeywords) {
        this.seoKeywords = seoKeywords;
    }

    @Basic
    @Column(name = "seo_description")
    public String getSeoDescription() {
        return seoDescription;
    }

    public void setSeoDescription(String seoDescription) {
        this.seoDescription = seoDescription;
    }

    @Basic
    @Column(name = "tool_img")
    public String getToolImg() {
        return toolImg;
    }

    public void setToolImg(String toolImg) {
        this.toolImg = toolImg;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ToolEntity that = (ToolEntity) o;
        return id == that.id &&
                Objects.equals(toolName, that.toolName) &&
                Objects.equals(toolLink, that.toolLink) &&
                Objects.equals(toolType, that.toolType) &&
                Objects.equals(seoKeywords, that.seoKeywords) &&
                Objects.equals(seoDescription, that.seoDescription) &&
                Objects.equals(toolImg, that.toolImg);
    }


    public void setToolCode(ToolCodeEntity toolCode) {
        this.toolCode = toolCode;
    }

    @OneToOne(optional = false)
    @JoinColumn(name = "id",referencedColumnName = "tool_id")
    public ToolCodeEntity getToolCode() {
        return toolCode;
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, toolName, toolLink, toolType, seoKeywords, seoDescription, toolImg);
    }


}
