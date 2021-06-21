/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.edu.djtu.dao;

import cn.edu.djtu.vo.Friend;
import java.util.List;

/**
 *
 * @author Administrator
 */
public interface FriendDao {

    public int insertFriend(Friend friend);

    public List<Friend> queryByFname(String fname, String username);

    public List<Friend> queryByFnameLike(String fname, String username);

    public List<Friend> queryAll(String username);

    public Friend queryByFid(Integer fid);

    public int updateFriend(Friend friend);

    public int deleteFriend(Integer fid);
}
