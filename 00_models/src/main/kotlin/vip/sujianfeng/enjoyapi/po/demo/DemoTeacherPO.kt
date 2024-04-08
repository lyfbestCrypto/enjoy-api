package vip.sujianfeng.enjoyapi.po.demo

import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty
import vip.sujianfeng.enjoydao.annotations.*
import vip.sujianfeng.enjoydao.sqlcondition.*
import vip.sujianfeng.enjoydao.enums.*

/**
 * author GenerateModelBuilder
 * description 读取数据库生成的实体模型代码，不要手动修改，重新生成后会覆盖
 **/
@ApiModel("教师管理PO")
@TbTableUuid(table = "demo_teacher")
open class DemoTeacherPO: vip.sujianfeng.enjoyapi.dbconn.MyModelBase() {
    @ApiModelProperty("教师编号")
    @TbFieldString(tableField = "code", label = "教师编号", length = 50)
    var code: String? = null
    @ApiModelProperty("教师名称")
    @TbFieldString(tableField = "name", label = "教师名称", length = 50)
    var name: String? = null

    companion object {
        const val TABLE_NAME = "demo_teacher"
        const val BIZ_STATUS = "biz_status"
        const val CODE = "code"
        const val CREATE_TIME = "create_time"
        const val CREATE_USER_ID = "create_user_id"
        const val ID = "id"
        const val NAME = "name"
        const val REMARK = "remark"
        const val STATE = "state"
        const val UPDATE_TIME = "update_time"
        const val UPDATE_USER_ID = "update_user_id"
    }
}

/**
 * author GenerateModelBuilder
 * description Sql条件生成器
 **/
class DemoTeacherCU: SqlConditionBuilder<DemoTeacherCU>() {
    var BIZ_STATUS = SqlConditionField<DemoTeacherCU>(this, "a.biz_status")
    var CODE = SqlConditionField<DemoTeacherCU>(this, "a.code")
    var CREATE_TIME = SqlConditionField<DemoTeacherCU>(this, "a.create_time")
    var CREATE_USER_ID = SqlConditionField<DemoTeacherCU>(this, "a.create_user_id")
    var ID = SqlConditionField<DemoTeacherCU>(this, "a.id")
    var NAME = SqlConditionField<DemoTeacherCU>(this, "a.name")
    var REMARK = SqlConditionField<DemoTeacherCU>(this, "a.remark")
    var STATE = SqlConditionField<DemoTeacherCU>(this, "a.state")
    var UPDATE_TIME = SqlConditionField<DemoTeacherCU>(this, "a.update_time")
    var UPDATE_USER_ID = SqlConditionField<DemoTeacherCU>(this, "a.update_user_id")
}
