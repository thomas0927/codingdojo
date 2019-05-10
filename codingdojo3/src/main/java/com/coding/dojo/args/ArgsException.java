package com.coding.dojo.args;

class ArgsException extends Throwable {
    private String errorArgumentId;
    // --Commented out by Inspection START (2019/5/10 13:04):
//// --Commented out by Inspection START (2019/5/10 13:04):
////    nspection STOP (2019/5/10 13:04)
//    private String errorParameter = Stringnull;
// --Commented out by Inspection STOP (2019/5/10 13:04)// --Commented out by Inspection (2019/5/10 13:04):private String  errorArgumentId = "";
// --Commented out by I
    private final ErrorCode errorCode;

// --Commented out by Inspection START (2019/5/10 13:04):
    public ArgsException(ErrorCode errorCode, String errorArgumentId, String errorParameter) {
        this.errorCode=errorCode;
        this.errorArgumentId= String.valueOf(errorArgumentId);
        String errorParameter1 = errorParameter;
    }
// --Commented out by Inspection STOP (2019/5/10 13:04)

    public ArgsException(ErrorCode errorCode, String errorArgumentId) {
        this.errorArgumentId= errorArgumentId;
        this.errorCode=errorCode;
    }

    public ArgsException(ErrorCode errorCode) {
        this.errorCode=errorCode;
    }
}
