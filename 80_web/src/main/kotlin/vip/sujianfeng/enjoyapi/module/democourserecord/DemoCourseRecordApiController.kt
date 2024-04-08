package vip.sujianfeng.enjoyapi.module.democourserecord

import vip.sujianfeng.enjoyapi.base.controller.MasterController
import io.swagger.annotations.Api
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import vip.sujianfeng.enjoydao.interfaces.JdbcTbDao
import vip.sujianfeng.utils.define.CallResult
import DemoCourseRecordPageParam
import vip.sujianfeng.enjoyapi.vo.demo.DemoCourseRecordVO

/**
 * author GenerateCodeBuilder
 * createTime 2024-04-08 16:48:18
 * description 读取数据库生成的代码，仅不存在时生成，可修改
 **/
@Api(tags = ["上课记录中间表"])
@RestController
@RequestMapping("/module/demo-course-record-api")
class DemoCourseRecordApiController: MasterController<DemoCourseRecordVO, DemoCourseRecordPageParam>() {
}