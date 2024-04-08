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
@ApiModel("班级管理PO")
@TbTableUuid(table = "demo_class")
open class DemoClassPO: vip.sujianfeng.enjoyapi.dbconn.MyModelBase() {
    @ApiModelProperty("班级编号")
    @TbFieldString(tableField = "code", label = "班级编号", length = 50)
    var code: String? = null
    @ApiModelProperty("班级名称")
    @TbFieldString(tableField = "name", label = "班级名称", length = 50)
    var name: String? = null

    companion object {
        const val TABLE_NAME = "demo_class"
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
class DemoClassCU: SqlConditionBuilder<DemoClassCU>() {
    var BIZ_STATUS = SqlConditionField<DemoClassCU>(this, "a.biz_status")
    var CODE = SqlConditionField<DemoClassCU>(this, "a.code")
    var CREATE_TIME = SqlConditionField<DemoClassCU>(this, "a.create_time")
    var CREATE_USER_ID = SqlConditionField<DemoClassCU>(this, "a.create_user_id")
    var ID = SqlConditionField<DemoClassCU>(this, "a.id")
    var NAME = SqlConditionField<DemoClassCU>(this, "a.name")
    var REMARK = SqlConditionField<DemoClassCU>(this, "a.remark")
    var STATE = SqlConditionField<DemoClassCU>(this, "a.state")
    var UPDATE_TIME = SqlConditionField<DemoClassCU>(this, "a.update_time")
    var UPDATE_USER_ID = SqlConditionField<DemoClassCU>(this, "a.update_user_id")
}
