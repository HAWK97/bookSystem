package com.hawk.book.data.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * User
 *
 * @author wangshuguang
 * @since 2018/02/09
 */
@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User extends BaseEntity {

    /**
     * 用户名(学号)
     */
    private String username;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 密码
     */
    private String password;

    /**
     * 用于密码加密的盐
     */
    private String salt;

    /**
     * 邮箱(找回密码时使用)
     */
    private String mail;
}
