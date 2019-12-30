package com.sxh.newfolder.DP14_模板方法.模拟JDBC连接查询;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * 模拟JDBC连接数据库
 * @author sxh
 * @date 2019/12/30
 */
public abstract class AbstractJdbcTemplate {
    public final Object execute(String sql) {
        // 1、首先获取数据库连接对象
        Connection connection = getConnection();
        // 2、根据连接获取statement对象（数据库操作对象）
        getStatement(connection);
        // 3、使用数据库操作对象来执行对应的SQL语句
        ResultSet rs = excuteSql(sql);
        // 4、最后基于查询的数据集，处理并返回最终结果
        return doInStatement(rs);

        // 资源的释放这里我就省略了
    }

    private Connection getConnection() {
        System.out.println("获取数据库连接");
        return null;
    }

    private Statement getStatement(Connection connection) {
        System.out.println("获取数据库操作对象");
        return null;
    }

    private ResultSet excuteSql(String sql) {
        System.out.println("执行Sql语句：" + sql);
        return null;
    }

    /**
     * 基于结果集进行定制，由具体的子类实现
     * @param rs
     * @return
     */
    abstract Object doInStatement(ResultSet rs);
}
