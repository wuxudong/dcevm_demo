# dcevm_demo

*  用不起jrebel，自然也会有免费的替代品 dcevm + hotswap。

*  运行demo:
*  记得事先安装dcevm,并下载hotswap，并替换命令中的{path}
*  export MAVEN_OPTS="-XX:MaxPermSize=128m -Xmx1024m -Xdebug -XXaltjvm=dcevm -javaagent:{path}/hotswap-agent.jar"
*  mvn jetty:run -pl jcevm_test-web

*  访问一下 http://localhost:8080/calc?a=1&b=2   是否得到了 102？

*  更改一下 CalcService里的calc，换成 return a * b + 500;
   然后执行一下 mvn compile

*  重新访问 http://localhost:8080/calc?a=1&b=2 	是否得到了 502？

*  无需重启web服务，支持maven多module。





