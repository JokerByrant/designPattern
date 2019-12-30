package com.sxh.newfolder.DP14_模板方法.模拟JDBC连接查询;

import java.sql.ResultSet;

/**
 * @author sxh
 * @date 2019/12/30
 */
public class GoodsTemplateImpl extends AbstractJdbcTemplate {
    @Override
    Object doInStatement(ResultSet rs) {
        System.out.println("数据集处理成功，返回Goods数据实体对象");
        return null;
    }
}
