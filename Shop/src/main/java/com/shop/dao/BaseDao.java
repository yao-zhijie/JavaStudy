package com.shop.dao;

import com.shop.utils.JdbcUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/*
* 设计目的：拥有基本的增删改查
* 必须要让DaoImpl类继承
* */
public abstract class BaseDao {
    private QueryRunner queryRunner = new QueryRunner();
    /*
    * DQL 数据查询语言  Mysql所有的查询语言
    * DML 数据操纵语言  Mysql所有的增删改
    * DDL 数据定义语言  Mysql对表结构进行增删改
    * DCL 数据控制语言  Mysql对用户控制权限操作
    *
    * */

    /**
     * updata()方法 用来执行DML：增删改
     * @param sql
     * @param args
     * @return 返回受影响的行数， 如果是-1 说明执行失败
     */
    public int update(String sql,Object ... args){
        Connection connection = JdbcUtils.getConnection();
        int update = 0;
        try {
            update = queryRunner.update(connection, sql, args);
            return update;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            JdbcUtils.close(connection);
        }
        return -1;
    }

    /**
     * 查询返回多个JavaBean的SQL语句
     * @param type 返回的对象类型
     * @param sql 执行的SQL语句
     * @param args SQL对应的参数值
     * @param <T> 返回的类型泛型
     * @return
     */
    public <T> List<T> queryForlist (Class<T> type , String sql ,Object... args){
        Connection connection = JdbcUtils.getConnection();
        try {
            List<T> query = queryRunner.query(connection, sql, new BeanListHandler<T>(type), args);
            return query;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            JdbcUtils.close(connection);
        }
        return null;

    }

    /**
     * 查询返回一个JavaBean的SQL语句
     * @param type 返回的对象类型
     * @param sql 执行的SQL语句
     * @param args SQL对应的参数值
     * @param <T> 返回的类型泛型
     * @return
     */
    public <T> T queryForOne (Class<T> type , String sql ,Object... args){
        Connection connection = JdbcUtils.getConnection();
        try {
            T query = queryRunner.query(connection, sql, new BeanHandler<T>(type), args);
            return query;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            JdbcUtils.close(connection);
        }
        return null;

    }

    /**
     * 查询返回单格的SQL语句
     * @param sql 执行的SQL语句
     * @param args SQL对应的参数值
     * @return
     */
    public Object queryForSingValue (String sql ,Object... args){
        Connection connection = JdbcUtils.getConnection();

        try {
            Object query = queryRunner.query(connection, sql, new ScalarHandler(), args);
            return query;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            JdbcUtils.close(connection);
        }
        return null;

    }
}
