package cn.rjw.rest;

import cn.rjw.service.IDeptService;
import cn.rjw.vo.Dept;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
public class DeptRest {
	@Resource
	private IDeptService deptService ;
	//http://localhost:8001/dept/get/1
	@RequestMapping(value="/dept/get/{id}",method=RequestMethod.GET)
	public Object get(@PathVariable("id") long id) {
		return this.deptService.get(id) ;
	}
	@RequestMapping(value="/dept/add",method=RequestMethod.GET)
	public Object add(@RequestBody Dept dept) {
		return this.deptService.add(dept) ;
	}
	@RequestMapping(value="/dept/list",method=RequestMethod.GET)
	public Object list() {
		return this.deptService.list() ;
	}
}
