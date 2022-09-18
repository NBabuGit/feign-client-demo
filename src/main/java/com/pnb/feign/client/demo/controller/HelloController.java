package com.pnb.feign.client.demo.controller;

import com.pnb.feign.client.demo.client.JsonPlaceHolderClient;
import com.pnb.feign.client.demo.dto.Post;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@ResponseBody
public class HelloController {

    private final JsonPlaceHolderClient jsonPlaceHolderClient;

    public HelloController(JsonPlaceHolderClient jsonPlaceHolderClient) {
        this.jsonPlaceHolderClient = jsonPlaceHolderClient;
    }

    @GetMapping("/posts")
    public List<Post> getAllPosts() {
        return jsonPlaceHolderClient.getPosts();
    }
}
