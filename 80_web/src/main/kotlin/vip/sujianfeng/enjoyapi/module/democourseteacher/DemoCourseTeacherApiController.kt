package vip.sujianfeng.enjoyapi.module.democourseteacher

import vip.sujianfeng.enjoyapi.base.controller.MasterController
import io.swagger.annotations.Api
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import vip.sujianfeng.enjoydao.interfaces.JdbcTbDao
import vip.sujianfeng.utils.define.CallResult
import DemoCourseTeacherPageParam
import vip.sujianfeng.enjoyapi.vo.demo.DemoCourseTeacherVO

/**
 * author GenerateCodeBuilder
 * createTime 2024-04-08 16:48:14
 * description 读取数据库生成的代码，仅不存在时生成，可修改
 **/
@Api(tags = ["课程安排中间表"])
@RestController
@RequestMapping("/module/demo-course-teacher-api")
class DemoCourseTeacherApiController: MasterController<DemoCourseTeacherVO, DemoCourseTeacherPageParam>() {
}