/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.edu.djtu.service;

import cn.edu.djtu.dao.FriendDaoImpl;
import cn.edu.djtu.vo.Friend;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class FriendService {
    //添加好友信息的服务

    public int reg(Friend friend) {
        int i = 0;
        FriendDaoImpl fdi = new FriendDaoImpl();
        i = fdi.insertFriend(friend);
        return i;
    }
    //按条件查询好友信息的服务

    public List<Friend> showFriends(String condition, String type, String username) {
        List<Friend> list = new ArrayList<Friend>();
        FriendDaoImpl fdi = new FriendDaoImpl();
        int i = Integer.parseInt(type);
        switch (i) {
            case 1:
                list = fdi.queryAll(username);
                break;
            case 2:
                list = fdi.queryByFname(condition, username);
                break;
            case 3:
                list = fdi.queryByFnameLike(condition, username);
                break;
        }
        return list;
    }
    //更新用户信息的服务

    public int update(Friend friend) {
        int i = 0;
        FriendDaoImpl fdi = new FriendDaoImpl();
        i = fdi.updateFriend(friend);
        return i;
    }
    //删除用户信息的服务
    public int delete(Integer fid) {
        int i = 0;
        FriendDaoImpl fdi = new FriendDaoImpl();
        i = fdi.deleteFriend(fid);
        return i;
    }
}
