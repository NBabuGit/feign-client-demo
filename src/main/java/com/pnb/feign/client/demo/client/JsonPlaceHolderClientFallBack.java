package com.pnb.feign.client.demo.client;

import com.pnb.feign.client.demo.dto.Post;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Component
public class JsonPlaceHolderClientFallBack implements JsonPlaceHolderClient{
    @Override
    public List<Post> getPosts() {
        return Collections.EMPTY_LIST;
    }
}
