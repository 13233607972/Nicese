package cn.bdqn.eurekaprovider.controller;

import cn.bdqn.eurekaprovider.service.Ebook_EntryService;
import cn.bdqn.pojo.Ebook_Entry;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class Ebook_EntryController {

    @Autowired
    private Ebook_EntryService service;


    @ResponseBody
    @RequestMapping("getAll")
    public String getAll(){
        return JSON.toJSONString(service.getAll());
    }

    @RequestMapping("add")
    public String add(@RequestBody Ebook_Entry ebook_entry){
        return JSON.toJSONString(service.add(ebook_entry));
    }

    @RequestMapping("del/{id}")
    public String del(@PathVariable("id") Integer id){
        return JSON.toJSONString(service.del(id));
    }

    @RequestMapping("getOne/{id}")
    public String getOne(@PathVariable("id") Integer id){
        return JSON.toJSONString(service.getOne(id));
    }


    @RequestMapping("upd")
    public String upd(@RequestBody Ebook_Entry ebook_entry){
        return JSON.toJSONString(service.upd(ebook_entry));
    }
}
