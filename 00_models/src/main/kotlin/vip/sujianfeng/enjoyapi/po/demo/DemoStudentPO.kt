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
@ApiModel("学生管理PO")
@TbTableUuid(table = "demo_student")
open class DemoStudentPO: vip.sujianfeng.enjoyapi.dbconn.MyModelBase() {
    @ApiModelProperty("所属班级编号")
    @TbFieldString(tableField = "class_code", label = "所属班级编号", length = 50)
    var classCode: String? = null
    @ApiModelProperty("学生编号")
    @TbFieldString(tableField = "code", label = "学生编号", length = 50)
    var code: String? = null
    @ApiModelProperty("学生名称")
    @TbFieldString(tableField = "name", label = "学生名称", length = 50)
    var name: String? = null

    companion object {
        const val TABLE_NAME = "demo_student"
        const val BIZ_STATUS = "biz_status"
        const val CLASS_CODE = "class_code"
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
class DemoStudentCU: SqlConditionBuilder<DemoStudentCU>() {
    var BIZ_STATUS = SqlConditionField<DemoStudentCU>(this, "a.biz_status")
    var CLASS_CODE = SqlConditionField<DemoStudentCU>(this, "a.class_code")
    var CODE = SqlConditionField<DemoStudentCU>(this, "a.code")
    var CREATE_TIME = SqlConditionField<DemoStudentCU>(this, "a.create_time")
    var CREATE_USER_ID = SqlConditionField<DemoStudentCU>(this, "a.create_user_id")
    var ID = SqlConditionField<DemoStudentCU>(this, "a.id")
    var NAME = SqlConditionField<DemoStudentCU>(this, "a.name")
    var REMARK = SqlConditionField<DemoStudentCU>(this, "a.remark")
    var STATE = SqlConditionField<DemoStudentCU>(this, "a.state")
    var UPDATE_TIME = SqlConditionField<DemoStudentCU>(this, "a.update_time")
    var UPDATE_USER_ID = SqlConditionField<DemoStudentCU>(this, "a.update_user_id")
}
