package com.kgc.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kgc.dao.EmpMapper;
import com.kgc.entity.Emp;
import com.kgc.entity.EmpExample;
import com.kgc.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpServiceImpl implements EmpService {

    @Autowired
    private EmpMapper empMapper;
    public PageInfo<Emp> findAll(int page, int limit, Emp emp) {
        PageHelper.startPage(page, limit);

        EmpExample empExample=new EmpExample();

        EmpExample.Criteria criteria = empExample.createCriteria();
        //增加查询条件
        if(emp.getDeptid()!=null){

            criteria.andDeptidEqualTo(emp.getDeptid());
        }

        if(emp.getEname()!=null){
            criteria.andEnameLike("%"+emp.getEname()+"%");
        }

        List<Emp> emps = empMapper.selectByExample(new EmpExample());
        System.out.println("emps="+empMapper.selectByExample(new EmpExample()));

        PageInfo<Emp> pageInfo=new PageInfo<Emp>(emps);

        return pageInfo;
    }

    public void save(Emp emp) {
        empMapper.insertSelective(emp);
    }

    //public void deleteEmp(Emp emp) {}

    public Emp findById(int id) {
        return empMapper.selectByPrimaryKey(id);
    }

    public void updateEmp(Emp emp) {
       empMapper.updateByPrimaryKeySelective(emp);
    }

    public void deleteEmp(int id) {
        empMapper.deleteByPrimaryKey(id);

    }

    public void deletesEmp(int[] ids) {
        empMapper.deleteEmps(ids);
    }

   /* public void deleteEmp(int[] ids) {

    }

    */

}
