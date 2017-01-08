package cn.joongky.association.service.impl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import cn.joongky.association.dao.AdminMapper;
import cn.joongky.association.pojo.Admin;
import cn.joongky.association.pojo.AdminExample;
import cn.joongky.association.service.StudentService;

@Service("studentService")
public class StudentServiceImpl implements StudentService {
    @Inject
    private AdminMapper adminMapper;
    
	@Override
	public List<Admin> findAllStudent() {
		AdminExample example = new AdminExample();
		List<Admin> list = adminMapper.selectByExample(example);
		return list;
	}

}
