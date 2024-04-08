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
@ApiModel("课程安排中间表PO")
@TbTableUuid(table = "demo_course_teacher")
open class DemoCourseTeacherPO: vip.sujianfeng.enjoyapi.dbconn.MyModelBase() {
    @ApiModelProperty("班级编号")
    @TbFieldString(tableField = "class_code", label = "班级编号", length = 50)
    var classCode: String? = null
    @ApiModelProperty("班级名称")
    @TbFieldString(tableField = "class_name", label = "班级名称", length = 50)
    var className: String? = null
    @ApiModelProperty("课程编号")
    @TbFieldString(tableField = "course_code", label = "课程编号", length = 50)
    var courseCode: String? = null
    @ApiModelProperty("教师名称")
    @TbFieldString(tableField = "course_name", label = "教师名称", length = 50)
    var courseName: String? = null
    @ApiModelProperty("安排名称")
    @TbFieldString(tableField = "name", label = "安排名称", length = 50)
    var name: String? = null
    @ApiModelProperty("课程编号")
    @TbFieldString(tableField = "teacher_code", label = "课程编号", length = 50)
    var teacherCode: String? = null
    @ApiModelProperty("教师名称")
    @TbFieldString(tableField = "teacher_name", label = "教师名称", length = 50)
    var teacherName: String? = null

    companion object {
        const val TABLE_NAME = "demo_course_teacher"
        const val BIZ_STATUS = "biz_status"
        const val CLASS_CODE = "class_code"
        const val CLASS_NAME = "class_name"
        const val COURSE_CODE = "course_code"
        const val COURSE_NAME = "course_name"
        const val CREATE_TIME = "create_time"
        const val CREATE_USER_ID = "create_user_id"
        const val ID = "id"
        const val NAME = "name"
        const val REMARK = "remark"
        const val STATE = "state"
        const val TEACHER_CODE = "teacher_code"
        const val TEACHER_NAME = "teacher_name"
        const val UPDATE_TIME = "update_time"
        const val UPDATE_USER_ID = "update_user_id"
    }
}

/**
 * author GenerateModelBuilder
 * description Sql条件生成器
 **/
class DemoCourseTeacherCU: SqlConditionBuilder<DemoCourseTeacherCU>() {
    var BIZ_STATUS = SqlConditionField<DemoCourseTeacherCU>(this, "a.biz_status")
    var CLASS_CODE = SqlConditionField<DemoCourseTeacherCU>(this, "a.class_code")
    var CLASS_NAME = SqlConditionField<DemoCourseTeacherCU>(this, "a.class_name")
    var COURSE_CODE = SqlConditionField<DemoCourseTeacherCU>(this, "a.course_code")
    var COURSE_NAME = SqlConditionField<DemoCourseTeacherCU>(this, "a.course_name")
    var CREATE_TIME = SqlConditionField<DemoCourseTeacherCU>(this, "a.create_time")
    var CREATE_USER_ID = SqlConditionField<DemoCourseTeacherCU>(this, "a.create_user_id")
    var ID = SqlConditionField<DemoCourseTeacherCU>(this, "a.id")
    var NAME = SqlConditionField<DemoCourseTeacherCU>(this, "a.name")
    var REMARK = SqlConditionField<DemoCourseTeacherCU>(this, "a.remark")
    var STATE = SqlConditionField<DemoCourseTeacherCU>(this, "a.state")
    var TEACHER_CODE = SqlConditionField<DemoCourseTeacherCU>(this, "a.teacher_code")
    var TEACHER_NAME = SqlConditionField<DemoCourseTeacherCU>(this, "a.teacher_name")
    var UPDATE_TIME = SqlConditionField<DemoCourseTeacherCU>(this, "a.update_time")
    var UPDATE_USER_ID = SqlConditionField<DemoCourseTeacherCU>(this, "a.update_user_id")
}
