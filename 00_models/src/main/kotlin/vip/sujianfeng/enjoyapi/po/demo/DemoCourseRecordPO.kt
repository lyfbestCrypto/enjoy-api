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
@ApiModel("上课记录中间表PO")
@TbTableUuid(table = "demo_course_record")
open class DemoCourseRecordPO: vip.sujianfeng.enjoyapi.dbconn.MyModelBase() {
    @ApiModelProperty("课程安排表编号")
    @TbFieldString(tableField = "demo_course_teacher_id", label = "课程安排表编号", length = 50)
    var demoCourseTeacherId: String? = null
    @ApiModelProperty("记录名称")
    @TbFieldString(tableField = "name", label = "记录名称", length = 50)
    var name: String? = null
    @ApiModelProperty("代课老师编号，如果biz_status为2则该字段必传")
    @TbFieldString(tableField = "replace_teacher_code", label = "代课老师编号，如果biz_status为2则该字段必传", length = 50)
    var replaceTeacherCode: String? = null

    companion object {
        const val TABLE_NAME = "demo_course_record"
        const val BIZ_STATUS = "biz_status"
        const val CREATE_TIME = "create_time"
        const val CREATE_USER_ID = "create_user_id"
        const val DEMO_COURSE_TEACHER_ID = "demo_course_teacher_id"
        const val ID = "id"
        const val NAME = "name"
        const val REMARK = "remark"
        const val REPLACE_TEACHER_CODE = "replace_teacher_code"
        const val STATE = "state"
        const val UPDATE_TIME = "update_time"
        const val UPDATE_USER_ID = "update_user_id"
    }
}

/**
 * author GenerateModelBuilder
 * description Sql条件生成器
 **/
class DemoCourseRecordCU: SqlConditionBuilder<DemoCourseRecordCU>() {
    var BIZ_STATUS = SqlConditionField<DemoCourseRecordCU>(this, "a.biz_status")
    var CREATE_TIME = SqlConditionField<DemoCourseRecordCU>(this, "a.create_time")
    var CREATE_USER_ID = SqlConditionField<DemoCourseRecordCU>(this, "a.create_user_id")
    var DEMO_COURSE_TEACHER_ID = SqlConditionField<DemoCourseRecordCU>(this, "a.demo_course_teacher_id")
    var ID = SqlConditionField<DemoCourseRecordCU>(this, "a.id")
    var NAME = SqlConditionField<DemoCourseRecordCU>(this, "a.name")
    var REMARK = SqlConditionField<DemoCourseRecordCU>(this, "a.remark")
    var REPLACE_TEACHER_CODE = SqlConditionField<DemoCourseRecordCU>(this, "a.replace_teacher_code")
    var STATE = SqlConditionField<DemoCourseRecordCU>(this, "a.state")
    var UPDATE_TIME = SqlConditionField<DemoCourseRecordCU>(this, "a.update_time")
    var UPDATE_USER_ID = SqlConditionField<DemoCourseRecordCU>(this, "a.update_user_id")
}
