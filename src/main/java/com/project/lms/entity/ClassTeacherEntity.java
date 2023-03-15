package com.project.lms.entity;

import com.project.lms.entity.member.TeacherInfo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="class_teacher")
@Getter
public class ClassTeacherEntity {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ct_seq") private Long ctSeq;
    @OneToOne
    @JoinColumn(name = "ct_ci_seq") private ClassInfoEntity classInfo;
    @OneToOne
    @JoinColumn(name = "ct_mi_seq") private TeacherInfo teacher;
}
