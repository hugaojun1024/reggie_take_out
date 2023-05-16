package com.itheima.reggle.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itheima.reggle.entity.Employee;
import com.itheima.reggle.mapper.EmployeeMapper;
import com.itheima.reggle.service.EmployeeService;
import org.springframework.stereotype.Service;

/**
 * @author hugaojun Email:nat17185546@163.com
 * @create 2023-05-15-[下午 5:58]-周一
 */
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {
}
