package com.vanshgandhi.scale;

import android.support.test.runner.AndroidJUnit4;

import com.vanshgandhi.scale.core.Scale;
import com.vanshgandhi.scale.models.ScaleCallback;
import com.vanshgandhi.scale.models.tasks.AttachmentType;
import com.vanshgandhi.scale.models.tasks.CategorizationTask;
import com.vanshgandhi.scale.models.tasks.Task;

import org.json.JSONException;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.HashMap;
import java.util.List;

import static junit.framework.Assert.assertNotNull;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith (AndroidJUnit4.class)
public class ScaleTest {

    @Before
    public void init() {
        Scale.init(BuildConfig.SCALE_API_KEY);
    }

    @Test
    public void createCategorization() throws InterruptedException, JSONException {
        CategorizationTask categorizationTask = new CategorizationTask();
        categorizationTask.setInstruction("test")
                .setCallbackUrl("http://van.sh")
                .setAttachmentType(AttachmentType.text)
                .setCategories(new String[]{"cat 1", "cat 2", "cat 3"})
                .setAttachment("thing to categorize")
                .setMetadata(new HashMap<String, Object>())
                .setCategoryIds(new HashMap<String, String>());
        categorizationTask.getMetadata().put("array", new String[]{"a", "b", "c"});
        categorizationTask.getCategoryIds().put("key1", "value1");
        categorizationTask.getCategoryIds().put("key2", "value2");
        Scale.createCategorizationTask(categorizationTask, new ScaleCallback<Task>() {
            @Override
            public void onSuccess(Task response) {
                assertNotNull("Success", response);
            }

            @Override
            public void onError(Exception e) {
                e.printStackTrace();
            }
        });
        Thread.sleep(5000);
    }

    @Test
    public void getAllTasks() throws InterruptedException {
        Scale.getAllTasks(new ScaleCallback<List<Task>>() {
            @Override
            public void onSuccess(List<Task> response) {
                assertNotNull("Success", response);
            }

            @Override
            public void onError(Exception e) {
                e.printStackTrace();
            }
        });
        Thread.sleep(3000);
    }

    @Test
    public void getTask() throws InterruptedException {
        Scale.getTask("57f9fc234b967c0600caddd8", new ScaleCallback<Task>() {
            @Override
            public void onSuccess(Task response) {
                assertNotNull(response.getTaskId(), response);
            }

            @Override
            public void onError(Exception e) {

            }
        });
        Thread.sleep(3000);
    }
}
