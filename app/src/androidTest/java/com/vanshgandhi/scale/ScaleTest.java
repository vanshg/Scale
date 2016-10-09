package com.vanshgandhi.scale;

import android.support.test.runner.AndroidJUnit4;

import com.vanshgandhi.scale.core.Scale;
import com.vanshgandhi.scale.tasks.AttachmentType;
import com.vanshgandhi.scale.tasks.CategorizationTask;
import com.vanshgandhi.scale.tasks.Task;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.List;

import static junit.framework.Assert.assertNotNull;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith (AndroidJUnit4.class)
public class ScaleTest {
//    @Test
//    public void useAppContext() throws Exception {
//        // Context of the app under test.
//        Context appContext = InstrumentationRegistry.getTargetContext();
//    }

    @Before
    public void init() {
        Scale.init(BuildConfig.SCALE_API_KEY);
    }

    @Test
    public void createCategorization() throws InterruptedException {
        CategorizationTask categorizationTask = new CategorizationTask();
        categorizationTask.instruction = "test";
        categorizationTask.callbackUrl = "http://van.sh";
        categorizationTask.attachmentType = AttachmentType.text;
        categorizationTask.attachment = "thing to categorize";
        categorizationTask.categories = new String[]{"cat 1", "cat 2", "cat 3"};
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
                assertNotNull(response.taskId, response);
            }

            @Override
            public void onError(Exception e) {

            }
        });
        Thread.sleep(3000);
    }
}
