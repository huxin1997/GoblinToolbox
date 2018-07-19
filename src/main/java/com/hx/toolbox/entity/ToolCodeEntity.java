package com.hx.toolbox.entity;

import javax.persistence.*;
import java.util.Objects;


@Entity
//@ToString
@Table(name = "tool_code", schema = "tools", catalog = "")
public class ToolCodeEntity {
    private int id;
    private Integer toolId;
    private String htmlCode;
    private String jsCode;
    private String cssCode;


    private ToolEntity toolEntity;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "tool_id")
    public Integer getToolId() {
        return toolId;
    }

    public void setToolId(Integer toolId) {
        this.toolId = toolId;
    }

    @Basic
    @Column(name = "html_code")
    public String getHtmlCode() {
        return htmlCode;
    }

    public void setHtmlCode(String htmlCode) {
        this.htmlCode = htmlCode;
    }

    @Basic
    @Column(name = "js_code")
    public String getJsCode() {
        return jsCode;
    }

    public void setJsCode(String jsCode) {
        this.jsCode = jsCode;
    }

    @Basic
    @Column(name = "css_code")
    public String getCssCode() {
        return cssCode;
    }

    public void setCssCode(String cssCode) {
        this.cssCode = cssCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ToolCodeEntity that = (ToolCodeEntity) o;
        return id == that.id &&
                Objects.equals(toolId, that.toolId) &&
                Objects.equals(htmlCode, that.htmlCode) &&
                Objects.equals(jsCode, that.jsCode) &&
                Objects.equals(cssCode, that.cssCode);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, toolId, htmlCode, jsCode, cssCode);
    }



    public void setToolEntity(ToolEntity toolEntity) {
        this.toolEntity = toolEntity;
    }

    @OneToOne(mappedBy = "toolCode",optional = false)
    public ToolEntity getToolEntity() {
        return toolEntity;
    }

    @Override
    public String toString() {
        return "ToolCodeEntity{" +
                "id=" + id +
                ", toolId=" + toolId +
                ", htmlCode='" + htmlCode + '\'' +
                ", jsCode='" + jsCode + '\'' +
                ", cssCode='" + cssCode + '\''+
                '}';
    }
}
