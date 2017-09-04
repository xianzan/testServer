package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpServletRequest;

@Controller
public class FileController {
    @RequestMapping(value = "/",method = RequestMethod.GET)
    @ResponseBody
    public String index(){
        System.out.println("响应get请求");
        String result = " {\n" +
                "            \"request_id\" : \"index\"\n" +
                "        }";
        return result;
    }
    @RequestMapping(value = {"/"},method = RequestMethod.POST)
    @ResponseBody
    public String postIndex(){
        System.out.println("响应Post请求");
        String result = " {\n" +
                "            \"request_id\" : \"string\"\n" +
                "        }";

        return result;
    }
    @RequestMapping(value = "/attribute/document/get",method = RequestMethod.POST)
    @ResponseBody
    public String doDocument(HttpServletRequest request){

            System.out.println("请求实体内容："+ request.getContentLength()+"  : "+request.getServletContext().getServerInfo());
            String result = " {"+"\"request_id\":\"string\""+"}";
            return result;
    }

}
