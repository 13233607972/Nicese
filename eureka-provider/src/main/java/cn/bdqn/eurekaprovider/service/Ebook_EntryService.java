package cn.bdqn.eurekaprovider.service;

import cn.bdqn.pojo.Ebook_Entry;

import java.util.List;

public interface Ebook_EntryService {
    List<Ebook_Entry> getAll();
    Integer add(Ebook_Entry ebook_entry);
    Integer del(Integer id);
    List<Ebook_Entry> getOne(Integer id);
    Integer upd(Ebook_Entry ebook_entry);
}
