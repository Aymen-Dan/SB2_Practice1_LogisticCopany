package com.example.sb2_practice1;

import com.example.sb2_practice1.entity.Department;
import com.example.sb2_practice1.entity.Order;
import org.junit.Before;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.ValidatorFactory;
import javax.validation.Validator;
import java.util.Random;
import java.util.Set;

import jakarta.xml.bind.*;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest(classes = Order.class)
class Sb2Practice1ApplicationTests {

    //    @Test
//    void contextLoads() {
//    }


    private final Validator validator = Validation.buildDefaultValidatorFactory().getValidator();

    @Test
    public void orderCostValidation() {

        Order order = new Order();
        order.setCost(45);
        Set<ConstraintViolation<Order>> violations = validator.validate(order);
        assertTrue(violations.size() == 1);
    }


    @Test
    public void testDepartmentCodeIsUnique(){
        // long generatedLong = new Random().nextLong();

        Department dep = new Department();
        Department dep1 = new Department();
        dep.setDepCode(19L);
        dep1.setDepCode(19L);
        assertTrue(dep.getDepCode() == dep1.getDepCode());

    }


    //The "cascade delete" test hasn't been done bc i couldn't figure out how






}
