package cn.bdqn.eurekaprovider.service.impl;

import cn.bdqn.eurekaprovider.dao.Ebook_EntryDao;
import cn.bdqn.eurekaprovider.service.Ebook_EntryService;
import cn.bdqn.pojo.Ebook_Entry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("Ebook_EntryService")
public class Ebook_EntryServiceImpl implements Ebook_EntryService {

    @Autowired
    private Ebook_EntryDao dao;

    @Override
    public List<Ebook_Entry> getAll() {
        return dao.getAll();
    }

    @Override
    public Integer add(Ebook_Entry ebook_entry) {
        return dao.add(ebook_entry);
    }

    @Override
    public Integer del(Integer id) {
        return dao.del(id);
    }

    @Override
    public List<Ebook_Entry> getOne(Integer id) {
        return dao.getOne(id);
    }

    @Override
    public Integer upd(Ebook_Entry ebook_entry) {
        return dao.upd(ebook_entry);
    }
}
