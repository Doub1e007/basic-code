package com.doub1e.controller;

import com.doub1e.entity.AilOSSProperties;
import com.doub1e.entity.Result;
import com.doub1e.utils.AliyunOSSUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

@Slf4j
@RestController
public class UploadController {
    /**
     * 文件上传 -- 本地存储
     * @param username
     * @param age
     * @param file
     * @return
     */
//    @PostMapping("/upload")
//    public Result upload(String username, Integer age, MultipartFile file) throws Exception {
//        log.info("参数：{},{},{}",username,age,file);
//
//        // 1.获取原始文件名
//        String originalFilename = file.getOriginalFilename();  // eg girl.jpg
//
//        // 2.通过UUID生成随机字符串
//        String newFileName = UUID.randomUUID().toString() + originalFilename.substring(originalFilename.lastIndexOf("."));   // .jpg
//
//        // 2.将前端上传的文件存到本地
//        file.transferTo(new File("D:/" +  newFileName));
//
//        return Result.success(newFileName);
//    }

//    private final String bucketName = "java447-tlias";   // oss上的桶空间名
//    private final String endpoint = "https://oss-cn-hangzhou.aliyuncs.com"; // oss上对应的桶的域名

//    @Value("${aliyun.oss.bucket}")
//    private  String bucketName;   // oss上的桶空间名
//    @Value("${aliyun.oss.endpoint}")
//    private  String endpoint; // oss上对应的桶的域名

    @Autowired
    private AilOSSProperties ailOSSProperties;

    /**
     * 文件上传 -- 阿里云OSS存储
     * @param file
     * @return
     * @throws Exception
     */
    @PostMapping("/upload")
    public Result upload(MultipartFile file) throws Exception {
        // 1.获取原始文件名，截取后缀
        String originalFilename = file.getOriginalFilename();   // eg  1.2.3.jpg
        log.info("原始文件名：{}",file);
        String extName = originalFilename.substring(originalFilename.lastIndexOf(".")); // 获取后缀

        // 2.调用阿里云OSS工具类，将文件上传到OSS
        String url = AliyunOSSUtils.upload(ailOSSProperties.getEndpoint(), ailOSSProperties.getBucket(), file.getBytes(), extName);

        // 3.返回图片路径
        return Result.success(url);
    }
}
