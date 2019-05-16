# Args
## 问题描述
1. arguments 可以被处理成flags和values。
1. flags 是单个Character构成，并且前面应该有个-标识。
1. 每个flag应该有0～1个对应的value。
1. args通过schemas来识别传入的arguments。
1. schemas指定期望数量的flags的types和values。
1. schemas可以拆解为多个schema的集合
1. args可以parser出arguments中有效flags的value，value的类型应该与schema中定义的相同
---
## schema 可以根据给定的类型提供数据
- 分析
1. 我定义schema(type) , **之前我自己定义了defaultValue用于指定默认值** ，这次我简化一下
- 验证
1. 验证的方式：schema(Boolean.class),解析：支持argument为l,默认值为false
1. 验证的方式：schema(Integer.class),解析：支持argument为p,默认值为0
1. 验证的方式：schema(String.class),解析：支持argument为d,默认值为“”
## schemas 可以把字符串形式的Schemas解析成对象
- 分析
1. schemas是支持传入多个schema的集合，并能根据传入的flag查找对应schema的value
- 验证
1. 验证方式：取得schemas.getArgValue('l',value)对应类型的值
## args 可以根据Schema和参数字符串数组获取参数值
1. 传入-x -f 8080 -e /usr/logs ，解析为参数数组
1. 传入x:boolean f:integer e:string a:boolean，解析为schemas
1. args.getValue(参数)，得到正确的值
1. **这里schemas比arguments多**要能正常获取args.getValue('a')

