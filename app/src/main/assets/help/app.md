version-1

### 此帮助文档可在左侧滑菜单打开。

<<<<<<< HEAD
[![Q群](https://img.shields.io/badge/Q%E7%BE%A4-124841768-blue.svg)](https://jq.qq.com/?_wv=1027&k=y7WCDjEA) 
[![Issue](https://img.shields.io/badge/Github-Issue-greeb.svg)](https://github.com/jing332/tts-server-android/issues)
[![Dev](https://img.shields.io/github/actions/workflow/status/jing332/tts-server-android/test.yml?label=%E5%BC%80%E5%8F%91%E7%89%88)](https://github.com/jing332/tts-server-android/actions/workflows/test.yml)
=======
[![Q群](https://img.shields.io/badge/Q%E7%BE%A4-点击加入-blue.svg)](https://h5.qun.qq.com/s/hxc6YglYE8) 
[![Issue](https://img.shields.io/badge/Github-Issue-greeb.svg)](https://github.com/mgz0227/tts-server-android/issues)
[![Dev](https://img.shields.io/github/actions/workflow/status/mgz0227/tts-server-android/test.yml?label=%E5%BC%80%E5%8F%91%E7%89%88)](https://github.com/mgz0227/tts-server-android/actions/workflows/test.yml)
>>>>>>> parent of e4afa4a2 (回退)

# TTS Server 
本应用有3个独立功能，通过左侧滑菜单进行切换。


##  1️⃣ 系统TTS
以下4个界面，在右上角更多选项中都有独立的导入、导出功能。您还可在设置中进行全部备份、恢复等操作。 

### 主界面
配置列表，用于管理TTS配置，您可使用分组功能进行一键切换多个配置。
- 可在设置中调换 `编辑`与`试听` 按钮的位置 ( <i>长按编辑按钮进行试听，反之，长按试听按钮进行编辑</i> )

### 朗读规则
用于处理朗读文本，根据用户配置的标签进行匹配TTS配置（如：旁白/对话）。
程序已内置 基于中文的双引号的 `旁白对话` 朗读规则，您可直接进行使用。

### 插件
用于扩展TTS功能，使用JS脚本进行调用互联网的上的TTS接口，如：内置的`Azure插件`。

### 替换规则
用于替换朗读文本进行纠正发音等操作，如：将“你好”替换为“您好”

高级示例：
- 将字数5以内的对话的双引号替换为【】，以达到旁白朗读的目的。
```
(启用正则表达式)
替换规则：(“)(.{1,5})(”)
替换为：【$2】
```

## 👨‍🏫 系统TTS 常见问题 
### 1. 锁屏后一段时间朗读突然停止？
> 在 `系统设置->应用->电池优化` 中将本APP与阅读APP加入电池优化白名单。
> 
> 对于本APP，您可在左侧滑菜单中单击 `电池优化白名单` 进行快捷设置。
> 
> PS: 对于国内系统，您可能还需对后台任务上锁，启用后台权限等操作。

### 2. 段落间隔时间长？
> 一般是由于网络延迟原因，因为 安卓系统TTS 服务的技术限制，导致无法预缓存音频，故每次只能同步获取。

### 3. 启动朗读时提示 `⚠️ 缺少{朗读全部}，...` ?
> 添加一个`朗读全部`类型的TTS配置并启用。或尝试开启多语音选项使用 `标签`配置

### 4. 启动朗读时提示 `⚠️无标签配置，...！`
> 添加一个 `标签` 类型的TTS配置并启用。或尝试关闭多语音选项使用 `朗读全部` 。


## 2️⃣ 系统TTS转发器
用于将安卓系统TTS转为HTTP网络接口形式，便于在网页调用。

## 3️⃣ 微软TTS转发器
用于将Edge大声朗读接口简化为HTTP网络接口形式，便于`开源阅读`进行调用。

这也是`TTS Server`名称的来源:

早期，我将 tts-server-go 移植到安卓，即得名 tts-server-android (Github项目名)