package utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.Charsets;
import com.google.gson.Gson;
import feign.Feign;
import feign.Response;
import feign.gson.GsonDecoder;
import models.Post;
import models.User;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import static utils.JsonPlaceholder.jsonPlaceholder;

public class ApiUtils {

    public static String returnJsonString(Response response) throws IOException {
        String jsonString = IOUtils.toString(response.body().asInputStream(), Charsets.UTF_8);
        return jsonString;
    }

    public static void getAllPosts(Response response) throws IOException {
        List<Post> allPosts = Arrays.asList(new ObjectMapper().readValue(returnJsonString(response), Post[].class));
    }

    public static String isListInJson(Response allPostsResponse){
        Map<String, Collection<String>> headers = allPostsResponse.headers();
                return headers.get("Content-Type").toString();
    }

    public static int returnStatus(Response emptyPostsResponse){
        return emptyPostsResponse.status();
    }

    public static Post returnPost(Response response) throws IOException {
        return new Gson().fromJson(returnJsonString(response), Post.class);
    }

    public static User returnUser(Response response) throws IOException {
        return new Gson().fromJson(returnJsonString(response), User.class);
    }
}
