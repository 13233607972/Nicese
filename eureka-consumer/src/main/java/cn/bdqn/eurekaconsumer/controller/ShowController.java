package cn.bdqn.eurekaconsumer.controller;

import cn.bdqn.pojo.Ebook_Entry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
public class ShowController {

    @Autowired
    private RestTemplate restTemplate;


    @ResponseBody
    @RequestMapping("getAll")
    public String getAll(){
        String info = restTemplate.getForObject("http://eureka-provider/getAll",String.class);
        return info;
    }

    @ResponseBody
    @RequestMapping("del/{id}")
    public String del(@PathVariable("id") Integer id){
        String info2 = restTemplate.getForObject("http://eureka-provider/del/"+id,String.class);
        return info2;
    }

    @ResponseBody
    @RequestMapping("add")
    public String add(Ebook_Entry ebook_entry){
        ResponseEntity<String> info1 = restTemplate.postForEntity("http://eureka-provider/add",ebook_entry,String.class);
        return info1.getBody();
    }

    @ResponseBody
    @RequestMapping("getOne/{id}")
    public String getOne(@PathVariable("id") Integer id){
        String info3 =restTemplate.getForObject("http://eureka-provider/getOne/"+id,String.class);
        return info3;
    }

    @ResponseBody
    @RequestMapping("upd")
    public String upd(Ebook_Entry ebook_entry){
        ResponseEntity<String> info4 = restTemplate.postForEntity("http://eureka-provider/upd",ebook_entry,String.class);
        return info4.getBody();
    }

    @RequestMapping("show")
    public String show(){
        return "show";
    }

    @RequestMapping("NewBook")
    public String NewBook(){
        return "NewBook";
    }
    @RequestMapping("UpdBook")
    public String UpdBook(Integer id, Model model){
        model.addAttribute("id",id);
        return "UpdBook";
    }
}
