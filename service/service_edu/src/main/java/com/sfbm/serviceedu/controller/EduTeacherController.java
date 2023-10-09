package com.sfbm.serviceedu.controller;


import com.sfbm.serviceedu.entity.EduTeacher;
import com.sfbm.serviceedu.service.EduTeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 讲师 前端控制器
 * </p>
 *
 * @author sfbm
 * @since 2023-10-09
 */
@RestController
@RequestMapping("/serviceedu/teacher")
public class EduTeacherController {

    @Autowired
    private EduTeacherService teacherService;

    @GetMapping("findAll")
    public List<EduTeacher> findAll(){
        List<EduTeacher> list = teacherService.list(null);
        return list;
    }

    @DeleteMapping("{id)}")
    public boolean removeById(@PathVariable String id){
        boolean b = teacherService.removeById(id);

        return b;
    }

}

