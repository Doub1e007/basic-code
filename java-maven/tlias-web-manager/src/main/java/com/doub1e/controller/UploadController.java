package com.doub1e.controller;

import com.doub1e.entity.Result;
import lombok.extern.slf4j.Slf4j;
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
    @PostMapping("/upload")
    public Result upload(String username, Integer age, MultipartFile file) throws Exception {
        log.info("参数：{},{},{}",username,age,file);

        // 1.获取原始文件名
        String originalFilename = file.getOriginalFilename();  // eg girl.jpg

        // 2.通过UUID生成随机字符串
        String newFileName = UUID.randomUUID().toString() + originalFilename.substring(originalFilename.lastIndexOf("."));   // .jpg

        // 2.将前端上传的文件存到本地
        file.transferTo(new File("D:/" +  newFileName));

        return Result.success(newFileName);
    }
}
