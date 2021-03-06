package com.hawk.book.handle;

import com.hawk.book.data.entity.User;

/**
 * 使用 ThreadLocal 存放当前登录用户
 *
 * @author wangshuguang
 * @since 2017/12/26
 */
public class UserContextHolder {

    private static final ThreadLocal<User> userThreadLocal = new ThreadLocal<>();

    public static User get() {
        return userThreadLocal.get();
    }

    public static void set(User user) {
        userThreadLocal.set(user);
    }

    public static void remove() {
        userThreadLocal.remove();
    }
}
