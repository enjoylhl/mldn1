package cn.mldn.microcloud.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.mldn.microcloud.dao.IDeptDAO;
import cn.mldn.microcloud.service.IDeptService;
import cn.mldn.vo.Dept;
@Service
public class Hello implements IDeptService {
	@Resource
	private IDeptDAO deptDAO ;
	@Override
	public Dept get(long id) {
		return this.deptDAO.findById(id);
	}

	@Override
	public boolean add(Dept dept) {
		return this.deptDAO.doCreate(dept);
	}

	@Override
	public List<Dept> list() {
		return this.deptDAO.findAll();
		System.out.println("www");
	}
	
	public static void main(String[] args){
		//代码注释模块
		System.out.println("666");
		System.out.println("www");
		System.out.println("12345");
		System.out.println("sdsssd");
		System.out.println("......!!!");
		
	}
}