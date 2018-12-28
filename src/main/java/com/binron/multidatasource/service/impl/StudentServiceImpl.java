package com.binron.multidatasource.service.impl;

import com.binron.multidatasource.mapper.base.BaseMapper;
import com.binron.multidatasource.mapper.cluster.StudentMapper;
import com.binron.multidatasource.pojo.Student;
import com.binron.multidatasource.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 用户操作实现类
 */
@Service
public class StudentServiceImpl extends BaseServiceImpl<Student>  implements StudentService {
	@Autowired
	private StudentMapper studentMapper;
	
	@Override
	protected BaseMapper<Student> getMapper() {

		return this.studentMapper;
	}
	
}
