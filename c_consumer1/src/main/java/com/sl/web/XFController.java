package com.sl.web;

import cn.tianyu.pojo.Manager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;

@RestController
public class XFController {

    @Autowired
    private RestTemplate restTemplate;

    private final String PUBCLIC_URL = "http://P-PROVIDER";

    @RequestMapping("/service/provider/testParam")
    public String test(@RequestParam("uname") String uname) {
        return uname + "使用了Eureka注册中心的服务提供者01！";
    }

    @RequestMapping("/service/provider/testParam2")
    public String test2() {
        return "无参好吧！";
    }

    @RequestMapping("/service/provider/manager")
    public Manager toManager() {
        Manager manager = new Manager(1, "zhangsan", "zhangsan123");
        return manager;
    }

    @RequestMapping("/service/provider/managerParam")
    public Manager toManager(@RequestParam("id") int id, @RequestParam("username") String username, @RequestParam("password") String password) {
        Manager manager = new Manager(id, username, password);
        return manager;
    }

    //    数组为参数
    @RequestMapping("/managerParamshuzu")
    public Manager managerParam() {
        String[] paramArray = {"1", "里斯", "lisi"};
        String url = PUBCLIC_URL + "/managerParamshuzu?id={0}&username={1}&password={2}";
        ResponseEntity<Manager> responseEntity = restTemplate.getForEntity(url, Manager.class, paramArray);
        return responseEntity.getBody();
    }

    @RequestMapping("/managerParamMap")
    public Manager managerParamMap() {
        HashMap<String, String> map = new HashMap<>();
        map.put("id", "1");
        map.put("username", "张三");
        map.put("password", "zhangsan");
        String url = PUBCLIC_URL + "/managerParamMap?id={id}&username={username}&password={password}";
        ResponseEntity<Manager> responseEntity = restTemplate.getForEntity(url, Manager.class, map);
        return responseEntity.getBody();
    }

    //    put
    @PutMapping("/putwucan")
    public String putest1(@RequestParam("uname") String uname) {
        return uname + "使用了Eureka注册中心的服务提供者01！";
    }

    @PutMapping("/putyoucan")
    public String puttest2() {
        return "无参好吧！";
    }


    @PutMapping("/putdxnoneParam")
    public Manager put3uptoManager() {
        Manager manager = new Manager(1, "zhangsan", "zhangsan123");
        return manager;
    }


    @PutMapping("/putdxParam")
    public Manager put4updateManager(@RequestParam("id") Integer id,
                                     @RequestParam("username") String username,
                                     @RequestParam("password") String password) {
        Manager manager = new Manager();
        manager.setId(id);
        manager.setUsername(username);
        manager.setPassword(password);
        System.out.println(id + "-" + username + "-" + password);
        return manager;
    }

    //    Delete
    @DeleteMapping("/deldx")
    public Manager deleteManager(@RequestParam("id") Integer id,
                                 @RequestParam("username") String username,
                                 @RequestParam("password") String password) {
        Manager manager = new Manager();
        manager.setId(id);
        manager.setUsername(username);
        manager.setPassword(password);
        return manager;
    }

    @DeleteMapping("/delyoucan")
    public String del1(@RequestParam("uname") String uname) {
        return uname + "使用了Eureka注册中心的服务提供者01！";
    }

    @DeleteMapping("/delwucan")
    public String p2test2() {
        return "无参好吧！";
    }


    @DeleteMapping("/deldx2")
    public Manager del2() {
        Manager manager = new Manager(1, "zhangsan", "zhangsan123");
        return manager;
    }


    @DeleteMapping("/deldx3")
    public Manager del3(@RequestParam("id") Integer id,
                        @RequestParam("username") String username,
                        @RequestParam("password") String password) {
        Manager manager = new Manager();
        manager.setId(id);
        manager.setUsername(username);
        manager.setPassword(password);
        System.out.println(id + "-" + username + "-" + password);
        return manager;
    }

    //    数组为参数
    @DeleteMapping("/delshuzu")
    public Manager managerParamdel() {
        String[] paramArray = {"1", "das", "lisi"};
        String url = PUBCLIC_URL + "/delret?id={0}&username={1}&password={2}";
        ResponseEntity<Manager> responseEntity = restTemplate.getForEntity(url, Manager.class, paramArray);
        return responseEntity.getBody();
    }

    @DeleteMapping("/delmap")
    public Manager managerParamMapdel() {
        HashMap<String, String> map = new HashMap<>();
        map.put("id", "1");
        map.put("username", "张三");
        map.put("password", "zhangsan");
        String url = PUBCLIC_URL + "/delmap?id={id}&username={username}&password={password}";
        ResponseEntity<Manager> responseEntity = restTemplate.getForEntity(url, Manager.class, map);
        return responseEntity.getBody();
    }
}
