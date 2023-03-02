package com.prueba.back.models;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "title", schema = "people", catalog = "")
public class TitleEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "title_name")
    private String titleName;
    @Basic
    @Column(name = "level")
    private String level;
    @Basic
    @Column(name = "institution")
    private String institution;
    @Basic
    @Column(name = "date_obtained")
    private Date dateObtained;
    @Basic
    @Column(name = "person_id")
    private int personId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitleName() {
        return titleName;
    }

    public void setTitleName(String titleName) {
        this.titleName = titleName;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }

    public Date getDateObtained() {
        return dateObtained;
    }

    public void setDateObtained(Date dateObtained) {
        this.dateObtained = dateObtained;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TitleEntity that = (TitleEntity) o;
        return id == that.id && personId == that.personId && Objects.equals(titleName, that.titleName) && Objects.equals(level, that.level) && Objects.equals(institution, that.institution) && Objects.equals(dateObtained, that.dateObtained);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, titleName, level, institution, dateObtained, personId);
    }
}
