package com.baobaotao.proxy;

/**
 * Created by Administrator on 2017/12/11.
 */
public class TestForumService {
    public static void main(String[] args) {
        ForumService forumService = new ForumServiceImpl();
        forumService .removeForum(10);
        forumService .removeTopic(1012);
    }
}
