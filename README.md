# hyperion-firebase-remote-config
[ ![Download](https://api.bintray.com/packages/k-tomoyasu/maven/hyperion-firebase-remote-config/images/download.svg?version=1.0.1) ](https://bintray.com/k-tomoyasu/maven/hyperion-firebase-remote-config/1.0.1/link)  
[hyperion](https://github.com/willowtreeapps/Hyperion-Android) plugin to show [Firebase Remote Config](https://firebase.google.com/docs/remote-config/) key-values.

## ScreenShots
### viewer
![config-viewer](art/plugin-demo.gif)
### firebase console
![console](art/firebase-console.png)

## Installation
Add to build.gradle
```groovy
dependencies {
    debugImplementation "com.willowtreeapps.hyperion:hyperion-core:$hyperion_version"
    debugImplementation "com.fusuma:hyperion-firebase-remote-config:$plugin_version"
}
```

## License
MIT