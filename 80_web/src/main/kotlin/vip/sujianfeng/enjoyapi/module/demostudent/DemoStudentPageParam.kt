import vip.sujianfeng.enjoydao.handler.model.PageParam
import vip.sujianfeng.enjoydao.interfaces.TbDao
import vip.sujianfeng.enjoydao.sqlcondition.ISqlConditionBuilder
import vip.sujianfeng.utils.comm.StringUtilsEx
import vip.sujianfeng.enjoyapi.po.demo.DemoStudentCU

/**
 * author GenerateCodeBuilder
 * createTime 2024-04-08 16:47:58
 * description 读取数据库生成的代码，仅不存在时生成，可修改
 **/
class DemoStudentPageParam: PageParam() {

    override fun createBuilder(tbDao: TbDao?): ISqlConditionBuilder {
        return DemoStudentCU().apply {
            this.and(StringUtilsEx.isNotEmpty(keyword)) {
                this.NAME.like("%$keyword%")
            }
        }
    }

}