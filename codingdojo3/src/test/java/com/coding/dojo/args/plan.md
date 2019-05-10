# 第一阶段
## 需求拆解
1. 输入为： -l -p 8080 -d /usr/logs 
1. 获取到参数有： l p d
1. 获取的参数值： true  8080  /usr/logs
1. 参数类型：l是Boolean，p是Integer，d是String
1. 参数默认值:l默认为false，p默认为0，d默认为“”
1. 这里有特殊处理：p和d不传或者传参数不传值都取默认值
--------
1. 重构提取参数Argument,
格式：参数1:类型1:默认值1;参数2:类型2:默认值2，
例如：l:bool:false;p:int:0;d:string:

## 验证
1. 传入空参数，返回默认参数对象，值分别为false,0，“”
1. 传入-l, 校验参数合法，为Boolean，值为true
1. 传入-p, 校验参数合法，为Integer类型，值为8080
1. 传入-d, 校验参数合法，为String类型，值为/usr/logs
1. 传入-p 8080 -l -d /usr/logs,校验合法并取得正确的值和类型
