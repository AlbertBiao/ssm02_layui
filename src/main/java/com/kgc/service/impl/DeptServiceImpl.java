package com.kgc.service.impl;

import com.kgc.dao.DeptMapper;
import com.kgc.entity.Dept;
import com.kgc.entity.DeptExample;
import com.kgc.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {
    //引用deptmapper接口
    @Autowired
    private DeptMapper deptMapper;
    public List<Dept> findAll() {
        DeptExample example=new DeptExample();
        return deptMapper.selectByExample(example);
    }
}
