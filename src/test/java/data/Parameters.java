package data;

import enums.FileNames;
import enums.Paths;
import models.Post;
import models.User;
import utils.PropertyUtils;

public class Parameters {
    public static User getExpectedUser(){
        User expectedUser = new User();
        expectedUser.setId(Integer.parseInt(PropertyUtils.readDataFromFiles("POST_ID", Paths.RESOURCE, FileNames.DATA)));
        expectedUser.setName(PropertyUtils.readDataFromFiles("NAME", Paths.RESOURCE, FileNames.DATA));
        expectedUser.setEmail(PropertyUtils.readDataFromFiles("EMAIL", Paths.RESOURCE, FileNames.DATA));
        expectedUser.setUserName(PropertyUtils.readDataFromFiles("USER_NAME", Paths.RESOURCE, FileNames.DATA));
        expectedUser.setCity(PropertyUtils.readDataFromFiles("CITY", Paths.RESOURCE, FileNames.DATA));
        expectedUser.setStreet(PropertyUtils.readDataFromFiles("STREET", Paths.RESOURCE, FileNames.DATA));
        expectedUser.setSuite(PropertyUtils.readDataFromFiles("SUITE", Paths.RESOURCE, FileNames.DATA));
        expectedUser.setZipCode(PropertyUtils.readDataFromFiles("ZIP_CODE", Paths.RESOURCE, FileNames.DATA));
        expectedUser.setLat(PropertyUtils.readDataFromFiles("LAT", Paths.RESOURCE, FileNames.DATA));
        expectedUser.setLng(PropertyUtils.readDataFromFiles("LNG", Paths.RESOURCE, FileNames.DATA));
        expectedUser.setPhone(PropertyUtils.readDataFromFiles("PHONE", Paths.RESOURCE, FileNames.DATA));
        expectedUser.setWebsite(PropertyUtils.readDataFromFiles("WEBSITE", Paths.RESOURCE, FileNames.DATA));
        expectedUser.setCompanyName(PropertyUtils.readDataFromFiles("COMPANY_NAME", Paths.RESOURCE, FileNames.DATA));
        expectedUser.setCatchPhrase(PropertyUtils.readDataFromFiles("CATCH_PHRASE", Paths.RESOURCE, FileNames.DATA));
        expectedUser.setBs(PropertyUtils.readDataFromFiles("BS", Paths.RESOURCE, FileNames.DATA));
        return expectedUser;
    }

    public static Post getExpectedPost(){
        Post expectedPost = new Post();
        expectedPost.setTitle(PropertyUtils.readDataFromFiles("TITLE", Paths.RESOURCE, FileNames.DATA));
        expectedPost.setBody(PropertyUtils.readDataFromFiles("BODY", Paths.RESOURCE, FileNames.DATA));
        expectedPost.setUserId(PropertyUtils.readDataFromFiles("USER_ID", Paths.RESOURCE, FileNames.DATA));
        expectedPost.setId(Integer.parseInt(PropertyUtils.readDataFromFiles("ID", Paths.RESOURCE, FileNames.DATA)));
        return expectedPost;
    }
    public static String getExpectedEmptyPost(){
        return "{}";
    }

    public static Post getNewExpectedPost(String newPostBody, String newPostTitle){
        Post newExpectedPost = new Post();
        newExpectedPost.setId(Integer.parseInt(PropertyUtils.readDataFromFiles("NEW_POST_ID", Paths.RESOURCE, FileNames.DATA)));
        newExpectedPost.setUserId(PropertyUtils.readDataFromFiles("NEW_POST_USER_ID", Paths.RESOURCE, FileNames.DATA));
        newExpectedPost.setTitle(newPostTitle);
        newExpectedPost.setBody(newPostBody);
        return newExpectedPost;
    }
}
