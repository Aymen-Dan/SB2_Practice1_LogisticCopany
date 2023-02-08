package com.example.sb2_practice1.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "departments")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Department {


    @Id
    @Column(name = "depName", nullable = false, unique = true)
    private String depName;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "depCode", nullable = false, unique = true)
    private Long depCode;

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }


    public Long getDepCode() {
        return depCode;
    }

    public void setDepCode(Long depCode) {
        this.depCode = depCode;
    }


    //the orders that get yote when a department is deleted
    @ManyToOne(cascade = CascadeType.REMOVE,
            fetch = FetchType.EAGER)
    private Order order;


    @Override
    public String toString() {
        return "Department name: " + depName + ";\nDepartment code: " + depCode + ";";
    }


}
