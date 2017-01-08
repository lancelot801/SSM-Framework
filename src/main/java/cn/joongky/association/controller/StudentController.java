package cn.joongky.association.controller;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.joongky.association.JsonResult;
import cn.joongky.association.service.StudentService;

@RestController
@RequestMapping("/api/v1/student")
public class StudentController {
	@Inject
	private StudentService studentService;
	
	@RequestMapping("/listAllStudent")
	public JsonResult listAllStudent()
	{
		JsonResult jr = new JsonResult();
		jr.setResultCode(0);
		jr.setResultData(studentService.findAllStudent());
		return jr;
	}
}
