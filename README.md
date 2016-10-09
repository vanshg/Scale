#Scale SDK for Android

[![Bintray](https://img.shields.io/bintray/v/vanshg/maven/com.vanshgandhi.scale.svg)](http://jcenter.bintray.com/com/vanshgandhi/scale/scale/)
[![license](https://img.shields.io/badge/license-Apache%202-blue.svg)](https://github.com/vanshg/Scale/blob/master/LICENSE)

##Requirements
* Minimum Andorid SDK Level 8 or higher
* Sign up for an [Scale Developer Account.](https://dashboard.scaleapi.com)

## Usage

Use with Gradle:

```gradle
dependencies {
	compile 'com.vanshgandhi.scale:scale:1.0.0'
}
```
or Maven:
```xml
<dependency>
  <groupId>com.vanshgandhi.scale</groupId>
  <artifactId>scale</artifactId>
  <version>1.0.0</version>
</dependency>
```


### Initalizing The SDK

Initialize the SDK before you make your first request

```java
String apiKey = /*Your Scale API Key here*/;
Scale.init(apiKey);
```

###ScaleCallback
You are required to pass a ScaleCallback to each request that you make (it is Nullable)

```java
ScaleCallback callback = new ScaleCallback<Task>() {
    @Override
    public void onSuccess(Task response) {
        
    }

    @Override
    public void onError(Exception e) {
        
    }
}
```

#Examples
All relevant methods are static methods inside the `Scale` class

###Get Task By ID
```java
Scale.getTask(/*Task ID here*/, new ScaleCallback<Task>() {
    @Override
    public void onSuccess(Task response) {
        
    }

    @Override
    public void onError(Exception e) {
		e.printStackTrace();
    }
});
```
###Create Categorization Task
```java
CategorizationTask categorizationTask = new CategorizationTask();
categorizationTask.setInstruction("What does the text say?")
        .setCallbackUrl("http://van.sh/callback")
        .setAttachmentType(AttachmentType.text)
        .setAttachment("Hi")
        .setCategories(new String[]{"Bye", "Hi", "No"});
Scale.createCategorizationTask(categorizationTask, new ScaleCallback<Task>() {
	@Override
	public void onSuccess(Task response) {
	    
	}
	
	@Override
	public void onError(Exception e) {
	    e.printStackTrace();
	}
});
```

All the other methods are documented in the source code

All model classes utilize a pseudo-Builder method, where each setter returns the object itself, so you can chain setters

#License
Copyright 2016 Vansh Gandhi

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

	http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.