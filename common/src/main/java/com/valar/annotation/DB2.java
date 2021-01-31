package com.valar.annotation;
import com.baomidou.dynamic.datasource.annotation.DS;
import java.lang.annotation.*;
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@DS("db2")
public @interface DB2 {
}
