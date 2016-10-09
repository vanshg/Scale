#Scale SDK for Android

[![Bintray](https://img.shields.io/bintray/v/vanshg/maven/com.vanshgandhi.scale.svg)](http://jcenter.bintray.com/com/vanshgandhi/scale/scale/)
[![license](https://img.shields.io/badge/license-Apache%202-blue.svg)](https://github.com/vanshg/Scale/blob/master/LICENSE)

##Requirements
* Minimum Andorid SDK Level 15 or higher
* Sign up for an [Scale Developer Account.](https://dashboard.scaleapi.com)

## Setup

Use with Gradle:

```gradle
dependencies {
	compile 'com.vanshgandhi.scale:scale:1.0.0'
}
```


### Initalizing The SDK

Initialize the SDK before you make your first request

```java
String apiKey = /*Your Scale API Key here*/;
Scale.init(apiKey);
```

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