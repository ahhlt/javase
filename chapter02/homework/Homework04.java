环境变量的配置及其作用

作用：在任意目录下都可以运行java的相关开发工具，实际上
	path环境变量保存了jdk工具的所在目录

步骤：
	1.我的电脑右键 -> 属性 -> 高级系统设置 -> 环境变量
	2.新建系统变量，变量名：JAVA_HOME，变量值：jdk的安装路径如E:\development_tools\jdk\jdk8
	3.找到Path变量 -> 编辑 -> 将JAVA_HOME变量添加到Path变量
	4.添加内容：%JAVA_HOME%\bin;
