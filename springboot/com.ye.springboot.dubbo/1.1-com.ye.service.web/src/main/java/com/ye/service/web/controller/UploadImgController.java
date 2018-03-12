package com.ye.service.web.controller;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by zjx on 2018/2/8.
 */
@Controller
@RequestMapping("/upload")
public class UploadImgController {

    @ResponseBody
    @RequestMapping("/imgUpload")
    public String uploadImg(@RequestParam("imgName")MultipartFile multipartFile) throws IOException {
        String localUrl="D:\\360Downloads\\img";
        if(multipartFile.isEmpty() || StringUtils.isBlank(multipartFile.getOriginalFilename())){
            return "请上传图片";
        }
        String contentType = multipartFile.getContentType();
        if(!contentType.contains("")){
            return "图片格式不正确";
        }
        String root_fileName = multipartFile.getOriginalFilename();
        System.out.println("上传图片:name={},type={}=="+root_fileName+";====="+contentType);
        String file_name = saveImg(multipartFile, localUrl);
        return file_name;
    }

    /**
     * 保存文件，直接以multipartFile形式
     * @param multipartFile
     * @param path 文件保存绝对路径
     * @return 返回文件名
     * @throws IOException
     */
    private static String saveImg(MultipartFile multipartFile,String path) throws IOException {
        File file = new File(path);
        if (!file.exists()) {
            file.mkdirs();
        }
        FileInputStream fileInputStream = (FileInputStream) multipartFile.getInputStream();
        String fileName = toHQRS_OrderNo(1234567890L,"5001") + ".png";
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(path + File.separator + fileName));
        byte[] bs = new byte[1024];
        int len;
        while ((len = fileInputStream.read(bs)) != -1) {
            bos.write(bs, 0, len);
        }
        bos.flush();
        bos.close();
        return fileName;
    }
    /**
     * 横琴订单号
     *
     * @param t1
     * @return
     */
    private static String toHQRS_OrderNo(Long t1, String salesChannel) {
        String ttt = Long.toString(t1, 36);
        //PrintUtil.outLn(ttt);
        long t2 = t1 >> 22;
        //1477929600000L=2016-11-1-0:0:0
        long t3 = 1477929600000L + t2;
        //System.out.println(t3);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
        Date date = new Date(t3);
        String t4 = simpleDateFormat.format(date);
        //System.out.println(t4);
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("HHmmss");
        String t42 = simpleDateFormat2.format(date);
        String t1Str = t1.toString();
        String t5 = t1Str.substring(t1Str.length() - 5);
        //PrintUtil.outLn(t5);
        String tt2 = "1" + t42 + t5;
        //System.out.println(tt2);
        String t61 = Long.toString(Long.parseLong(tt2), 36);
        //System.out.println(t61);
        String result = salesChannel + t4 + t61;
        return result;
    }
}
