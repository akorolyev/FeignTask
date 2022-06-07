package tests;

import data.Parameters;
import enums.ContentTypes;
import enums.FileNames;
import enums.Paths;
import enums.Statuses;
import feign.Response;

import org.testng.Assert;
import org.testng.annotations.Test;
import utils.ApiUtils;
import utils.JsonPlaceholder;
import utils.PropertyUtils;
import utils.StringUtils;

import java.io.IOException;

public class FeignREST extends BaseTest {

    private static final String NEW_POST_BODY = StringUtils.textGeneration(6);
    private static final String NEW_POST_TITLE = StringUtils.textGeneration(6);

        @Test
        public static void testFeignRest() throws IOException {
            logStep("Send GET Request to get all posts");
            Response allPosts = JsonPlaceholder.jsonPlaceholder.getPosts();
            Assert.assertEquals(ApiUtils.isListInJson(allPosts), ContentTypes.JSON.toString(),"The list in response body is not json");
            Assert.assertEquals(ApiUtils.returnStatus(allPosts), Statuses.OK.toInt(), "Status is not 200");

            logStep("Send GET request to get post with id=99");
            Response post = JsonPlaceholder.jsonPlaceholder.getPost(99);
            Assert.assertEquals(ApiUtils.returnStatus(post), Statuses.OK.toInt(), "Status is not 200");
            Assert.assertEquals(ApiUtils.returnPost(post), Parameters.getExpectedPost(), "Post information is not correct");

            logStep("Send GET request to get post with id=150");
            Response emptyPost = JsonPlaceholder.jsonPlaceholder.getPost(150);
            Assert.assertEquals(ApiUtils.returnStatus(emptyPost), Statuses.NOT_FOUND.toInt(), "Status is not 404");
            Assert.assertEquals(ApiUtils.returnJsonString(emptyPost), Parameters.getExpectedEmptyPost(), "Response body is not empty.");

            logStep("Send POST request to create post with userId=1 and random body and random title");
            Response newPost = JsonPlaceholder.jsonPlaceholder.postNewPost(PropertyUtils.readDataFromFiles("NEW_POST_USER_ID", Paths.RESOURCE, FileNames.DATA),
                    NEW_POST_BODY, NEW_POST_TITLE);
            Assert.assertEquals(ApiUtils.returnStatus(newPost), Statuses.CREATED.toInt(), "Status is not 201");
            Assert.assertEquals(ApiUtils.returnPost(newPost), Parameters.getNewExpectedPost(NEW_POST_BODY, NEW_POST_TITLE), "Post information is not correct");

            logStep("Send GET request to get users");
            Response allUsers = JsonPlaceholder.jsonPlaceholder.getAllUsers();
            Assert.assertEquals(ApiUtils.returnStatus(allUsers), Statuses.OK.toInt(), "Status is not 200");
            Assert.assertEquals(ApiUtils.isListInJson(allUsers), ContentTypes.JSON.toString(), "The list in response body is not json");

            logStep("Send GET request to get user with id=5");
            Response user = JsonPlaceholder.jsonPlaceholder.getUser(5);
            Assert.assertEquals(ApiUtils.returnStatus(user), Statuses.OK.toInt(), "Status is not 200");
            Assert.assertEquals(ApiUtils.returnUser(user), Parameters.getExpectedUser(), "Users don't match");
    }
}
