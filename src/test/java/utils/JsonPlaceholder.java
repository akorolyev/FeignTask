package utils;

import enums.FileNames;
import enums.Paths;
import feign.*;
import feign.gson.GsonDecoder;
import feign.gson.GsonEncoder;

public interface JsonPlaceholder {

    @RequestLine("GET /posts")
    Response getPosts();

    @RequestLine("GET /posts/{id}")
    Response getPost(@Param("id")int id);

    @RequestLine("POST /posts")
    @Headers("Content-Type: application/json")
    @Body("%7B\"userId\": \"{userId}\", \"title\": \"{title}\", \"body\": \"{body}\"%7D")
    Response postNewPost(@Param("userId") String userId, @Param("title") String title, @Param("body") String body);

    @RequestLine("GET /users/{id}")
    Response getUser(@Param("id") int id);

    @RequestLine("GET /users")
    Response getAllUsers();

    JsonPlaceholder jsonPlaceholder = Feign.builder()
            .encoder(new GsonEncoder())
            .decoder(new GsonDecoder())
            .target(JsonPlaceholder.class, PropertyUtils.readDataFromFiles("HOST", Paths.RESOURCE, FileNames.CONFIG));
}