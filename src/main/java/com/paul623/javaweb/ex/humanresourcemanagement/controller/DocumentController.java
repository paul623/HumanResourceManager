package com.paul623.javaweb.ex.humanresourcemanagement.controller;

import com.paul623.javaweb.ex.humanresourcemanagement.entity.Document;
import com.paul623.javaweb.ex.humanresourcemanagement.service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.util.List;

@Controller
public class DocumentController {

    @Autowired
    DocumentService documentService;

    @RequestMapping("/document/")
    public ModelAndView index2(ModelAndView mv){
        mv.setViewName("document/list");
        return mv;
    }
    // 如果在目录下输入任何不存在的参数，则跳转到list
    @RequestMapping("/document/{formName}")
    public String index2(String formName){
        String blank = "/document/list";
        return blank;
    }
    @RequestMapping("/document/list")
    public String index(Model model, String content){
        List<Document> job_list = documentService.get_DocumentList();
        if (content!=null){
            job_list = documentService.get_DocumentLikeList(content);
        }
        model.addAttribute("list",job_list);
        return "document/list";
    }
    @GetMapping("/document/add")
    public String add(Model model,Integer id){
        if(id!=null){
            Document job = documentService.get_DocumentInfo(id);
            model.addAttribute("job",job);
        }
        return "/document/add";
    }
    @PostMapping("/document/add")
    public ModelAndView add(ModelAndView mv, @ModelAttribute Document document , Integer id, HttpSession session)
            throws Exception{
        System.out.println(id);
        if(id!=null){
            documentService.update_DocumentInfo(document);
        }else{
            /**
             * 上传文件
             */
            String path = session.getServletContext().getRealPath("/upload/");
            String filename = document.getFile().getOriginalFilename();
            path = System.getProperty("user.dir")+"\\pic";
            File tempFile = new File(path+File.separator+filename);
            tempFile.createNewFile();
            document.getFile().transferTo(tempFile);
            document.setFilename(filename);
            documentService.insert_DocumentInfo(document);
        }
        mv.setViewName("redirect:/document/list");
        return mv;
    }
    @RequestMapping("/document/delete")
    public void delete(Integer id){
        System.out.println(id);
        if(id!=null){
            documentService.delete_DocumentInfo(id);
        }
    }
}
