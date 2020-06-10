package com.example.ordercenter_boot.util;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName createJWT
 * @Description
 * @Author changfan
 * @Date 2019-6-12 17:36
 * @Version 1.0
 **/
public class createJWTUtil  {

    /**
     * APP登录Token的生成和解析
     *
     */

    /** token秘钥，请勿泄露，请勿随便修改 backups:JKKLJOoasdlfj */
    public static final String SECRET = "JKKLJOoasdlfj";
    /** token 过期时间:  */
    public static final int calendarField = Calendar.MINUTE;
    public static final int calendarInterval = 1;

    public static String createJWT(String userName,String password,String staffId){

        // expire time
        Calendar nowTime = Calendar.getInstance();
        nowTime.add(calendarField, calendarInterval);
        Date expiresDate = nowTime.getTime();
        //指定head 签名加密算法
        Map<String,Object> map = new HashMap<>();
        map.put("alg","HS256");
        map.put("type","JWT");
        String token= JWT.create().withHeader(map)   //head
             .withClaim("userName",userName)  //payload
             .withClaim("password",password)   //payload
             .withClaim("staffId",staffId)     //payload
             .withIssuedAt(new Date())    //sign  time
             .withExpiresAt(expiresDate)
             .sign(Algorithm.HMAC256(SECRET));
        return  token;
    }

    /**
     *
     * @param token
     * @return
     */
    public  static Map<String,Claim>verifyToken(String token){
        DecodedJWT decodedJWT = null;
        JWTVerifier jwtVerifier = JWT.require(Algorithm.HMAC256(SECRET)).build();
        decodedJWT = jwtVerifier.verify(token);
        return decodedJWT.getClaims();
    }

    public static void main(String[] args) throws Exception {
        System.out.println(calendarField);
        String token=createJWT("changfan","abc123!@#A","30000125");
        System.out.println("加密之后的token:"+token);
        Thread.sleep(3000);
        //解密
         Map<String,Claim> map = verifyToken(token);
        System.out.println(map.get("userName").asString());
    }
}