# BlogAspectJForLogin
Android通过AspectJ实现AOP检验是否登录功能

aspectj_module集成了AspectJ,可以拿来直接使用.

## 注意
### 在项目根目录的build.gradle中依赖:
```
 dependencies {
        classpath 'com.hujiang.aspectjx:gradle-android-plugin-aspectjx:2.0.0'
 }
```

### 在使用到aspectj_module功能的module,需要在该module的build.gradle中依赖:
```
apply plugin: 'com.hujiang.android-aspectjx'
```

## 使用

```
 @NeedLogin(tipType = NeedLogin.SHOW_TOAST,loginActivity = LoginActivity::class )
        fun startToast(context: Context) {
            val intent = Intent(context, SecondActivity::class.java)
            context.startActivity(intent)
}
```
