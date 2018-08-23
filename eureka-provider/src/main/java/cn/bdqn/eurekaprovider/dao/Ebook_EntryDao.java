package cn.bdqn.eurekaprovider.dao;

import cn.bdqn.pojo.Ebook_Entry;

import java.util.List;

public interface Ebook_EntryDao {
    /*
     *查询全部
     */
    List<Ebook_Entry> getAll();
    /**
     * 添加图书
     */
    Integer add(Ebook_Entry ebook_entry);
    /**
     * 删除
     */
    Integer del(Integer id);
    /**
     * 修改查询
     */
    List<Ebook_Entry> getOne(Integer id);
    /**
     * 修改
     */
    Integer upd(Ebook_Entry ebook_entry);
}
