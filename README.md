
# 基于Hadoop的视频图像水印应用

> 基于Java实现。

### 使用说明

#### 打包
```
mvn package
```

#### 运行
```
注意这里的作业在运行时，需要等所有的Map任务完成时才能运行Reduce任务。

配置如下：

mapred.reduce.slowstart.completed.maps : 1.0

执行命令：
hadoop jar hadoop-wm-1.0.0-job.jar input-video watermark-image output-video
```

> 注意只能处理.mp4视频和.png图片。

### 开发人员

WeChat: wgybzb

QQ: 1010437118

E-mail: wgybzb@sina.cn