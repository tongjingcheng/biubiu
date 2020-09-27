package com.jingcheng.oss.system.constant;

/**
 * 响应的code
 * @author tongjingcheng
 * @version 1.0
 * @date 2020/9/27 12:09
 */
public interface Codes {

    /** 未登录 */
    int UNAUTHEN = 4401;

    /** 未授权，拒绝访问 */
    int UNAUTHZ = 4403;

    /** session超时退出登录 */
    int SESSION_TIMEOUT = 4433;

    /** shiro相关的错误 */
    int SHIRO_ERR = 4444;

    /** 服务端异常 */
    int SERVER_ERR = 5500;

}
