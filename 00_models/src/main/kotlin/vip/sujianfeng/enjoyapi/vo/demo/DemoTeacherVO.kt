package vip.sujianfeng.enjoyapi.vo.demo

import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty
import vip.sujianfeng.enjoydao.annotations.*
import vip.sujianfeng.enjoyapi.po.demo.*

/**
 * author GenerateModelBuilder
 * createTime 2024-04-08 16:47:37
 * description 读取数据库生成的实体模型代码，仅不存在时生成，可修改
 **/
@ApiModel("教师管理VO")
@TbTableUuid(table = "demo_teacher")
open class DemoTeacherVO: DemoTeacherPO() {
}
