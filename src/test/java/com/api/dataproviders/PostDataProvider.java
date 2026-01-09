package com.api.dataproviders;

import com.api.models.Posts;
import com.api.models.UpdatePost;
import org.testng.annotations.DataProvider;

public class PostDataProvider {

    // ✅ DataProvider for creating posts
    @DataProvider(name = "PostUserData")
    public static Object[][] getPosts() {
        return new Object[][] {
                { new Posts("Post for Instagram", "This is for the reels", 2), 201 },
                { new Posts("Post for LinkedIn", "This is for the job", 3), 201 },
                { new Posts("This is empty", "Contain Error", null), 201 }
        };
    }

    // ✅ DataProvider for updating posts
    @DataProvider(name = "UpdatePostData")
    public static Object[][] updatePost() {
        return new Object[][] {
                { new UpdatePost(1, "Update Title", "Update body", 11), 200 },
                { new UpdatePost(0, "", "", 0), 200 },
                { new UpdatePost(null, "LinkedIn Post", "Looking for QA", 25), 200 }
        };
    }

}
