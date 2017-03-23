/*
 * Clever API
 * The Clever API
 *
 * OpenAPI spec version: 1.2.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Term;
import java.util.ArrayList;
import java.util.List;

/**
 * Section
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-23T15:48:07.205-07:00")
public class Section {
  @SerializedName("id")
  private String id = null;

  @SerializedName("course_description")
  private String courseDescription = null;

  @SerializedName("course_name")
  private String courseName = null;

  @SerializedName("course_number")
  private String courseNumber = null;

  @SerializedName("created")
  private String created = null;

  @SerializedName("district")
  private String district = null;

  @SerializedName("grade")
  private String grade = null;

  @SerializedName("last_modified")
  private String lastModified = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("period")
  private String period = null;

  @SerializedName("school")
  private String school = null;

  @SerializedName("section_number")
  private String sectionNumber = null;

  @SerializedName("section_group")
  private String sectionGroup = null;

  @SerializedName("sis_id")
  private String sisId = null;

  @SerializedName("students")
  private List<String> students = new ArrayList<String>();

  @SerializedName("subject")
  private String subject = null;

  @SerializedName("teacher")
  private String teacher = null;

  @SerializedName("teachers")
  private List<String> teachers = new ArrayList<String>();

  @SerializedName("term")
  private Term term = null;

  public Section id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Section courseDescription(String courseDescription) {
    this.courseDescription = courseDescription;
    return this;
  }

   /**
   * Get courseDescription
   * @return courseDescription
  **/
  @ApiModelProperty(value = "")
  public String getCourseDescription() {
    return courseDescription;
  }

  public void setCourseDescription(String courseDescription) {
    this.courseDescription = courseDescription;
  }

  public Section courseName(String courseName) {
    this.courseName = courseName;
    return this;
  }

   /**
   * Get courseName
   * @return courseName
  **/
  @ApiModelProperty(value = "")
  public String getCourseName() {
    return courseName;
  }

  public void setCourseName(String courseName) {
    this.courseName = courseName;
  }

  public Section courseNumber(String courseNumber) {
    this.courseNumber = courseNumber;
    return this;
  }

   /**
   * Get courseNumber
   * @return courseNumber
  **/
  @ApiModelProperty(value = "")
  public String getCourseNumber() {
    return courseNumber;
  }

  public void setCourseNumber(String courseNumber) {
    this.courseNumber = courseNumber;
  }

  public Section created(String created) {
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  @ApiModelProperty(value = "")
  public String getCreated() {
    return created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  public Section district(String district) {
    this.district = district;
    return this;
  }

   /**
   * Get district
   * @return district
  **/
  @ApiModelProperty(value = "")
  public String getDistrict() {
    return district;
  }

  public void setDistrict(String district) {
    this.district = district;
  }

  public Section grade(String grade) {
    this.grade = grade;
    return this;
  }

   /**
   * Get grade
   * @return grade
  **/
  @ApiModelProperty(value = "")
  public String getGrade() {
    return grade;
  }

  public void setGrade(String grade) {
    this.grade = grade;
  }

  public Section lastModified(String lastModified) {
    this.lastModified = lastModified;
    return this;
  }

   /**
   * Get lastModified
   * @return lastModified
  **/
  @ApiModelProperty(value = "")
  public String getLastModified() {
    return lastModified;
  }

  public void setLastModified(String lastModified) {
    this.lastModified = lastModified;
  }

  public Section name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Section period(String period) {
    this.period = period;
    return this;
  }

   /**
   * Get period
   * @return period
  **/
  @ApiModelProperty(value = "")
  public String getPeriod() {
    return period;
  }

  public void setPeriod(String period) {
    this.period = period;
  }

  public Section school(String school) {
    this.school = school;
    return this;
  }

   /**
   * Get school
   * @return school
  **/
  @ApiModelProperty(value = "")
  public String getSchool() {
    return school;
  }

  public void setSchool(String school) {
    this.school = school;
  }

  public Section sectionNumber(String sectionNumber) {
    this.sectionNumber = sectionNumber;
    return this;
  }

   /**
   * Get sectionNumber
   * @return sectionNumber
  **/
  @ApiModelProperty(value = "")
  public String getSectionNumber() {
    return sectionNumber;
  }

  public void setSectionNumber(String sectionNumber) {
    this.sectionNumber = sectionNumber;
  }

  public Section sectionGroup(String sectionGroup) {
    this.sectionGroup = sectionGroup;
    return this;
  }

   /**
   * Get sectionGroup
   * @return sectionGroup
  **/
  @ApiModelProperty(value = "")
  public String getSectionGroup() {
    return sectionGroup;
  }

  public void setSectionGroup(String sectionGroup) {
    this.sectionGroup = sectionGroup;
  }

  public Section sisId(String sisId) {
    this.sisId = sisId;
    return this;
  }

   /**
   * Get sisId
   * @return sisId
  **/
  @ApiModelProperty(value = "")
  public String getSisId() {
    return sisId;
  }

  public void setSisId(String sisId) {
    this.sisId = sisId;
  }

  public Section students(List<String> students) {
    this.students = students;
    return this;
  }

  public Section addStudentsItem(String studentsItem) {
    this.students.add(studentsItem);
    return this;
  }

   /**
   * Get students
   * @return students
  **/
  @ApiModelProperty(value = "")
  public List<String> getStudents() {
    return students;
  }

  public void setStudents(List<String> students) {
    this.students = students;
  }

  public Section subject(String subject) {
    this.subject = subject;
    return this;
  }

   /**
   * Get subject
   * @return subject
  **/
  @ApiModelProperty(value = "")
  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public Section teacher(String teacher) {
    this.teacher = teacher;
    return this;
  }

   /**
   * Get teacher
   * @return teacher
  **/
  @ApiModelProperty(value = "")
  public String getTeacher() {
    return teacher;
  }

  public void setTeacher(String teacher) {
    this.teacher = teacher;
  }

  public Section teachers(List<String> teachers) {
    this.teachers = teachers;
    return this;
  }

  public Section addTeachersItem(String teachersItem) {
    this.teachers.add(teachersItem);
    return this;
  }

   /**
   * Get teachers
   * @return teachers
  **/
  @ApiModelProperty(value = "")
  public List<String> getTeachers() {
    return teachers;
  }

  public void setTeachers(List<String> teachers) {
    this.teachers = teachers;
  }

  public Section term(Term term) {
    this.term = term;
    return this;
  }

   /**
   * Get term
   * @return term
  **/
  @ApiModelProperty(value = "")
  public Term getTerm() {
    return term;
  }

  public void setTerm(Term term) {
    this.term = term;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Section section = (Section) o;
    return Objects.equals(this.id, section.id) &&
        Objects.equals(this.courseDescription, section.courseDescription) &&
        Objects.equals(this.courseName, section.courseName) &&
        Objects.equals(this.courseNumber, section.courseNumber) &&
        Objects.equals(this.created, section.created) &&
        Objects.equals(this.district, section.district) &&
        Objects.equals(this.grade, section.grade) &&
        Objects.equals(this.lastModified, section.lastModified) &&
        Objects.equals(this.name, section.name) &&
        Objects.equals(this.period, section.period) &&
        Objects.equals(this.school, section.school) &&
        Objects.equals(this.sectionNumber, section.sectionNumber) &&
        Objects.equals(this.sectionGroup, section.sectionGroup) &&
        Objects.equals(this.sisId, section.sisId) &&
        Objects.equals(this.students, section.students) &&
        Objects.equals(this.subject, section.subject) &&
        Objects.equals(this.teacher, section.teacher) &&
        Objects.equals(this.teachers, section.teachers) &&
        Objects.equals(this.term, section.term);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, courseDescription, courseName, courseNumber, created, district, grade, lastModified, name, period, school, sectionNumber, sectionGroup, sisId, students, subject, teacher, teachers, term);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Section {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    courseDescription: ").append(toIndentedString(courseDescription)).append("\n");
    sb.append("    courseName: ").append(toIndentedString(courseName)).append("\n");
    sb.append("    courseNumber: ").append(toIndentedString(courseNumber)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    district: ").append(toIndentedString(district)).append("\n");
    sb.append("    grade: ").append(toIndentedString(grade)).append("\n");
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    school: ").append(toIndentedString(school)).append("\n");
    sb.append("    sectionNumber: ").append(toIndentedString(sectionNumber)).append("\n");
    sb.append("    sectionGroup: ").append(toIndentedString(sectionGroup)).append("\n");
    sb.append("    sisId: ").append(toIndentedString(sisId)).append("\n");
    sb.append("    students: ").append(toIndentedString(students)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    teacher: ").append(toIndentedString(teacher)).append("\n");
    sb.append("    teachers: ").append(toIndentedString(teachers)).append("\n");
    sb.append("    term: ").append(toIndentedString(term)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}
