package com.paul623.javaweb.ex.humanresourcemanagement.controller;

import com.paul623.javaweb.ex.humanresourcemanagement.entity.Document;
import com.paul623.javaweb.ex.humanresourcemanagement.entity.User;
import com.paul623.javaweb.ex.humanresourcemanagement.service.DocumentService;
import com.paul623.javaweb.ex.humanresourcemanagement.utils.Constants;
import com.paul623.javaweb.ex.humanresourcemanagement.utils.DateHelper;
import org.apache.catalina.startup.AddPortOffsetRule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.*;
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
        List<Document> documents = documentService.get_DocumentList();
        if (content!=null){
            documents = documentService.get_DocumentLikeList(content);
        }
        System.out.println(documents);
        model.addAttribute("list",documents);
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
        if(id!=null){
            documentService.update_DocumentInfo(document);
        }else{
            /**
             * 上传文件
             */
            //String path = session.getServletContext().getRealPath("/upload/");
            String filename = document.getFile().getOriginalFilename();
            String path = System.getProperty("user.dir")+"\\doc";
            File tempFile = new File(path+File.separator+filename);
            if (!tempFile.getParentFile().exists()){
                tempFile.getParentFile().mkdirs();
            }
            tempFile.createNewFile();
            document.setCreateDate(DateHelper.getCurDate());
            document.setUser((User) session.getAttribute(Constants.USER_SESSION));
            document.getFile().transferTo(tempFile);
            document.setFilename(filename);
            document.setFileAdd(tempFile.getAbsolutePath());
            documentService.insert_DocumentInfo(document);
        }
        mv.setViewName("redirect:/document/list");
        return mv;
    }
    @RequestMapping("/document/delete")
    public void delete(Integer id){
        if(id!=null){
            documentService.delete_DocumentInfo(id);
        }
    }

    @RequestMapping("/document/download")
    public void downLoadFile(Integer id, HttpServletResponse response){
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        InputStream is = null;
        Document document=documentService.get_DocumentInfo(id);
        if(document==null){
            return;
        }
        File file = new File(document.getFileAdd());
        try {
            is = new FileInputStream(file);
            response.reset();
            response.setContentType("application/x-msdownload");
            response.setHeader("Content-Length", String.valueOf(file.length()));
            response.setHeader(
                    "Content-disposition",
                    "attachment; filename="
                            + new String(document.getFilename().getBytes("GBK"),
                            "ISO8859-1"));
            bis = new BufferedInputStream(is);
            bos = new BufferedOutputStream(response.getOutputStream());
            byte[] buff = new byte[2048];
            int bytesRead;
            while (-1 != (bytesRead = bis.read(buff, 0, buff.length))) {
                bos.write(buff, 0, bytesRead);
            }
        } catch (Exception e) {
            e.printStackTrace();
            response.setContentType("text/html");
            try {
                response.getWriter().print("download failed");
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        } finally {
            try {
                if (is != null)
                    is.close();
                if (bis != null)
                    bis.close();
                if (bos != null)
                    bos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
