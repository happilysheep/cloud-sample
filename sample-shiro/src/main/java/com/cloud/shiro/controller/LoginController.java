package com.cloud.shiro.controller;

import com.alibaba.fastjson.JSONObject;
import com.cloud.shiro.domain.User;
import com.cloud.shiro.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wangzhijun
 * @create 2018-09-25 10:13
 * @description
 */

@Controller
@Api(value="login",description="登陆方面的")
public class LoginController {
    @Autowired
    private UserService userService;

    @RequestMapping(value="getPasswordByUserName",method = RequestMethod.GET)
    @ApiOperation("获取用户密码")
    @ResponseBody
    public Object getPasswordByUserName(@RequestParam @ApiParam("用户名") String  userName){
        return userService.getPasswordByUserName(userName);
        //throw new HttpClientErrorException(HttpStatus.NOT_FOUND,"qqqq");
    }


    @RequestMapping(value="/login",method = RequestMethod.POST)
    @ApiOperation("登陆")
    public String login(@RequestBody @ApiParam("用户") User user){
        Map map=new HashMap();
        map.put("aaa","111");
        map.put("aab","2");
        /*Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(user.getName(), user.getPass());
        token.setRememberMe(true);
        try {
            subject.login(token);
            map.put("token", subject.getSession().getId());
            map.put("msg", "登录成功");
        } catch (IncorrectCredentialsException e) {
            map.put("msg", "密码错误");        }
            catch (LockedAccountException e) {
                map.put("msg", "登录失败，该用户已被冻结");
        } catch (AuthenticationException e) {
            map.put("msg", "该用户不存在");
        } catch (Exception e) {
            e.printStackTrace();
        }
        // 此方法不处理登录成功,由shiro进行处理.*/
        return JSONObject.toJSONString(map);
        //return "www.baidu.com";
    }

    @RequestMapping(value="/tologin",method = RequestMethod.GET)
    public String tologin(){
        return "index";
    }
}