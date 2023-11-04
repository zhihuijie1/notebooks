1：**cmd + r** 打开命令行

2：**conda env list** 查看有哪些编译环境

3：**create --name environment  python=3.6**  创建一个自己的编译环境

4：**activate environment**   进入自己创建的编译环境

5：**conda install tensorflow-gpu=2.0**   在当前的编译环境中安装 tensorflow   注意：python的版本号与tensorflow的版本号要对应好

6：**conda list**  看一下都安装了一些什么

7：安装完成 之后输入如下命令，检验一下当前的tensorflow是否与主机GPU连接

> **python** 
>
> **from tensorflow.python.client import device_lib**
>
> **print(device_lib.list_local_devices())**
>
> 注意：ctrl+z是推出python环境

8：**deactivate environment**   退出当前的编译环境



下载顺序是：1:conda  2：tersorflow  3： pycharm



**conda install pytorch torchvision torchaudio cpuonly -c pytorch**     当前编译环境下进行pytorch的安装

**conda install -c huggingface transformers **   当前编译环境下进行 transformers的安装









