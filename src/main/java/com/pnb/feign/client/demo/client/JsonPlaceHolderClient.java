package com.pnb.feign.client.demo.client;

import com.pnb.feign.client.demo.dto.Post;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(value = "jsonPlaceHolder", url = "https://jsonplaceholder.typicode.com/")
public interface JsonPlaceHolderClient {
    @GetMapping("/posts")
    List<Post> getPosts();
}
