package com.soecode.lyf.web;

import com.soecode.lyf.dto.BackResult;
import com.soecode.lyf.dto.TtUtils;
import com.soecode.lyf.entity.TtAuthentification;
import com.soecode.lyf.entity.TtUser;
import com.soecode.lyf.service.RTtAuthentificationService;
import com.soecode.lyf.service.RTtUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@ResponseBody
@RequestMapping("/ttUser")
public class RUserMsgController {
    @Autowired
    RTtUserService ttUserServiceImpl;
    @Autowired
    RTtAuthentificationService ttAuthentificationServiceImpl;

    /**
     * 用户登录
     * Fyr
     * @return
     */
    @RequestMapping(value = "userLogin",method = RequestMethod.POST)
    public BackResult userLogin(String phone){
        TtUser user = ttUserServiceImpl.getTtUserByPhone(phone);
        Map map = new HashMap();
        //如果用户不存在就注册
        if(user==null){
            List<String> ttlist = ttUserServiceImpl.getAllUserTt();
            String tt = TtUtils.getRandUserId(TtUtils.RandomNum(),ttlist);
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            TtUser reguser = new TtUser();
            reguser.setAvatar("");
            reguser.setCreateDate(format.format(new Date()));
            reguser.setUpdateDate(format.format(new Date()));
            reguser.setOpenId("");
            reguser.setPerformance("100");
            reguser.setPhone(phone);
            reguser.setTt(tt);
            ttUserServiceImpl.addTtUser(reguser);
            map.put("phone",phone);
            map.put("performance","100");
            map.put("tt",tt);
        }else{
            map.put("phone",user.getPhone());
            map.put("performance",user.getPerformance());
            map.put("tt",user.getTt());
        }
        return BackResult.build(0,"success",map);
    }

    /**
     * 跳转到信息认证
     * Fyr
     * @param userId
     * @return
     */
    @RequestMapping(value = "getUserMsg",method = RequestMethod.POST)
    public BackResult getUserMsg(String userId){
        return BackResult.build(0,"success",ttAuthentificationServiceImpl.getTtAuthentificationByUserId(userId));
    }

    /**
     * 保存用户信息（信息认证）
     * @param userId
     * @param name
     * @param sex
     * @param school
     * @param number
     * @return
     */
    @RequestMapping(value = "saveUserMsg",method = RequestMethod.POST)
    public BackResult saveUserMsg(String userId,String name,String sex,String school,String number){
        TtAuthentification ttAuthentification = ttAuthentificationServiceImpl.getTtAuthentificationByUserId(userId);
        if(ttAuthentification!=null){
            ttAuthentification.setName(name);
            ttAuthentification.setSex(sex);
            ttAuthentification.setSchool(school);
            ttAuthentification.setNumber(number);
            ttAuthentification.setUpdateDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
            ttAuthentificationServiceImpl.updateTtAuthentification(ttAuthentification);
        }else{
            ttAuthentification = new TtAuthentification();
            ttAuthentification.setUpdateDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
            ttAuthentification.setNumber(number);
            ttAuthentification.setName(name);
            ttAuthentification.setSex(sex);
            ttAuthentification.setSchool(school);
            ttAuthentification.setUserId(userId);
            ttAuthentification.setContraryImg("");
            ttAuthentification.setCreateDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
            ttAuthentification.setFrontImg("");
            ttAuthentification.setType("");
            ttAuthentificationServiceImpl.addTtAuthentification(ttAuthentification);
        }
        return BackResult.build(0,"success");
    }
}
