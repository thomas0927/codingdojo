package com.coding.dojo.args;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ArgsTest {


    @Test(dataProvider = "default_value")
    public void should_return_default_value_when_nothing_input(String schema,String commands,Object[] expectKeyValue){
        Args args=new Args(schema,commands);
        Assert.assertEquals(args.getArgumentValue((String) expectKeyValue[0]),expectKeyValue[1]);
        Assert.assertEquals(args.getArgumentValue((String) expectKeyValue[2]),expectKeyValue[3]);
        Assert.assertEquals(args.getArgumentValue((String) expectKeyValue[4]),expectKeyValue[5]);
    }

    @Test(dataProvider = "example_return_correct")
    public void example_return_correct(String schema,String commands,Object[] expectKeyValue){
        Args args=new Args(schema,commands);
        Assert.assertEquals(args.getArgumentValue((String) expectKeyValue[0]),expectKeyValue[1]);
        Assert.assertEquals(args.getArgumentValue((String) expectKeyValue[2]),expectKeyValue[3]);
        Assert.assertEquals(args.getArgumentValue((String) expectKeyValue[4]),expectKeyValue[5]);
    }

    @DataProvider
    public static Object[][] default_value(){
        return new Object[][]{{"l:bool:false;p:int:0;d:string:","",new Object[]{"l",false,"p",0,"d",""}}};
    }

    @DataProvider
    public static Object[][] example_return_correct(){
        return new Object[][]{{"l:bool:false;p:int:0;d:string:","-l -p 8080 -d /usr/logs",new Object[]{"l",true,"p",8080,"d","/usr/logs"}}};
    }
}
