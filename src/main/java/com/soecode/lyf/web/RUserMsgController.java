package com.soecode.lyf.web;

import com.soecode.lyf.dto.BackResult;
import com.soecode.lyf.dto.TtUtils;
import com.soecode.lyf.entity.*;
import com.soecode.lyf.service.*;
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
    @Autowired
    RTtReceiveService rTtReceiveServiceImpl;
    @Autowired
    RTtTypeService rTtTypeServiceImpl;
    @Autowired
    RTtSureOrderService rTtSureOrderServiceImpl;
    @Autowired
    RTtOrderService rTtOrderServiceImpl;
    @Autowired
    RTtUserQiShiService rTtUserQiShiServiceImpl;
    @Autowired
    RTtQiOrderService rTtQiOrderServiceImpl;


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


    /**
     * 跳转到地址编辑
     * Fyr
     * @param userId
     * @return
     */
    @RequestMapping(value = "getUserAddress",method = RequestMethod.POST)
    public BackResult getUserAddress(String userId){
        return BackResult.build(0,"success",rTtReceiveServiceImpl.gettReceiveByUserId(userId));
    }


    /**
     * 保存用户收货地址
     * Fry
     * @param userId
     * @param name
     * @param sex
     * @param address
     * @param detail
     * @param phone
     * @return
     */
    @RequestMapping(value = "saveUserAddress",method = RequestMethod.POST)
    public BackResult saveUserAdress(String userId,String name,String sex,String address,String detail,String phone){
        TtReceive tr = rTtReceiveServiceImpl.gettReceiveByUserId(userId);
        if(tr!=null){
            tr.setName(name);
            tr.setSex(sex);
            tr.setAddress(address);
            tr.setDetail(detail);
            tr.setPhone(phone);
            tr.setUpdateDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
            rTtReceiveServiceImpl.updatetReceive(tr);
        }else{
            tr = new TtReceive();
            tr.setUpdateDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
            tr.setCreateDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
            tr.setPhone(phone);
            tr.setDetail(detail);
            tr.setName(name);
            tr.setSex(sex);
            tr.setAddress(address);
            tr.setUserId(userId);
            rTtReceiveServiceImpl.addtReceive(tr);
        }
        return BackResult.build(0,"success");
    }

    /**
     * 获取所有代做类型及收费信息
     * @return
     */
    @RequestMapping(value = "getAllType",method = RequestMethod.POST)
    public BackResult getAllType(){
        List<TtType> list = rTtTypeServiceImpl.getAllType();
        return BackResult.build(0,"success",list);
    }

    /**
     * 保存用户订单收发地址
     * @param ttOrder
     * userId
     * ttTypeId  1  2 ...
     * typeOrder 0取  1送  2买
     * getPhone   getAddress     getDetail
     * receivePhone   receiveAddress     receiveDetail
     * @return
     */
    @RequestMapping(value = "saveOrderAddress",method = RequestMethod.POST)
    public BackResult saveOrderAddress(TtOrder ttOrder){
        ttOrder.setCreateDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
        ttOrder.setUpdateDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
        ttOrder.setTtQiOrder("");
        ttOrder.setVersion("0");
        String ttorderId = TtUtils.TtRandomNum();
        ttOrder.setTtOrderId(ttorderId);
        rTtOrderServiceImpl.addTtOrder(ttOrder);
        TtType t = rTtTypeServiceImpl.getTtTypeById(ttOrder.getTtTypeId());
        Map map = new HashMap();
        map.put("ttOrderId",ttorderId);
        map.put("price",t.getPrice());
        return BackResult.build(0,"success",map);
    }

    /**
     * 用户支付成功，生成订单信息
     * @param ttSureOrder
     * userId
     * ttOrderId    ttCouponId     time(没有预约则传 "" 空引号)  level 0立即  1加急   2预约
     * remark    totalPrice（即price）
     * @return
     */
    @RequestMapping(value = "saveOrder",method = RequestMethod.POST)
    public BackResult saveOrder(TtSureOrder ttSureOrder){
        ttSureOrder.setCreateDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
        ttSureOrder.setUpdateDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
        ttSureOrder.setStatus("0");
        ttSureOrder.setPrice("");
        rTtSureOrderServiceImpl.addTtSureOrder(ttSureOrder);
        return BackResult.build(0,"success");
    }

    /**
     * 骑士接单
     * @param quserId
     * @param ttOrderId     version
     * @return
     */
    @RequestMapping(value = "qishiGetOrder",method = RequestMethod.POST)
    public BackResult qishiGetOrder(String quserId,String ttOrderId,String version){
        TtOrder to = rTtOrderServiceImpl.getTtOrderByOrderId(ttOrderId);
        to.setTtQiOrder(quserId);
        to.setVersion(version);
        int flag = rTtOrderServiceImpl.qishiGetOrder(to);
        if(flag==1){
            System.out.println("用户  ："+quserId+"抢单成功!");
            TtSureOrder ts = rTtSureOrderServiceImpl.getTtSureOrderByOrderId(ttOrderId);
            ts.setStatus("1");
            rTtSureOrderServiceImpl.updateStatus(ts);
            TtQiOrder t = new TtQiOrder();
            t.setAdditional("");
            t.setCreateDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
            t.setUpdateDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
            t.setMessage("");
            t.setQiShiUserId(quserId);
            t.setServe("");
            t.setSpeed("");
            t.setTtOrderId(ttOrderId);
            t.setTtUserId(to.getUserId());
            rTtQiOrderServiceImpl.addTtQiOrder(t);
            return BackResult.build(0,"success");
        }else{
            return BackResult.build(1,"抢单失败！");
        }
    }

    /**
     * 根据状态查询订单信息
     * @param userId
     * @param status   0待接单  1进行中   2已完成    3待评价    4已取消
     * @return
     */
    @RequestMapping(value = "getUserOrder",method = RequestMethod.POST)
    public BackResult getUserOrder(String userId,String status){
        List<TtSureOrder> list = rTtSureOrderServiceImpl.getTtSureOrdersByUserIdAndStatus(userId,status);
        return BackResult.build(0,"success",list);
    }

    /**
     * 根据订单号查询订单
     * @param orderId
     * @return
     */
    @RequestMapping(value = "getUserOrder",method = RequestMethod.POST)
    public BackResult getOrderMsg(String orderId){
        TtOrder to = rTtOrderServiceImpl.getTtOrderByOrderId(orderId);
        return BackResult.build(0,"success",to);
    }

    /**
     * 查询骑士信息
     * @param qishiId
     * @return
     */
    @RequestMapping(value = "getUserQishiMsg",method = RequestMethod.POST)
    public BackResult getUserQishiMsg(String qishiId){
        TtUserQiShi tu = rTtUserQiShiServiceImpl.getTtUserQiShiByTt(qishiId);
        return BackResult.build(0,"success",tu);
    }

    /**
     * 用户取消订单
     * @param userId
     * @param orderId
     * @return
     */
    @RequestMapping(value = "userQxOrder",method = RequestMethod.POST)
    public BackResult userQxOrder(String userId,String orderId){
        TtSureOrder t =  rTtSureOrderServiceImpl.getTtSureOrderByOrderId(orderId);
        if(t!=null){
            if(t.getUserId().equals(userId)){
                t.setStatus("4");
                rTtSureOrderServiceImpl.updateStatus(t);
                return BackResult.build(0,"success");
            }else{
                return BackResult.build(1,"取消订单失败(用户不匹配！)");
            }
        }else{
            return BackResult.build(1,"取消订单失败(订单不存在！)");
        }

    }


    /**
     *用户评论订单
     * @param orderId
     * @param speed
     * @param serve
     * @param additional
     * @param message
     * @return
     */
    @RequestMapping(value = "userPlOrder",method = RequestMethod.POST)
    public BackResult userPlOrder(String orderId,String speed,String serve,String additional,String message){
        TtQiOrder tq = rTtQiOrderServiceImpl.getTtQiOrderByTtOrderId(orderId);
        tq.setSpeed(speed);
        tq.setServe(serve);
        tq.setUpdateDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
        tq.setAdditional(additional);
        tq.setMessage(message);
        rTtQiOrderServiceImpl.updateQiOrderByTtOrderId(tq);
        return BackResult.build(0,"success");
    }


    /**
     * 1、用户，骑士 确认订单送达  （采用redis缓存加定时器任务）
     * 2、用户身份验证成为骑士
     * 3、后台实名审核、商品价格修改、优惠券等
     */

}
