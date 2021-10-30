package com.example.demo;

import com.example.dao.bossdao;
import com.example.dao.bossdaot;
import com.example.dao.useranno;
import com.example.dao.userdao;
import com.example.pojo.boss;
import com.example.pojo.onetomore.bosses;
import com.example.pojo.user;
import com.example.pojo.user_t;
import com.example.pojo.users;
import com.example.utils.SessionFact;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
class DemoApplicationTests {

    Logger logger = Logger.getLogger(DemoApplicationTests.class);

    @Test
    void insertus(){

      SqlSession Sqlsession = SessionFact.getSession();

        userdao userdao = Sqlsession.getMapper(userdao.class);

      int rows = userdao.insertus(new user(22,"lisi",30,2));
        if (rows >0){
            System.out.println("okkk");
            Sqlsession.commit();
        }
        Sqlsession.close();
    }


    @Test
    void selectuse(){

        SqlSession Sqlsession = SessionFact.getSession();

        //方式一
        userdao userdao = Sqlsession.getMapper(userdao.class);

        List<user> listuser = userdao.selectuser();

        //方式二
//       List<user> userlist = Sqlsession.selectList("com.example.dao.userdao.selectuser");

        for (user use: listuser){
            System.out.println(use);
        }

    }

    @Test
    void selectById(){
        SqlSession session = SessionFact.getSession();
        userdao userdao = session.getMapper(com.example.dao.userdao.class);

        user use = userdao.selectById(1);

        System.out.println(use);
        session.close();
    }

    @Test
    void deleteById(){
        SqlSession session = SessionFact.getSession();
        userdao userdao = session.getMapper(com.example.dao.userdao.class);
        int rows =  userdao.deleteById(2);

        System.out.println("ok");

        session.commit();

        List<user> list = userdao.selectuser();
        for (user use: list){
            System.out.println(use);
        }
        session.close();
    }

    @Test
    void updateById(){

        SqlSession session = SessionFact.getSession();
        userdao userdao = session.getMapper(com.example.dao.userdao.class);

        userdao.updateById(new user(2,"lisisi",222,2));

        userdao.updateById(new user(3,"zhangsansan",30,2));

        session.commit();
        session.close();
    }

    @Test
    void insertus2(){

        SqlSession Sqlsession = SessionFact.getSession();

        userdao userdao = Sqlsession.getMapper(userdao.class);

        Map<String,Object> map = new HashMap<>();

        map.put("id",5);
        map.put("name","nixx");
        map.put("age",15);

        map.put("id",55);
        map.put("name","woxx");
        map.put("age",35);
         userdao.insertus2(map);

            Sqlsession.commit();

        Sqlsession.close();
    }

    @Test
    void selectbyuset(){
        SqlSession session = SessionFact.getSession();
        userdao userdao = session.getMapper(com.example.dao.userdao.class);

        user_t ut = userdao.selectbyuset(11);

        logger.debug("0.3212313");
        System.out.println(ut);
        session.commit();
        session.close();
    }

    @Test
    void logtest(){
        logger.debug("debug");
        logger.info("info");
        logger.error("error");
    }

    @Test
    void selectbyanno(){
        SqlSession session = SessionFact.getSession();
        useranno useranno = session.getMapper(com.example.dao.useranno.class);
       user user = useranno.selectbyanno(11);
        logger.info(user);
        session.commit();
        session.close();
    }

//    @Test
//    void insertboss(){
//        SqlSession session = SessionFact.getSession();
//        bossdao bossdao = session.getMapper(com.example.dao.bossdao.class);
//        bossdao.insert(new boss(2,"李四",323));
//        session.commit();
//        session.close();
//    }

    @Test
    void selecttoboss(){
        SqlSession session = SessionFact.getSession();
        userdao  userdao = session.getMapper(com.example.dao.userdao.class);
        List<users> list = userdao.selecttoboss();

        for (users use:list) {
            System.out.println(use);
        }

        session.close();
    }

    @Test
    void selectbossbyid(){
        SqlSession session = SessionFact.getSession();
        bossdaot bossdaot = session.getMapper(com.example.dao.bossdaot.class);
        List<bosses> bosses =bossdaot.selectbyid(1);
        for (com.example.pojo.onetomore.bosses boss : bosses) {
            System.out.println(boss);
        }

        session.close();
    }

    @Test
    void selectbossbyid2(){
        SqlSession session = SessionFact.getSession();
        bossdaot bossdaot = session.getMapper(com.example.dao.bossdaot.class);
        bosses bo =bossdaot.selectuserscon(1);
        System.out.println(bo);


        session.close();
    }

    @Test
    void selectbossbyid22(){
        SqlSession session = SessionFact.getSession();
        bossdaot bossdaot = session.getMapper(com.example.dao.bossdaot.class);
        bosses bo =bossdaot.selectuserscon2(1);
        System.out.println(bo);


        session.close();
    }

    @Test
    void selecttobos(){

        SqlSession session = SessionFact.getSession();
        bossdao bossdao = session.getMapper(com.example.dao.bossdao.class);
        boss bos = bossdao.selecttobos(1);
        System.out.println(bos);
        session.close();
    }

    @Test
    void selecttofor(){

        SqlSession session = SessionFact.getSession();
        bossdao bossdao = session.getMapper(com.example.dao.bossdao.class);
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        Map<String,Object> map = new HashMap<>();
        map.put("ids",list);
        List<boss> bo = bossdao.selectbyfor(map);
        for (boss boss : bo) {
            System.out.println(boss);
        }
        session.close();
    }
}
