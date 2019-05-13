# Args
## 问题描述
1. arguments 可以被处理成flags和values。
1. flags 是单个Character构成，并且前面应该有个-标识。
1. 每个flag应该有0～1个对应的value。
1. args通过schema来识别传入的arguments。
1. schema指定期望数量的flags的types和values。
1. args可以parser出arguments中有效flags的value，value的类型应该与schema中定义的相同
---
## schema
- 分析
1. 我定义schema(flag,type,defaultValue)
- 验证
1. 验证的方式：schema('l',Boolean.class,Boolean.FALSE),解析：支持argument为l,默认值为false
1. 验证的方式：schema('p',Integer.class,0),解析：支持argument为p,默认值为0
1. 验证的方式：schema('d',String.class,""),解析：支持argument为d,默认值为“”
## schemas
- 分析
1. schemas是支持传入多个schema的集合，并能根据传入的flag查找对应schema的value
- 验证
1. 验证方式：schemas.reload(schemaList)，取得schema.getArgValue('l',value)对应类型


