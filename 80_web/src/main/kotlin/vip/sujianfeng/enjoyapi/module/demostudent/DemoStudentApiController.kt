package vip.sujianfeng.enjoyapi.module.demostudent

import vip.sujianfeng.enjoyapi.base.controller.MasterController
import io.swagger.annotations.Api
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import vip.sujianfeng.enjoydao.interfaces.JdbcTbDao
import vip.sujianfeng.utils.define.CallResult
import DemoStudentPageParam
import vip.sujianfeng.enjoyapi.vo.demo.DemoStudentVO

/**
 * author GenerateCodeBuilder
 * createTime 2024-04-08 16:47:58
 * description 读取数据库生成的代码，仅不存在时生成，可修改
 **/
@Api(tags = ["学生管理"])
@RestController
@RequestMapping("/module/demo-student-api")
class DemoStudentApiController: MasterController<DemoStudentVO, DemoStudentPageParam>() {
}