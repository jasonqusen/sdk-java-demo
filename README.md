Java demo for SDK.

## 运行环境:

* Java 1.8
* Maven 3

在项目根目录下运行

    mvn tomcat7:run
    
在浏览器访问 http://localhost:8000 即可.

如果 8000 端口已被占用，可以运行

    mvn tomcat7:run -Dserver.port=其他端口
